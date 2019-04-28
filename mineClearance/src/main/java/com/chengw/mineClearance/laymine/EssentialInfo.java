import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EssentialInfo {
	public static int allcount = 10;
	public static int allcol = 9;
	public static int allrow = 9;
	public static int timecount = 0;
	public static int bombCount = allcount;//�Ѿ�ɨ�����˵��׵�����
	
	public static boolean isStart = false;
	public static boolean isHole = false;
	
	public static Icon[] num = new Icon[9];
	public static Icon[] time = new Icon[10];
	
	static {
		for(int i = 0; i < num.length;i++) {
			num[i] = new ImageIcon("src/image/" + i + ".png");
		}
		for(int j = 0; j < time.length; j++) {
			time[j] = new ImageIcon("src/image/d" + j + ".gif");
		}
	}
	
	public static ImageIcon imageIcon = new ImageIcon("src/image/icon.gif");//�׵ı�־
	public static Icon icon = new ImageIcon("src/image/001.png");
	public static Icon background = new ImageIcon("src/image/background.png");
	public static Icon smile = new ImageIcon("src/image/face0.gif");
	public static Icon click = new ImageIcon("src/image/face2.gif");
	public static Icon upset = new ImageIcon("src/image/face03.gif");
	public static Icon win = new ImageIcon("src/image/face4.gif");
	public static Icon flag = new ImageIcon("src/image/flag.png");
	public static Icon ask = new ImageIcon("src/image/ask.png");
	public static Icon askpress = new ImageIcon("src/image/ask1.gif");
	public static Icon black = new ImageIcon("src/image/mine.gif");
	public static Icon bomb = new ImageIcon("src/image/bomb.png");
	public static Icon hole = new ImageIcon("src/image/hole.gif");
	public static Icon blood = new ImageIcon("src/image/blood.gif");

	
	
	
}
