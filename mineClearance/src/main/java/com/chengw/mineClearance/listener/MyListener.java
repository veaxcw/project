
package com.chengw.mineClearance.listener;

import com.chengw.mineClearance.dao.Mine;
import com.chengw.mineClearance.frame.Frame;
import com.chengw.mineClearance.laymine.EssentialInfo;
import com.chengw.mineClearance.laymine.Rule;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class MyListener implements MouseListener{
    Mine[][] mines;
    Frame frame;
    private boolean isDoubleClick = false;
    public MyListener(Mine[][] mines,Frame frame) {
    	this.mines = mines;
    	this.frame = frame;
    }
    
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		Mine mine = (Mine)arg0.getSource();
		int row = mine.getRowx();
		int col = mine.getColy();
		Rule rule = new Rule(mines,frame);
		rule.IsWin();//��Ӯ��û
		if(arg0.getModifiers() == InputEvent.BUTTON1_MASK && (mine.isMineTag() == true) ){
			rule.IsFail();
		}else if((arg0.getModifiers() == InputEvent.BUTTON1_MASK) && mine.isFlagTag() == false) {
			if(rule.CountAround(row, col) == 0) {
				rule.MineField_auto_opening(row, col);
			}
			}else if((arg0.getModifiers() == InputEvent.BUTTON3_MASK&&mine.getRightClickCount() == 0)){
					mine.setIcon(EssentialInfo.flag);
					mine.setFlagTag(true);
					EssentialInfo.bombCount--;
					mine.setRightClickCount(1);
				}else if(arg0.getModifiers() == InputEvent.BUTTON3_MASK&&mine.getRightClickCount() == 1) {
					mine.setIcon(EssentialInfo.ask);
					mine.setRightClickCount(2);
					mine.setFlagTag(false);
					EssentialInfo.bombCount++;
					}else if(arg0.getModifiers() == InputEvent.BUTTON3_MASK&&mine.getRightClickCount() == 2){
						mine.setIcon(EssentialInfo.icon);
						mine.setRightClickCount(0);
			}
		
				 
	} 
			


	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDoubleClick() {
		return isDoubleClick;
	}

	public void setDoubleClick(boolean isDoubleClick) {
		this.isDoubleClick = isDoubleClick;
	}
	

}
