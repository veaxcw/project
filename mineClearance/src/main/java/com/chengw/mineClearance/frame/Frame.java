
package com.chengw.mineClearance.frame;

import com.chengw.mineClearance.gui.JMenuBomb;
import com.chengw.mineClearance.gui.JPanelBomb;
import com.chengw.mineClearance.laymine.EssentialInfo;

import javax.swing.JFrame;



/**
 * @author chengw
 */
public class Frame extends JFrame{


	private static final long serialVersionUID = 1L;
	private JMenuBomb menuBar = new JMenuBomb(this);
	private JPanelBomb bombpanel = new JPanelBomb(this);
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
		this.add(bombpanel);
	}
	public void restartGame() {
		this.remove(bombpanel);
		EssentialInfo.bombCount = EssentialInfo.allcount;
		EssentialInfo.isStart = false;
		this.remove(menuBar);
		this.setVisible(false);
		bombpanel = new JPanelBomb(this);
		this.add(bombpanel);
		new Frame();
	}
	

}
