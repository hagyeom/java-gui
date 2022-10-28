package ch09;
import javax.swing.*;
import java.awt.*;

public class h0903 extends JFrame {
	public h0903() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		for(int i=0; i<10; i++) {
			c.add(new JButton(i+""));
		}
		
		setSize(600, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new h0903();

	}

}
