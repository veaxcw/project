package com.chengw.shoppingSystemManagemetSytem.gui;




import veaxdb.goodsSQL;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class GUI_Settlement_shoping extends Mainpanel implements  DbGUI{

    private JPanel  Component26;//�ؼ��ֲ�ѯ
    private JPanel  Component27;//ѡ����Ʒ
    private JButton Component28;//����
    private JButton Component29;//�Ƿ�ȷ��
    private JButton Component30;//�ܼ�
    private JButton Component31;//����
    JFrame shoping_settlement = new JFrame();

    private String[] colName = {"ID","����","�۸�","����"};
    private Object[][] data;

    goodsSQL operate = new goodsSQL();

    public GUI_Settlement_shoping(){
        this.setLayout(shopLayout);
        init("�������","�������");
        Menu_init();
        shoping_settlement.setSize(950,300);
        shoping_settlement.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        shoping_settlement.setResizable(true);
        shoping_settlement.add(this );
        shoping_settlement.setVisible(true);


    }
    private void Menu_init(){
        //Component26
        Component26 = querygood();
        shopConstraints.gridx = 0;//������Ͻ��������е��к���
        shopConstraints.gridy = 12;
        shopConstraints.ipady = 0;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component26, shopConstraints);
        //Component27
        Component27 = chooseGoods();
        shopConstraints.gridx = 0;//������Ͻ��������е��к���
        shopConstraints.gridy = 16;
        shopConstraints.ipady = 0;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component27, shopConstraints);
        //Component28
        Component28 = new JButton("3.��Ʒ����");
        shopConstraints.gridx = 22;//������Ͻ��������е��к���
        shopConstraints.gridy = 20;
        shopConstraints.ipady = 0;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component28, shopConstraints);
        //Component29
        Component29 = new JButton("4.�˳�");
        shopConstraints.gridx = 21;//������Ͻ��������е��к���
        shopConstraints.gridy = 24;
        shopConstraints.ipady = 0;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component29, shopConstraints);
        this.add(Component26);
        this.add(Component27);
        this.add(Component28);
        this.add(Component29);
        //Mylistener();

    }

    @Override
    public JPanel querygood() {
        JPanel querygood = new JPanel();
        querygood.setSize(200,100);
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
        query.addActionListener(event->{

            String name = inputfield.getText();
            data = operate.QueryGoods(name);
            JTable table = new JTable(data,colName);
            JScrollPane tableContainer = new JScrollPane(table);
            querygood.remove(tableContainer);
            DefaultTableCellRenderer r = new DefaultTableCellRenderer();//����table���ݾ���
            r.setHorizontalAlignment(JLabel.CENTER);
            table.setDefaultRenderer(Object.class, r);

            table.setPreferredScrollableViewportSize(table.getPreferredSize());//����table����ʾһ��

            querygood.add(tableContainer);
            GUI_Settlement_shoping.this.shoping_settlement.remove(Component26);
            GUI_Settlement_shoping.this.Menu_init();
            GUI_Settlement_shoping.this.shoping_settlement.setVisible(true);

        });
        return  querygood;

    }

    @Override
    public JPanel chooseGoods() {
        return new GUI_goods_maintenance_db().chooseGoods();
    }


}
