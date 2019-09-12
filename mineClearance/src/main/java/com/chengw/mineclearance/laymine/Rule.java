
package com.chengw.mineclearance.laymine;

import com.chengw.mineclearance.model.Mine;
import com.chengw.mineclearance.frame.Frame;
import com.chengw.mineclearance.gui.JPanelBomb;

/**
 * @author chengw
 */
public class Rule {
	private Mine[][] mines;
	@SuppressWarnings("unused")
	private Frame frame;
	public Rule(Mine[][] mines,Frame frame) {
		this.mines = mines;
		this.frame = frame;
	}
	public void IsFail() {
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
	public int countAround(int row, int col) {
		int count = 0;
		for(int x = Math.max(0, row-1);x < Math.min(EssentialInfo.allrow ,row + 2);x++) {
			for(int y = Math.max(0,col-1);y < Math.min(EssentialInfo.allcol, col + 2);y++) {
				if(mines[x][y].isMineTag() == true) {
					count++;
				}
			}
		}
		if(count != 0) {
			mines[row][col].setIcon(EssentialInfo.num[count]);
		} else if(count == 0) {
			mines[row][col].setIcon(EssentialInfo.background);
		}
		return count;
	}
	
	public void mineAutoOpening(int row, int col){
		mines[row][col].setLeftClickCount(1);
		for(int x = Math.max(0, row-1);x < Math.min(EssentialInfo.allrow,row + 2);x++) {
			for(int y = Math.max(0,col-1);y < Math.min(EssentialInfo.allcol, col + 2);y++) {
			    Integer counts = countAround(x,y);
				if(counts == 0) {
				if(mines[x][y].isMineTag() == false && mines[x][y].getLeftClickCount() == 0) {
					  mineAutoOpening(x,y);
					  mines[x][y].setIcon(EssentialInfo.background);
					}
				}
				mines[x][y].setIcon(EssentialInfo.NUMS.get(counts));
				mines[x][y].setNumTag(true);
			}
		}
	}
	
	
}


