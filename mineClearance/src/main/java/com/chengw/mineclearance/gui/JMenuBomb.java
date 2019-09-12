
package com.chengw.mineclearance.gui;

import com.chengw.mineclearance.frame.Frame;
import com.chengw.mineclearance.laymine.EssentialInfo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;



public class JMenuBomb extends JMenuBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenu menu = new JMenu("菜单");
	JMenu rank = new JMenu("等级");
	JMenu help = new JMenu("help");
	JMenuItem primary = new JMenuItem("primary");
	JMenuItem medium = new JMenuItem("medium");
	JMenuItem higher = new JMenuItem("higher");
	JMenuItem start = new JMenuItem("开始");
	JMenuItem exit = new JMenuItem("退出");
	
	Frame frame;
	public JMenuBomb(Frame frame) {
		// TODO Auto-generated constructor stub
		this.frame = frame;
		init();
	}

	private void init() {
		//设置快捷键
		menu.setMnemonic('G');
		menu.setMnemonic('h');
		//开始游戏
		menu.add(start);
		
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.restartGame();
			}
		});
		menu.addSeparator();//添加分割线
		menu.add(exit);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
				//添加行为监听
			}
		});
		rank.add(primary);
		primary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EssentialInfo.allcol = 9;
				EssentialInfo.allrow = 9;
				EssentialInfo.allcount = 10;
				frame.restartGame();//重启游戏
			}
		});
		menu.addSeparator();//添加分割线
		rank.add(medium);
		medium.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				EssentialInfo.allcol = 16;
				EssentialInfo.allrow = 16;
				EssentialInfo.allcount = 40;
				frame.restartGame();
				//������Ϸ
			}
		});
		menu.addSeparator();//添加分割线
		rank.add(higher);
		higher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EssentialInfo.allcol = 16;
				EssentialInfo.allrow = 30;
				EssentialInfo.allcount = 100;
				frame.restartGame();
				//������Ϸ
			}
		});
		
		
		this.add(menu);
		this.add(rank);
		this.add(help);
		}
	

}










































