package com.chengw.shoppingSystemManagemetSytem.frame;


import gui.Mainpanel;

import javax.swing.*;


public class Frame extends JFrame {
    private static final int FRAME_WIDTH = 950;//��Ϊ300����
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 150;//λ��
    private static final int FRAME_Y_ORIGIN = 250;


    private Mainpanel mainpanel = new Mainpanel(this);
    public Frame() {
        init();
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        this.setTitle("shop managemaent System");
        this.setResizable(false);
        this.setVisible(true);
    }

    private void init() {
        this.add(mainpanel);
    }
    public void close(){
        this.setVisible(false);
        this.dispose();
    }
}
