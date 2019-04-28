package com.chengw.shoppingSystemManagemetSytem.gui;


import frame.Frame;
import shop.Goods;
import veaxdb.goodsSQL;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;


public class GUI_goods_maintenance_db extends JFrame{

    private Frame frame;
    private String[] colName = {"ID","����","�۸�","����"};

    goodsSQL operate = new goodsSQL();
    Object[][] data;

    //JFrame Jframe = new JFrame();
    JPanel addgoods = new JPanel();
    JPanel showallgoods = new JPanel();
    JPanel deletegood = new JPanel();
    JPanel querygood = new JPanel();
    JPanel modifygood = new JPanel();
    JPanel chooseGoods = new JPanel();

    public void AddGoods(){
        addgoods.removeAll();
        Goods good = new Goods();
        this.setLayout(new FlowLayout());
        JButton save = new JButton("����");
        JTextField[] jf = {new JTextField("����",6),new JTextField("",12),
                new JTextField("�۸�",6),new JTextField("",12),
                new JTextField("����",6),new JTextField("",12)};
        for(int i = 0; i < 6; i+= 2){
            jf[i].setHorizontalAlignment(JTextField.CENTER);//������ʾ
            jf[i].setEnabled(false);
        }
        for(int j = 0; j < jf.length; j++){
            addgoods.add(jf[j]);
        }
        addgoods.add(save);
        this.add(addgoods);
        init(700,200);
        save.addActionListener(event->{
            good.setname(jf[1].getText());
            good.setprice(Float.parseFloat(jf[3].getText()));
            good.setid(Integer.parseInt(jf[5].getText()));
            goodsSQL add = new goodsSQL(good);
            add.addGoods();
        });
        
    }

    public void DelGoods(){//ɾ����Ʒ
        clean();
        deletegood.removeAll();
        deletegood.setLayout(new FlowLayout());
        JButton del = new JButton("ɾ��");
        JLabel label = new JLabel("��Ʒ����");
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        JTextField input = new JTextField("",12);
        deletegood.add(label);
        deletegood.add(input);
        deletegood.add(del);
        this.add(deletegood);
        init(600,200);
        del.addActionListener(event->{
            String name = input.getText();
            operate.delGoods(name);
        });
        
    }

    public JPanel QueryGoods(){
        clean();
        querygood.removeAll();
        querygood.setLayout(new FlowLayout());
        JButton query = new JButton("��ѯ");
        JLabel label = new JLabel("��Ʒ����");
        //JLabel jl_ID = new JLabel("���");
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        JTextField inputfield = new JTextField("",12);
        //JTextField jf_ID = new JTextField("",12);
        querygood.add(label);
        querygood.add(inputfield);
        querygood.add(query);
        this.add(querygood);
        init(800,200);
        query.addActionListener(event->{
            String name = inputfield.getText();
            //int ID = Integer.parseInt(jf_ID.getText());
            data = operate.QueryGoods(name);
            JTable table = new JTable(data,colName);
            JScrollPane tableContainer = new JScrollPane(table);
            DefaultTableCellRenderer r = new DefaultTableCellRenderer();//����table���ݾ���
            r.setHorizontalAlignment(JLabel.CENTER);
            table.setDefaultRenderer(Object.class, r);
            table.setPreferredScrollableViewportSize(table.getPreferredSize());//����table����ʾһ��
            querygood.add(tableContainer);
            this.add(querygood);
            this.setVisible(false);
            init(800,200);
        });
        return  querygood;
        
    }

    public void ShowAllGoods(){
        showallgoods.removeAll();
        clean();
        data = operate.QueryGoods();
        JTable table = new JTable(data,colName);
        JScrollPane tableContainer = new JScrollPane(table);

        DefaultTableCellRenderer r = new DefaultTableCellRenderer();//����table���ݾ���
        r.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, r);
        showallgoods.add(tableContainer);
        this.add(showallgoods);
        init(600,200);
        
    }

    public void ModifyGoods(){
        clean();
        modifygood.removeAll();
        JLabel label = new JLabel("�����޸���Ʒ������");
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        JTextField inputfield = new JTextField("",12);
        JButton query = new JButton("��ѯ");

        modifygood.add(label);
        modifygood.add(inputfield);
        modifygood.add(query);

        this.add(modifygood);
        init(800,200);
        query.addActionListener(event->{
            this.removeAll();
            String name = inputfield.getText();

            data = operate.QueryGoods(name);


            JTable table = new JTable(data,colName);
            JScrollPane tableContainer = new JScrollPane(table);
            DefaultTableCellRenderer r = new DefaultTableCellRenderer();//����table���ݾ���
            r.setHorizontalAlignment(JLabel.CENTER);
            table.setDefaultRenderer(Object.class, r);
            table.setPreferredScrollableViewportSize(table.getPreferredSize());//����table����ʾһ��
            modifygood.add(tableContainer);

            this.add(modifygood);
            this.setVisible(false);
            init(800,200);//ִ��һ�β�ѯ����ʾ�޸�ǰ����

            JLabel label_Modi = new JLabel("��ʾ�����޸�����");

            JLabel label_name = new JLabel("����");
            label.setBorder(BorderFactory.createLineBorder(Color.black));
            JTextField input_name = new JTextField("",12);

            JLabel label_price = new JLabel("�۸�");
            label.setBorder(BorderFactory.createLineBorder(Color.black));
            JTextField input_price = new JTextField("",12);

            JLabel label_num = new JLabel("����");
            label.setBorder(BorderFactory.createLineBorder(Color.black));
            JTextField input_num = new JTextField("",12);

            JButton modi = new JButton("�޸�");

            modifygood.add(label_Modi);
            modifygood.add(label_name);
            modifygood.add(input_name);
            modifygood.add(label_price);
            modifygood.add(input_price);
            modifygood.add(label_num);
            modifygood.add(input_num);
            modifygood.add(modi);

            this.setVisible(false);//ɵ��ʽˢ��ҳ��
            this.add(modifygood);
            init(800,200);

            modi.addActionListener(e -> {
                String name_Modi;
                float price_Modi;
                int num_Modi;
                int id = Integer.parseInt(data[0][0].toString());//��ȡ��Ʒ���

                if(input_name.getText().isEmpty())//Ϊ���򱣳ֲ���
                name_Modi = name;
                else
                name_Modi = input_name.getText();

                if(input_price.getText().isEmpty())
                    price_Modi = Float.parseFloat(data[0][2].toString());
                else
                    price_Modi = Float.parseFloat(input_price.getText());

                if(input_num.getText().isEmpty())
                    num_Modi = Integer.parseInt(data[0][3].toString());
                else
                    num_Modi = Integer.parseInt(input_num.getText());


                int flag  = operate.ModifyGoodsInfo(id,name_Modi, price_Modi,num_Modi);

                JLabel Success_modi = new JLabel("�޸ĳɹ�");

                modifygood.add(Success_modi);
                this.add(modifygood);
                this.setVisible(false);
                init(800,200);

            });
        });
        
    }

    public JPanel chooseGoods(){
        JLabel plsChooseGoods = new JLabel("��ѡ����Ʒ");
        plsChooseGoods.setHorizontalAlignment(JLabel.CENTER);
        JTextField input_Field = new JTextField("",12);
        //��������
        JLabel plsInputhNum = new JLabel("����������");
        plsChooseGoods.setHorizontalAlignment(JLabel.CENTER);
        JTextField input_Field_Num = new JTextField("",12);
        JButton confirm = new JButton("ȷ��");
        chooseGoods.setLayout(new FlowLayout());
        chooseGoods.add(plsChooseGoods);
        chooseGoods.add(input_Field);
        chooseGoods.add(plsInputhNum);
        chooseGoods.add(input_Field_Num);
        chooseGoods.add(confirm);
        return chooseGoods;
    }

    public void exit(){
    }

    private void init(int width,int heigh){
        this.setSize(width,heigh);
        this.setLocation(150,250);
        this.setResizable(true);
        this.setVisible(true);
    }

    private void clean(){
        this.remove(deletegood);
        this.remove(showallgoods);
        this.remove(querygood);
        this.remove(modifygood);
        this.remove(addgoods);
    }

}

