
package com.chengw.mineClearance.laymine;

import com.chengw.mineClearance.dao.Mine;

import java.util.Random;



/**
 * @author chengw
 */
public class Laymine {

	public static void lay(Mine[][] lable, int row, int col) {
		Random random = new Random();
		int count = 0;
		while(count < EssentialInfo.allcount) {
			int x = random.nextInt(EssentialInfo.allrow);
			int y = random.nextInt(EssentialInfo.allcol);
			if(lable[x][y].isMineTag() == false && !(x == row && y == col)) {
				lable[x][y].setMineTag(true);
				lable[x][y].setCountAround(9);

				count++;
			}
		}
		finishBomb(lable);
	}
	
	public static void finishBomb(Mine[][] lable) {
		for(int i =0; i < lable.length; i++) {
			for(int j = 0; j < lable[i].length;j++) {
				if(lable[i][j].isMineTag() == false) {

					int count = 0;
					for(int x = Math.max(0, i-1);x < Math.min(EssentialInfo.allrow - 1,i + 1);x++) {
						for(int y = Math.max(0,j-1);y < Math.min(EssentialInfo.allcol - 1, j + 1);y++) {

							if(lable[x][y].isMineTag() == true) {
								count ++;
							}
						}
					}
					lable[i][j].setCountAround(count);
				}
			}
		}
		
	}

}
