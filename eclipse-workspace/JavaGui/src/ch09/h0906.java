package ch09;
import javax.swing.*;
import java.awt.*;

public class h0906 extends JFrame {
	public h0906() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for (int i=0;i<20;i++) {
			JLabel label = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*250 + 50);
			int y = (int)(Math.random()*250 + 50);
			label.setLocation(x, y);
			label.setSize(10, 10);
			label.setOpaque(true);
			label.setBackground(Color.BLUE);
			c.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new h0906();
	}
}