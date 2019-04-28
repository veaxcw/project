package com.chengw.shoppingSystemManagemetSytem.gui;


import frame.Frame;

import javax.swing.*;


public class Goods_Maintenance extends Mainpanel{
    private Frame frame;
    private JButton Component26;//�����Ʒ
    private JButton Component27;//ɾ����Ʒ
    private JButton Component28;//������Ʒ
    private JButton Component29;//��ʾ������Ʒ
    private JButton Component30;//��ѯ��Ʒ
    private JButton Component31;

    GUI_goods_maintenance_db operate = new GUI_goods_maintenance_db();
    JFrame goods_maintence  = new JFrame();

    public Goods_Maintenance(){
        this.setLayout(shopLayout);
        super.init("��Ʒά��","��Ʒά������ ");
        menue_init();
    }
    private void menue_init(){

       //Component26
       Component26 = new JButton("1.�����Ʒ");
       shopConstraints.gridx = 22;//������Ͻ��������е��к���
       shopConstraints.gridy = 12;
       shopConstraints.ipady = 0;
       shopConstraints.gridwidth = 4;
       shopConstraints.gridheight = 2;
       shopLayout.setConstraints(Component26, shopConstraints);
       //Component27
       Component27 = new JButton("2.ɾ����Ʒ");
       shopConstraints.gridx = 22;//������Ͻ��������е��к���
       shopConstraints.gridy = 16;
       shopConstraints.ipady = 0;
       shopConstraints.gridwidth = 4;
       shopConstraints.gridheight = 2;
       shopLayout.setConstraints(Component27, shopConstraints);
       //Component28
       Component28 = new JButton("3.������Ʒ");
       shopConstraints.gridx = 22;//������Ͻ��������е��к���
       shopConstraints.gridy = 20;
       shopConstraints.ipady = 0;
       shopConstraints.gridwidth = 4;
       shopConstraints.gridheight = 2;
       shopLayout.setConstraints(Component28, shopConstraints);
       //Component29
       Component29 = new JButton("4.��ʾ������Ʒ");
       shopConstraints.gridx = 26;//������Ͻ��������е��к���
       shopConstraints.gridy = 12;
       shopConstraints.ipady = 0;
       shopConstraints.gridwidth = 4;
       shopConstraints.gridheight = 2;
       shopLayout.setConstraints(Component29, shopConstraints);

       //Component30
       Component30 = new JButton("5.��ѯ��Ʒ");
       shopConstraints.gridx = 26;//������Ͻ��������е��к���
       shopConstraints.gridy =  16;
       shopConstraints.ipady = 0;
       shopConstraints.gridwidth = 4;
       shopConstraints.gridheight = 2;
       shopLayout.setConstraints(Component30, shopConstraints);

       Component31 = new JButton("6.����");
       shopConstraints.gridx = 26;//������Ͻ��������е��к���
       shopConstraints.gridy = 20;
       shopConstraints.ipady = 0;
       shopConstraints.gridwidth = 4;
       shopConstraints.gridheight = 2;
       shopLayout.setConstraints(Component31, shopConstraints);

       //�������ӵ������м�ȥ
       this.add(Component26);
       this.add(Component27);
       this.add(Component28);
       this.add(Component29);
       this.add(Component30);
       this.add(Component31);

       goods_maintence.add(this);
       goods_maintence.setTitle("��Ʒά��");
       goods_maintence.setSize(950,300);
       goods_maintence.setLocation(200,200);
       goods_maintence.setResizable(true);
       goods_maintence.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       goods_maintence.setVisible(true);

       actionLister();
   }

    private void actionLister(){
        Component26.addActionListener(event->{
            operate.AddGoods();
        });
       Component27.addActionListener(event->{
           operate.DelGoods();
       });
       Component28.addActionListener(event->{
           operate.ModifyGoods();
       });
       Component29.addActionListener(event->{
           operate.ShowAllGoods();
       });
       Component30.addActionListener(event->{
           operate.QueryGoods();
       });
       Component31.addActionListener(event->{
           Goods_Maintenance.this.goods_maintence.setVisible(false);//������20190118
       });

   }
}
