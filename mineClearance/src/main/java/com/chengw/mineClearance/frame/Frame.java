import javax.swing.JFrame;

import JMenuBomb;
import JPanelBomb;
import laymine.EssentialInfo;

public class Frame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBomb menuBar = new JMenuBomb(this);//this ָFrame ��
	private JPanelBomb bombpanel = new JPanelBomb(this);
	public Frame() {
		init();
		this.setIconImage(EssentialInfo.imageIcon.getImage());
		this.setTitle("ɨ��");
		this.setSize(EssentialInfo.allrow*55, EssentialInfo.allcol*55);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	private void init() {
		this.setJMenuBar(menuBar);//this ���ø����еķ�����super���ø���Ĺ��췽���������෽������д�� this����ñ���д�ķ���
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
