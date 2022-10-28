package ch09;
import javax.swing.*;
import java.awt.*;

public class Oc09 extends JFrame {
	public Oc09() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300, 250);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			add(new JButton("Open"), FlowLayout.LEFT);
			add(new JButton("Read"), FlowLayout.CENTER);
			add(new JButton("Close"), FlowLayout.RIGHT);
			
		}
	}

	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(null);
			JLabel la1 = new JLabel("Hello");
			JLabel la2 = new JLabel("Java");
			JLabel la3 = new JLabel("Love");
			la1.setSize(40, 20);
			la1.setLocation(100, 30);
			la2.setSize(40, 20);
			la2.setLocation(200, 150);
			la3.setSize(40, 20);
			la3.setLocation(120, 60);
			add(la1);
			add(la2);
			add(la3);
		}
	}
	public static void main(String[] args) {
		new Oc09();

	}

}
