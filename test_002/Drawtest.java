import javax.swing.*;
import java.awt.*;

public class Drawtest extends JFrame{
	MyPanel mp = null;
	public static void main(String[] args){
		Drawtest d1 = new Drawtest();
		
	}
	
	public Drawtest(){
		mp = new MyPanel();
		
		this.add(mp);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//定义我自己的面板，用于绘图和显示
class MyPanel extends JPanel{
	//覆盖paint方法  Graphics是画笔，绘图的重要类
	public void paint(Graphics g){
		//调用父类函数 完成初始化，不可少
		super.paint(g);
		//先画个圆
		g.drawOval(10, 10, 30, 30);
		
		g.drawLine(10, 10, 40, 40);
		
		g.drawRect(10, 10, 70, 80);
		g.draw3DRect(50, 50, 100, 120, false);
		//ctrl + / 注释掉所以选中行代码
		g.setColor(Color.red);
		g.fillRect(20, 40, 80, 50);
		g.setColor(Color.cyan);
		g.fillOval(120, 140, 80, 50);
		
		//画图片
		Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/Chiya.jpg"));
		//显示图片
		g.drawImage(im, 30, 30, 320, 120, this);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("华文彩云",Font.BOLD,48));
		g.drawString("卢本伟挂比", 100, 200);
		
		
	}
	
	
}