package com.chengw.shoppingSystemManagemetSytem.gui;

import veaxdb.Authentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JLabel usrname = new JLabel("�û���");





    private JTextField input_usrname = new JTextField("",12);
    private JLabel password = new JLabel("��    ��");



    private JPasswordField  input_password = new JPasswordField("",12);
    private JButton signup = new JButton("����");
    private JButton login  = new JButton("��½");

    public Login(){
        init();
    }
    private void init() {
        usrname.setHorizontalAlignment(JTextField.CENTER);
        password.setHorizontalAlignment(JTextField.CENTER);
        this.add(usrname);
        this.add(input_usrname);
        this.add(password);
        this.add(input_password);
        this.add(signup);
        this.add(login);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
        this.setSize(230, 170);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int flag = 0;
                Authentication authentication = new Authentication();
                flag = authentication.Authentication(flag, input_usrname.getText(), String.valueOf(input_password.getPassword()));
                if (flag == 4) {//��½���ɹ�������������Ƶ�½
                    Login.this.setVisible(false);
                    Login.this.dispose();
                }
                if (flag == 5) {
                    Login.this.setVisible(false);
                    Login.this.dispose();
                }
            }});
    }


    public String getInput_usrname() {
        return input_usrname.getText();
    }
    public String getInput_password() {
        return String.valueOf(input_password.getPassword());
    }

}

