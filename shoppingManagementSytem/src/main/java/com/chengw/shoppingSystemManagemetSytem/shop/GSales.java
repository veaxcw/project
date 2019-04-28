package com.chengw.shoppingSystemManagemetSytem.shop;

public class GSales {
	private int gid;
	private int sid;
	private int snum;
	
	private String name;
	private int num;
	private float price;
	private float allsum;
	
	public GSales(int gid,int sid,int snum) {
		this.gid = gid;
		this.sid = sid;
		this.snum = snum;
	}
	public GSales(String name,int num,float price,float allsum) {
		this.name = name;
		this.num = num;
		this.price = price;
		this.allsum = allsum;
	}
	//get???
	public int getgid() {
		return gid;
	}
	public int getsnum() {
		return snum;
	}
	public int getsid() {
		return sid;
	}
	//set gid sum sid
	public void setgid(int gid) {
		this.gid = gid;
	}
	public void setsid(int sid) {
		this.sid = sid;
	}
	public void setsnum(int snum) {
		this.snum = snum;
	}
	//get������Ʒ����
	public int getnum() {
		return num;
	}
	public float getprice() {
		return price;
	}
	public String getname() {
		return name;
	}
	public float getallsum() {
		return allsum;
	}
	//setnum�ȵ�
	public void setnum(int num) {
		this.num = num;
	}
	public void setprice(float price) {
		this.price = price;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setallsum(float allsum) {
		this.allsum = allsum;
	}

}
