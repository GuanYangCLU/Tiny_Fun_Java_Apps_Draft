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
	
	
	//�����ҵ�̹��
	Hero hero = null;
	
	public MyPanel1(){
		hero = new Hero(10,10);
		
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 800, 600);
		this.drawTank(hero.getX(), hero.getY(), g, 0, 0);
				
	}
	
	//��̹�˵ĺ���  ��װ��
	public void drawTank(int x, int y, Graphics g, int direct, int type){
		
		//�ж�̹������
		switch(type){
		case 0:
			g.setColor(Color.CYAN);
			break;
		case 1:
			g.setColor(Color.red);
			break;
		}
		
		//�жϷ���
		switch(direct){
		case 0:   //����
			//g.setColor(Color.CYAN);
			//�����ҵ�̹��(����ٷ�װ)
			//����߾���
			g.fill3DRect(x, y, 5, 30,false);
			//�ұ߾���
			g.fill3DRect(x+15, y, 5, 30,false);
			//�м����
			g.fill3DRect(x+5, y+5, 10, 20,false);
			
			//�м�Բ
		
			g.fillOval(x+5, y+10, 8, 8);
			//ֱ��
			//g.setColor(Color.black);
			g.drawLine(x+9, y, x+9, y+10);
			
			break;
		}
	}
	
}




class Tank{
	//����
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

//�ѷ�
class Hero extends Tank{

	public Hero(int x, int y){
		super(x,y);
		
	}
}