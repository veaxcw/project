
package com.chengw.mineclearance.listener;

import com.chengw.mineclearance.model.Mine;
import com.chengw.mineclearance.frame.Frame;
import com.chengw.mineclearance.laymine.EssentialInfo;
import com.chengw.mineclearance.laymine.Rule;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * @author chengw
 */
public class MyListener implements MouseListener {
    Mine[][] mines;
    Frame frame;
    private boolean isDoubleClick = false;

    public MyListener(Mine[][] mines, Frame frame) {
        this.mines = mines;
        this.frame = frame;
    }


    @Override
    public void mousePressed(MouseEvent arg0) {
        Mine m = (Mine) arg0.getSource();
        int row = m.getRowX();
        int col = m.getColY();
        Rule rule = new Rule(mines, frame);
        Mine mine = mines[row][col];
        rule.IsWin();
        if (arg0.getModifiers() == InputEvent.BUTTON1_MASK && mine.isMineTag()) {
            rule.IsFail();
        }
        if (arg0.getModifiers() == InputEvent.BUTTON1_MASK
                && !mine.isFlagTag()
                && !mine.isNumTag()) {
            if (rule.countAround(row, col) == 0) {
                rule.mineAutoOpening(row, col);
            }
        }
        if ((arg0.getModifiers() == InputEvent.BUTTON3_MASK && mine.getRightClickCount() == 0)) {
            mine.setIcon(EssentialInfo.flag);
            mine.setFlagTag(true);
            EssentialInfo.bombCount--;
            mine.setRightClickCount(1);
        }
        if (arg0.getModifiers() == InputEvent.BUTTON3_MASK && mine.getRightClickCount() == 1) {
            mine.setIcon(EssentialInfo.ask);
            mine.setRightClickCount(2);
            mine.setFlagTag(false);
            EssentialInfo.bombCount++;
        }
        if (arg0.getModifiers() == InputEvent.BUTTON3_MASK && mine.getRightClickCount() == 2) {
            mine.setIcon(EssentialInfo.icon);
            mine.setRightClickCount(0);
        }
        mine.setIcon(mine.getIcon());


    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
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
