package com.chengw.shoppingSystemManagemetSytem.gui;

import javax.swing.*;

public class OtherPanels extends JFrame {
    public void successSave(){
        JLabel label = new JLabel("�ɹ������Ʒ");
        label.setHorizontalAlignment(JLabel.CENTER);
        this.setSize(200,100);
        this.setLocation(200,250);
        this.setResizable(false);
        this.add(label);
        this.setVisible(true);
    }

    public void successDel(){
        JLabel label = new JLabel("�ɹ�ɾ����Ʒ");
        label.setHorizontalAlignment(JLabel.CENTER);
        this.setSize(200,100);
        this.setLocation(200,250);
        this.setResizable(false);
        this.add(label);
        this.setVisible(true);
    }


    public void QueryLable(){
        JPanel querylable = new JPanel();

    }

    public void Wriong_usrnameOrpwd(int flag){
        JLabel label = new JLabel("�û��������������" + "\n" + "ʣ��" + flag + "/4��");
        label.setHorizontalAlignment(JLabel.CENTER);
        this.setSize(200,100);
        this.setLocation(200,250);
        this.setResizable(false);
        this.add(label);
        this.setVisible(true);
    }

    public void close(){
        this.setVisible(false);
        this.removeAll();
        this.dispose();
    }
}
