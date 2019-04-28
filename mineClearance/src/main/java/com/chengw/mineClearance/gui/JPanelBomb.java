import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import frame.Frame;
import laymine.EssentialInfo;
import listener.MyListener;
import Mine;
import laymine.Laymine;

public class JPanelBomb extends JPanel {

	private static final long serialVersionUID = 1L;
	Mine[][] mines = new Mine[EssentialInfo.allrow][EssentialInfo.allcol];//�˶���������δ��ʼ��
	private MyListener listener;
	private Frame frame;
	public JPanel jp = new JPanel();
	public JPanelBomb() {
		
	}
	public JPanelBomb(Frame frame) {
		this.frame = frame;
		this.setLayout(new GridLayout(EssentialInfo.allrow,EssentialInfo.allcol,1,1));
		init();
	}

	private void init() {
		listener = new MyListener(mines,frame);
		
		for(int i = 0;i < mines.length; i++) {//��ÿ��λ��ʵ�ּ���
			for(int j = 0; j < mines[i].length;j++){
				mines[i][j] = new Mine(i,j);//��һ��������Ҫ
				mines[i][j].setIcon(EssentialInfo.icon);
				mines[i][j].addMouseListener(listener);
				this.add(mines[i][j]);
			}
		}
		Laymine.lay(mines, EssentialInfo.allrow, EssentialInfo.allcol);//����
		Border borderLow = BorderFactory.createLoweredBevelBorder();
		Border borderempty = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border com1 = BorderFactory.createCompoundBorder(borderempty,borderLow);
		this.setBorder(com1);
		this.setBackground(Color.lightGray);
	}
	public static void WinPanel() {
		JFrame win = new JFrame();
		win.setSize(100, 100);
		win.setTitle("���");
		JPanel jp = new JPanel();
		jp.add(new JLabel("��ϲͨ��"));
		win.setResizable(false);
		win.add(jp);
		win.setVisible(true);
	}
	public static void LosePanel() {
		JFrame lose = new JFrame();
		lose.setSize(100, 100);
		lose.setTitle("���");
		JPanel jp = new JPanel();
		jp.add(new JLabel("��Ϸʧ��"));
		lose.add(jp);
		lose.setResizable(false);
		lose.setVisible(true);
	}
	

}
