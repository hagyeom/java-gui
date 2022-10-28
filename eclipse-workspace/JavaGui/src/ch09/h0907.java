package ch09;
import javax.swing.*;
import java.awt.*;

public class h0907 extends JFrame {
	public h0907() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(400, 350);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setLayout(new FlowLayout());
			setBackground(Color.LIGHT_GRAY);
			add(new JLabel("수식입력"));
			add(new JTextField(18));
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(new GridLayout(4, 4, 4, 4));
			for (int i=0; i<10; i++) {
				add(new JButton(Integer.toString(i)));
			}
			
			add(new JButton("CE"));
			add(new JButton("계산"));
			
			JButton [] bList = new JButton[] {new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
			for (int i=0; i<4; i++) {
				bList[i].setBackground(Color.CYAN);
				add(bList[i]);
			}
		}
	}
	
	class SouthPanel extends JPanel {
		SouthPanel(){
			setLayout(new FlowLayout());
			setBackground(Color.YELLOW);
			add(new JLabel("계산 결과"));
			add(new JTextField(18));
		}
	}
	public static void main(String[] args) {
		new h0907();
	}
}