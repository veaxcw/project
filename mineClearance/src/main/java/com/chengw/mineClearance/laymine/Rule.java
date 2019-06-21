
package com.chengw.mineClearance.laymine;

import com.chengw.mineClearance.dao.Mine;
import com.chengw.mineClearance.frame.Frame;
import com.chengw.mineClearance.gui.JPanelBomb;

public class Rule {
	private Mine[][] mines;
	@SuppressWarnings("unused")
	private Frame frame;
	public Rule(Mine[][] mines,Frame frame) {
		this.mines = mines;
		this.frame = frame;
	}
	public void IsFail() {//�ж�ʧ��
		for(int i =0; i < mines.length; i++) {
			for(int j = 0; j < mines[i].length;j++) {
				if(mines[i][j].isMineTag() == true) {
					mines[i][j].setIcon(EssentialInfo.bomb);
				}
				}
			}
		 new JPanelBomb();
		JPanelBomb.LosePanel();
	}
	public void IsWin() {
		int bombSweeper = 1;
		System.out.println(bombSweeper);
		for(int i =0; i < mines.length; i++) {
			for(int j = 0; j < mines[i].length;j++) {
				if(mines[i][j].isMineTag() == true && mines[i][j].isFlagTag() == true) {
					bombSweeper++;
				}
				}
			}
		System.out.println(bombSweeper);
		if(bombSweeper == EssentialInfo.allcount) {
			
			System.out.println("win ="+bombSweeper);
			new JPanelBomb();
			JPanelBomb.WinPanel();
		}
		
	}
	public int CountAround(int row,int col) {
		int count = 0;//��Χ�˸��������׵�����
		for(int x = Math.max(0, row-1);x < Math.min(EssentialInfo.allrow ,row + 2);x++) {
			for(int y = Math.max(0,col-1);y < Math.min(EssentialInfo.allcol, col + 2);y++) {
				if(mines[x][y].isMineTag() == true) {
					count++;
				}
			}
		}
		if(count != 0) {
			mines[row][col].setIcon(EssentialInfo.num[count]);
		} else if(count == 0)
			mines[row][col].setIcon(EssentialInfo.background);
		return count;
	}
	
	public void MineField_auto_opening(int row,int col){
		mines[row][col].setLeftClickCount(1);
		for(int x = Math.max(0, row-1);x < Math.min(EssentialInfo.allrow,row + 2);x++) {
			for(int y = Math.max(0,col-1);y < Math.min(EssentialInfo.allcol, col + 2);y++) {
				if(CountAround(x,y) == 0) {
				if(mines[x][y].isMineTag() == false && mines[x][y].getLeftClickCount() == 0) {
					  MineField_auto_opening(x,y);
					  mines[x][y].setIcon(EssentialInfo.background);
					}
				}
			}
		}
	}
	
	
}


