import java.awt.*;
import javax.swing.*;

public class JFtest extends JFrame{
	//��Ҫ�����
	JButton jb1 = null;
	//�������������ڹ��캯�������
	public JFtest(){
		jb1 = new JButton("��ť1");
		this.setTitle("Hello");
		this.setLocation(300, 300);
		this.add(jb1);
		this.setSize(300, 300);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		
	public static void main (String[] args){
		JFtest jf = new JFtest();
				
	}
}
