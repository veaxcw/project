package com.chengw.shoppingSystemManagemetSytem.veaxdb;

import gui.GUI_Settlement_shoping;
import gui.Login;
import gui.OtherPanels;
import shop.SaleAssitance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.Thread.sleep;
import static veaxdb.goodsSQL.MySQLConn;

public class Authentication extends Login {

    SaleAssitance freshman = new SaleAssitance();
    Connection conn;
    ResultSet res;
    PreparedStatement pstm;
    String query = "select * from salesman";

    public Authentication() {

    }

    public int Authentication(int flag,String usrname,String  password) {
        freshman.setusrname(usrname) ;
        freshman.setpwd(password);
        conn = MySQLConn();
        try {
            pstm = conn.prepareStatement(query);
            res = pstm.executeQuery();
            res.next();//�տ�ʼʱresָ��-1��
            if(true/*freshman.getusrname().equals(res.getString(2)) &&
                        freshman.getpwd().equals(res.getString(3))*/){
                new GUI_Settlement_shoping();
                flag = 5;//��½�ɹ����
            }
            else{
                flag++;
                OtherPanels wrong = new OtherPanels();
                wrong.Wriong_usrnameOrpwd(flag);
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); }finally{
                    wrong.close();
                }
                }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return flag;
        }


    }
}
