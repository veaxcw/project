import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Frame;
import JPanelBomb;
import EssentialInfo;
import Rule;
import Mine;

public class MyListener implements MouseListener{
    Mine[][] mines;
    Frame frame;
    private boolean isDoubleClick = false;
    public MyListener(Mine[][] mines,Frame frame) {//��mines[][]������׵�ַ��������
    	this.mines = mines;
    	this.frame = frame;
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
	public void mousePressed(MouseEvent arg0) {
		Mine mine = (Mine)arg0.getSource();//��ȡ�¼��ķ����ߣ�������ǿ��ת����Mine����,������ǰλ�õ������Ϊ
		int row = mine.getRowx();
		int col = mine.getColy();
		Rule rule = new Rule(mines,frame);
		rule.IsWin();//��Ӯ��û
		if(arg0.getModifiers() == InputEvent.BUTTON1_MASK && (mine.isMineTag() == true) ){//�������
			rule.IsFail();
		}else if((arg0.getModifiers() == InputEvent.BUTTON1_MASK) && mine.isFlagTag() == false) {//����������������û�б��Ϊ��
			if(rule.CountAround(row, col) == 0)
				rule.MineField_auto_opening(row, col);;//�������Զ�����			
			}else if((arg0.getModifiers() == InputEvent.BUTTON3_MASK&&mine.getRightClickCount() == 0)){//������һ�,���ǵ�һ�ε���
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
