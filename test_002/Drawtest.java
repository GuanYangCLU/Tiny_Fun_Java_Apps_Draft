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
//�������Լ�����壬���ڻ�ͼ����ʾ
class MyPanel extends JPanel{
	//����paint����  Graphics�ǻ��ʣ���ͼ����Ҫ��
	public void paint(Graphics g){
		//���ø��ຯ�� ��ɳ�ʼ����������
		super.paint(g);
		//�Ȼ���Բ
		g.drawOval(10, 10, 30, 30);
		
		g.drawLine(10, 10, 40, 40);
		
		g.drawRect(10, 10, 70, 80);
		g.draw3DRect(50, 50, 100, 120, false);
		//ctrl + / ע�͵�����ѡ���д���
		g.setColor(Color.red);
		g.fillRect(20, 40, 80, 50);
		g.setColor(Color.cyan);
		g.fillOval(120, 140, 80, 50);
		
		//��ͼƬ
		Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/Chiya.jpg"));
		//��ʾͼƬ
		g.drawImage(im, 30, 30, 320, 120, this);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("���Ĳ���",Font.BOLD,48));
		g.drawString("¬��ΰ�ұ�", 100, 200);
		
		
	}
	
	
}