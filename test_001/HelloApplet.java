package test1;
//程序文件名称为HelloApplet.java
import java.awt.Graphics;
import java.applet.Applet;
public class HelloApplet extends Applet
{
	public void paint (Graphics g )
	{
		g.drawString ("Hello World!",50,25);
	}
}
