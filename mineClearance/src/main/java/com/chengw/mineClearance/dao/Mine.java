package com.chengw.mineClearance.dao;

import javax.swing.JLabel;

public class Mine extends JLabel{

	private static final long serialVersionUID = 1L;
	private boolean mineTag ;
	private boolean flagTag;
	private int rowx;
	private int coly;
	private int countAround;
	private int leftClickCount;
	private int rightClickCount;
	public Mine(int x,int y) {
		this.rowx = x;
		this.coly = y;
	}
	public boolean isMineTag() {
		return mineTag;
	}
	public void setMineTag(boolean mineTag) {
		this.mineTag = mineTag;
	}
	
	public boolean isFlagTag() {
		return flagTag;
	}
	public void setFlagTag(boolean flagTag) {
		this.flagTag = flagTag;
	}
	public int getRowx() {
		return rowx;
	}
	public void setRowx(int rowx) {
		this.rowx = rowx;
	}
	public int getColy() {
		return coly;
	}
	public void setColy(int coly) {
		this.coly = coly;
	}
	public int getCountAround() {
		return countAround;
	}
	public void setCountAround(int countAround) {
		this.countAround = countAround;
	}
	public int getLeftClickCount() {
		return leftClickCount;
	}
	public void setLeftClickCount(int leftClickCount) {
		this.leftClickCount = leftClickCount;
	}
	public int getRightClickCount() {
		return rightClickCount;
	}
	public void setRightClickCount(int rightClickCount) {
		this.rightClickCount = rightClickCount;
	}
	

}
