import java.awt.*;
import javax.swing.*;

public class JFtest extends JFrame{
	//需要的组件
	JButton jb1 = null;
	//创建和添加组件在构造函数中完成
	public JFtest(){
		jb1 = new JButton("按钮1");
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
