package ch09;
import javax.swing.*;
import java.awt.*;

public class h0908 extends JFrame {
	public h0908() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setLayout(new FlowLayout());
			setBackground(Color.LIGHT_GRAY);
			add(new JButton("열기"));
			add(new JButton("닫기"));
			add(new JButton("나가기"));
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(null);
			for (int i=0; i<10; i++) {
				int x = (int) (Math.random()*250);
				int y = (int) (Math.random()*250);
				JLabel label = new JLabel("*");
				label.setForeground(Color.ORANGE); // 글자색 변경
				label.setLocation(x, y);
				label.setSize(20, 20);
				label.setOpaque(true);
				add(label);
			}
		}
	}
	
	class SouthPanel extends JPanel {
		public SouthPanel() {
			setLayout(new FlowLayout());
			setBackground(Color.YELLOW);
			add(new JButton("Word Input"));
			add(new JTextField(15));
		}
	}

	public static void main(String[] args) {
		new h0908();

	}

}
