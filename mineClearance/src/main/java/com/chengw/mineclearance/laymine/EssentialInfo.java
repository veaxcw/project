
package com.chengw.mineclearance.laymine;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chengw
 */
public class  EssentialInfo {

    private static final String PATH = "image";

    public static ImageIcon imageIcon = new ImageIcon(PATH + "/icon.gif");
    public static Icon icon = new ImageIcon(PATH +"/001.png");
    public static Icon background = new ImageIcon( PATH +"/background.png");
    public static Icon smile = new ImageIcon(PATH +"/face0.gif");
    public static Icon click = new ImageIcon(PATH +"/face2.gif");
    public static Icon upset = new ImageIcon(PATH +"/face03.gif");
    public static Icon win = new ImageIcon(PATH +"/face4.gif");
    public static Icon flag = new ImageIcon(PATH +"/flag.png");
    public static Icon ask = new ImageIcon(PATH +"/ask.png");
    public static Icon askpress = new ImageIcon(PATH +"/ask1.gif");
    public static Icon black = new ImageIcon(PATH +"/mine.gif");
    public static Icon bomb = new ImageIcon(PATH +"/bomb.png");
    public static Icon hole = new ImageIcon(PATH +"/hole.gif");
    public static Icon blood = new ImageIcon(PATH +"/blood.gif");

	public static int allcount = 10;
	public static int allcol = 9;
	public static int allrow = 9;
	public static int timecount = 0;
	public static int bombCount = allcount;
	
	public static boolean isStart = false;
	public static boolean isHole = false;
	
	public static Icon[] num = new Icon[9];
	public static Icon[] time = new Icon[10];

	public static Map<Integer,ImageIcon> NUMS = new HashMap<>(8);


	
	static {
		for(int i = 0; i < num.length;i++) {
		    NUMS.put(i+ 1,new ImageIcon(PATH + "/"+ (i + 1) + ".png"));
		}
		for(int j = 0; j < time.length; j++) {
			time[j] = new ImageIcon(PATH + j + ".gif");
		}
	}
	


	
	
	
}
