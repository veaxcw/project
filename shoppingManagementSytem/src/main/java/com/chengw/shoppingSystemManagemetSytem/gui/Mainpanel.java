package com.chengw.shoppingSystemManagemetSytem.gui;

import javax.swing.*;
import java.awt.*;


import frame.Frame;


public class Mainpanel extends JPanel{
    private Frame frame;
    private JButton Component26;
    private JButton Component27;
    private JButton Component28;
    private JButton Component29;

    GridBagLayout shopLayout = new GridBagLayout();//ʵ�������񲼾ֹ�����
    GridBagConstraints shopConstraints = new GridBagConstraints();//ʵ����Լ������

    public Mainpanel() {

    }
    public Mainpanel(Frame frame){
        this.frame = frame;
        this.setLayout(shopLayout);
        init("������","ϵͳ������");
        menue_init();

    }
    protected void init(String ProcessingName,String ScreenName){
        shopConstraints.fill = GridBagConstraints.BOTH;//����������������
        //Component1
        JLabel Component1 = new JLabel("Demo");
        Component1.setHorizontalAlignment(JLabel.CENTER);
        Component1.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 0;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 8;
        shopConstraints.gridheight = 4;
        shopConstraints.weightx = 1;
        shopConstraints.weighty = 0.1;//�����ڷŴ�ʱ�߶Ȳ���
        shopLayout.setConstraints(Component1, shopConstraints);
        //Component2
        JLabel Component2 = new JLabel("��ϵͳ");
        Component2.setHorizontalAlignment(JLabel.CENTER);
        Component2.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 8;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component2, shopConstraints);
        //Component3
        JLabel Component3 = new JLabel("		");
        Component3.setHorizontalAlignment(JLabel.CENTER);
        Component3.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 12;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 8;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component3, shopConstraints);
        //Component4
        JLabel Component4 = new JLabel("ҵ����");
        Component4.setHorizontalAlignment(JLabel.CENTER);
        Component4.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 20;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component4, shopConstraints);
        //Component5
        JLabel Component5 = new JLabel("		");
        Component5.setHorizontalAlignment(JLabel.CENTER);
        Component5.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 24;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 8;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component5, shopConstraints);
        //Component6
        JLabel Component6 = new JLabel("ȷ��");
        Component6.setHorizontalAlignment(JLabel.CENTER);
        Component6.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 32;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 3;
        shopConstraints.gridheight = 1;
        shopLayout.setConstraints(Component6, shopConstraints);
        //Component7
        JLabel Component7 = new JLabel("���");
        Component7.setHorizontalAlignment(JLabel.CENTER);
        Component7.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 35;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 3;
        shopConstraints.gridheight = 1;
        shopLayout.setConstraints(Component7, shopConstraints);
        //Component8
        JLabel Component8 = new JLabel("������");
        Component8.setBorder(BorderFactory.createLineBorder(Color.black));
        Component8.setHorizontalAlignment(JLabel.CENTER);
        shopConstraints.gridx = 38;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 3;
        shopConstraints.gridheight = 1;
        shopLayout.setConstraints(Component8, shopConstraints);
        //Component9
        JLabel Component9 = new JLabel("�����");
        Component9.setBorder(BorderFactory.createLineBorder(Color.black));
        Component9.setHorizontalAlignment(JLabel.CENTER);
        shopConstraints.gridx = 41;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = 3;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component9, shopConstraints);
        //Component10
        JLabel Component10 = new JLabel("	");
        Component10.setBorder(BorderFactory.createLineBorder(Color.black));
        Component10.setHorizontalAlignment(JLabel.CENTER);
        shopConstraints.gridx = 44;//������Ͻ��������е��к���
        shopConstraints.gridy = 0;
        shopConstraints.gridwidth = GridBagConstraints.REMAINDER;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component10, shopConstraints);
        //Component11
        JLabel Component11 = new JLabel("������");
        Component11.setBorder(BorderFactory.createLineBorder(Color.black));
        Component11.setHorizontalAlignment(JLabel.CENTER);
        shopConstraints.gridx = 8;
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component11, shopConstraints);
        //Component12
        JLabel Component12 = new JLabel(ProcessingName);
        Component12.setHorizontalAlignment(JLabel.CENTER);
        Component12.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 12;//������Ͻ��������е��к���
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = 8;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component12, shopConstraints);
        //Component13
        JLabel Component13 = new JLabel("����");
        Component13.setHorizontalAlignment(JLabel.CENTER);
        Component13.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 20;//������Ͻ��������е��к���
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component13, shopConstraints);
        //Component14
        JLabel Component14 = new JLabel();
        Component14.setHorizontalAlignment(JLabel.CENTER);
        Component14.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 24;//������Ͻ��������е��к���
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = 8;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component14, shopConstraints);
        //Component15
        JLabel Component15 = new JLabel();
        Component15.setHorizontalAlignment(JLabel.CENTER);
        Component15.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 32;//������Ͻ��������е��к���
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = 3;
        shopConstraints.gridheight = 3;
        shopLayout.setConstraints(Component15, shopConstraints);
        //Component16
        JLabel Component16 = new JLabel();
        Component16.setHorizontalAlignment(JLabel.CENTER);
        Component16.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 35;//������Ͻ��������е��к���
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = 3;
        shopConstraints.gridheight = 3;
        shopLayout.setConstraints(Component16, shopConstraints);
        //Component17
        JLabel Component17 = new JLabel();
        Component17.setHorizontalAlignment(JLabel.CENTER);
        Component17.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 38;//������Ͻ��������е��к���
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = 3;
        shopConstraints.gridheight = 3;
        shopLayout.setConstraints(Component17, shopConstraints);
        //Component18
        JLabel Component18 = new JLabel("�汾");
        Component18.setHorizontalAlignment(JLabel.CENTER);
        Component18.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 41;//������Ͻ��������е��к���
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = 3;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component18, shopConstraints);
        //Component19
        JLabel Component19 = new JLabel();
        Component19.setHorizontalAlignment(JLabel.CENTER);
        Component19.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 44;//������Ͻ��������е��к���
        shopConstraints.gridy = 2;
        shopConstraints.gridwidth = GridBagConstraints.REMAINDER;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component19, shopConstraints);
        //Component20
        JLabel Component20 = new JLabel("�������");
        Component20.setHorizontalAlignment(JLabel.CENTER);
        Component20.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 0;//������Ͻ��������е��к���
        shopConstraints.gridy = 4;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component20, shopConstraints);
        //Component21
        JLabel Component21 = new JLabel("JAVA");
        Component21.setHorizontalAlignment(JLabel.CENTER);
        Component21.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 4;//������Ͻ��������е��к���
        shopConstraints.gridy = 4;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component21, shopConstraints);
        //Component22
        JLabel Component22 = new JLabel("����ID");
        Component22.setHorizontalAlignment(JLabel.CENTER);
        Component22.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 8;//������Ͻ��������е��к���
        shopConstraints.gridy = 4;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component22, shopConstraints);
        //Component23
        JLabel Component23 = new JLabel();
        Component23.setHorizontalAlignment(JLabel.CENTER);
        Component23.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 12;//������Ͻ��������е��к���
        shopConstraints.gridy = 4;
        shopConstraints.gridwidth = 8;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component23, shopConstraints);
        //Component24
        JLabel Component24 = new JLabel("��������");
        Component24.setHorizontalAlignment(JLabel.CENTER);
        Component24.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 20;//������Ͻ��������е��к���
        shopConstraints.gridy = 4;
        shopConstraints.gridwidth = 6;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component24, shopConstraints);
        //Component25
        JLabel Component25 = new JLabel(ScreenName);
        Component25.setHorizontalAlignment(JLabel.CENTER);
        Component25.setBorder(BorderFactory.createLineBorder(Color.black));
        shopConstraints.gridx = 26;//������Ͻ��������е��к���
        shopConstraints.gridy = 4;
        shopConstraints.gridwidth = 25;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component25, shopConstraints);


        //�������ӵ������м�ȥ
        this.add(Component1);
        this.add(Component2);
        this.add(Component3);
        this.add(Component4);
        this.add(Component5);
        this.add(Component6);
        this.add(Component7);
        this.add(Component8);
        this.add(Component9);
        this.add(Component10);
        this.add(Component11);
        this.add(Component12);
        this.add(Component13);
        this.add(Component14);
        this.add(Component15);
        this.add(Component16);
        this.add(Component17);
        this.add(Component18);
        this.add(Component19);
        this.add(Component20);
        this.add(Component21);
        this.add(Component22);
        this.add(Component23);
        this.add(Component24);
        this.add(Component25);

    }
    private void menue_init(){
        //Component26
        Component26 = new JButton("1.��Ʒά��");
        shopConstraints.gridx = 22;//������Ͻ��������е��к���
        shopConstraints.gridy = 12;
        shopConstraints.ipady = 0;
        shopConstraints.gridwidth = 4;
        shopConstraints.gridheight = 2;
        shopLayout.setConstraints(Component26, shopConstraints);
        //Component27
        Component27 = new JButton("2.ǰ̨����");
        shopConstraints.gridx = 22;//������Ͻ��������е��к���
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
        Mylistener();
    }
    private void Mylistener(){
        Component26.addActionListener(event->{
             new Goods_Maintenance();
        });
        Component27.addActionListener(e->{
            new Login();
        });
        Component29.addActionListener(e->{
            frame.close();
        });


    }

}
