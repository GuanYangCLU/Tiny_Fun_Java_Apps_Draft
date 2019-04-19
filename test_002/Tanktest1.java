import javax.swing.*;
import java.awt.*;

public class Tanktest1 extends JFrame{
	
	MyPanel1 mp = null;
	
	
	public Tanktest1(){
		mp = new MyPanel1();
		
		this.add(mp);
		this.setSize(800,600);
		this.setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args){
		Tanktest1 tkt = new Tanktest1();
	}
}

//mypanel
class MyPanel1 extends JPanel{
	
	
	//定义我的坦克
	Hero hero = null;
	
	public MyPanel1(){
		hero = new Hero(10,10);
		
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 800, 600);
		this.drawTank(hero.getX(), hero.getY(), g, 0, 0);
				
	}
	
	//画坦克的函数  封装后
	public void drawTank(int x, int y, Graphics g, int direct, int type){
		
		//判断坦克类型
		switch(type){
		case 0:
			g.setColor(Color.CYAN);
			break;
		case 1:
			g.setColor(Color.red);
			break;
		}
		
		//判断方向
		switch(direct){
		case 0:   //向上
			//g.setColor(Color.CYAN);
			//画出我的坦克(最后再封装)
			//画左边矩形
			g.fill3DRect(x, y, 5, 30,false);
			//右边矩形
			g.fill3DRect(x+15, y, 5, 30,false);
			//中间矩形
			g.fill3DRect(x+5, y+5, 10, 20,false);
			
			//中间圆
		
			g.fillOval(x+5, y+10, 8, 8);
			//直线
			//g.setColor(Color.black);
			g.drawLine(x+9, y, x+9, y+10);
			
			break;
		}
	}
	
}




class Tank{
	//坐标
	int x = 0;
	int y = 0;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	public Tank(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	
}

//友方
class Hero extends Tank{

	public Hero(int x, int y){
		super(x,y);
		
	}
}