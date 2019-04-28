package com.chengw.shoppingSystemManagemetSytem.veaxdb;

import gui.OtherPanels;
import shop.Goods;

import java.sql.*;
import java.util.Scanner;

public class goodsSQL {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/shop?" +
			"useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";//�α겻�α��ķ���
	private static String username = "root";
	private static String password = "1214";
	private static String sql = "select * from goodsinfo";
	PreparedStatement pstm = null;//�ö�������ִ�ж�̬��SQL���
	Connection con = null;
	ResultSet res = null;//��ѯ���
    private Goods good;

    Object[][] data;


	public goodsSQL() {
	}

	public goodsSQL(Goods good){
        this.good = good;

    }
    //�������ݿ�
	public  static Connection MySQLConn(){
		Connection conn = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			if(!conn.isClosed()){
				System.out.println("Success Connected to MySQL");
				return conn;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return conn;

	}
	//�����ݿ���������Ʒ
	public boolean addGoods() {
		boolean bool = false;
		con = MySQLConn();//�������ݿ�
		CreatTable();//����shop��
		String sql = "INSERT INTO goodsinfo(����,�۸�,����) VALUES(?,?,?)";//�������Ҫ�����ݿ��б��������ͬ
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, good.getname());
			pstm.setFloat(2, good.getprice());
			pstm.setInt(3, good.getnum());
			int rs = pstm.executeUpdate();
			if(rs > 0) {
                new OtherPanels().successSave();
				bool = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		return bool;
		
	}
	//�����������statementд��  ��ͷ���ܵø�
	public void CreatTable(){//������
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		String Creat_Table = "CREATE TABLE if not exists goodsinfo (" +
				"��� int AUTO_INCREMENT" + " PRIMARY KEY," +
				"���� varchar(10)," +
				"�۸� float ," +
				"���� int" +
				")ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=gbk;";//�������

		try{
			conn = MySQLConn();
			pstmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			pstmt.executeUpdate(Creat_Table);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	//ɾ����Ʒ
	public boolean delGoods(String name){
    	boolean bool = false;
    	con = MySQLConn();
    	String del = "delete from goodsinfo where ���� = ?";
		try {
			pstm = con.prepareStatement(del);
			pstm.setString(1,name);
			int rs = pstm.executeUpdate();
			if(rs > 0) {
				new OtherPanels().successDel();
				bool = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			bool = true;
		}
		return bool;
	}
	//��ѯ��Ʒ
	public Object[][] QueryGoods(String name){
		boolean bool = false;
		con = MySQLConn();
		String query = "select * from goodsinfo where ���� = ?";
		try {
			pstm = con.prepareStatement(query);
			pstm.setString(1,name);
			//pstm.setInt(2, id);
			res = pstm.executeQuery();//�˴�����Ҫ�����´���query
            res.next();
			int row = res.getRow();
			data = new Object[row][4];
			for(int i = 0; i < data[row - 1].length; i++){
				data[row - 1][i] = res.getString(i+1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e){
		    e.printStackTrace();
        }
            finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return data;
		}

	}
	//��ѯ����ʾ������Ʒ
	public Object[][] QueryGoods(){boolean bool = false;
        con = MySQLConn();
        String query = "select * from goodsinfo ";
        try {
            pstm = con.prepareStatement(query);
            res = pstm.executeQuery();//�˴�����Ҫ�����´���query
            res.afterLast();
            res.previous();
            int row = res.getRow();
            data = new Object[row][4];
            res.first();
            for (int j = 0; j < data.length; j++,res.next()) {
            	for(int i = 0; i < data[row - 1].length; i++){
            		data[j][i] = res.getString(i+1);
                    }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return data;
        }


    }

    public int ModifyGoodsInfo(int id,String name_Modi,float price_Modi,int num_Mody){
	    int flag = 0;
		try {
			con = MySQLConn();
			String modify = "update goodsinfo set ���� = ? , �۸� = ? , ���� = ? where ��� = ?";
			pstm = con.prepareStatement(modify);
			pstm.setString(1,name_Modi);
			pstm.setFloat(2,price_Modi);
			pstm.setInt(3,num_Mody);
			pstm.setInt(4,id);
			flag = pstm.executeUpdate();
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	//��ȡÿ�е�����
	public String[] getColName(){
		int count;
		String[] ColName = null;
		try {
			Connection conn = MySQLConn();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();//MetaData:data about data(�������Ϊ�������߽��ͺ��������)
			count = rsmd.getColumnCount();//�����е���Ŀ
			ColName = new String[count];
			for(int i = 0;i < count; i++)
				ColName[i] = rsmd.getColumnName(i + 1);//���ص�i+1�е�����
			rs.close();
			conn.close();
			return ColName;
		}catch (Exception e){
			e.printStackTrace();
		}
		return ColName;
	}

	public void MySQL_read(){//����Statementִ�в�ѯ����
		try{
			Connection conn = MySQLConn();
			Statement stmt = conn.createStatement();//����ִ�в���������SQL���
			// PreparedStatement ��������ִ�д��򲻴� IN ������Ԥ���� SQL ��䣻
			//CallableStatement ��������ִ�ж����ݿ��Ѵ洢���̵ĵ��á�

			ResultSet rs = stmt.executeQuery(sql);
			rs.last();//��λ�����һ��
			int row = rs.getRow();
			rs.beforeFirst();
			data = new Object[row][10];
			int i = 0;
			while(rs.next()){
				data[i][0] = rs.getString(1);
				data[i][1] = rs.getString(2);
				data[i][2] = rs.getString(3);
				data[i][3] = rs.getString(4);
				i++;
			}
			rs.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
