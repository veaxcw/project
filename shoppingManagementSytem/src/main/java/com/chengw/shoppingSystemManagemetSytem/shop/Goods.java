package com.chengw.shoppingSystemManagemetSytem.shop;

public class Goods {
	private int id;
	private String name;
	private float price;
	private int num;
	//�ֱ�����Ʒ��ţ����֣��۸�����
	public Goods(){

	}
	public Goods(String name,int price,int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}
	//��Ʒȫ����Ϣ
	public Goods(int id,String name,float price,int num) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.num = num;
	}
	//�޸���Ʒ�۸�����
	public Goods(float price,int num) {
		this.price = price;
		this.num = num;
	}
	public int getid() {
		return this.id;
	}
	public String getname() {
		return this.name;
	}
	public float getprice() {
		return this.price;
	}
	public int getnum() {
		return this.num;
	}
	public void setid(int id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setprice(float price) {
		this.price = price;
	}
	public void setnum(int num) {
		this.num = num;
	}

}
