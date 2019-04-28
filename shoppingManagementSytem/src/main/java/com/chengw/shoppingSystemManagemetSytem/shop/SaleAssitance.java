package com.chengw.shoppingSystemManagemetSytem.shop;

public class SaleAssitance {
	private int sid;
	private String usrname;
	private String pwd;

	public SaleAssitance() {
	}

	//��֤id������
	public SaleAssitance(int sid,String pwd){
		this.sid = sid;
		this.pwd = pwd;
	}
	//��ѯ
	public SaleAssitance(int sid,String usrname,String pwd) {
		this.usrname = usrname;
		this.sid = sid;
		this.pwd = pwd;
	}
	//������
	public void addfreshman(String usrname,String pwd) {
		this.usrname = usrname;
		this.pwd = pwd;
	}
	//get set
	public int getsid() {
		return sid;
	}
	public String getusrname() {
		return usrname;
	}
	public String getpwd() {
		return pwd;
	}
	
	public void setsid(int sid) {
		this.sid = sid;
	}
	public void setusrname(String usrname) {
		this.usrname = usrname;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}

}
