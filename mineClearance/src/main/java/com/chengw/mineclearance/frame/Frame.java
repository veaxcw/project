
package com.chengw.mineclearance.frame;

import com.chengw.mineclearance.gui.JMenuBomb;
import com.chengw.mineclearance.gui.JPanelBomb;
import com.chengw.mineclearance.laymine.EssentialInfo;

import javax.swing.JFrame;



/**
 * @author chengw
 */
public class Frame extends JFrame{


	private static final long serialVersionUID = 1L;
	private JMenuBomb menuBar = new JMenuBomb(this);
	private JPanelBomb bombPanel = new JPanelBomb(this);
	public Frame() {
		init();
		this.setIconImage(EssentialInfo.imageIcon.getImage());
		this.setTitle("扫雷");
		this.setSize(EssentialInfo.allrow*55, EssentialInfo.allcol*55);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	private void init() {
		this.setJMenuBar(menuBar);
		this.add(bombPanel);
	}
	public void restartGame() {
		this.remove(bombPanel);
		EssentialInfo.bombCount = EssentialInfo.allcount;
		EssentialInfo.isStart = false;
		this.remove(menuBar);
		this.setVisible(false);
		bombPanel = new JPanelBomb(this);
		this.add(bombPanel);
		new Frame();
	}
	

}
