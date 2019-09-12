package com.chengw.mineclearance.model;


import lombok.Data;

import javax.swing.JLabel;

/**
 * @author chengw
 */
@Data
public class Mine extends JLabel{

	private static final long serialVersionUID = 1L;
	private boolean mineTag ;
	private boolean flagTag;
	private boolean numTag;
	private int rowX;
	private int colY;
	private int countAround;
	private int leftClickCount;
	private int rightClickCount;
	public Mine(int x,int y) {
		this.rowX = x;
		this.colY = y;
	}
	public boolean isMineTag() {
		return mineTag;
	}
	public boolean isNumTag() {
		return flagTag;
	}
	public boolean isFlagTag() {
		return flagTag;
	}

	

}
