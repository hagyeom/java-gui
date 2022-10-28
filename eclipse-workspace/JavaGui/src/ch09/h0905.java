package ch09;
import javax.swing.*;
import java.awt.*;

public class h0905 extends JFrame {
	public h0905() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		for(int i=0; i<16; i++) {
			Color [] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
					Color.PINK, Color.LIGHT_GRAY, Color.RED, Color.ORANGE,
					Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE};
			JLabel la = new JLabel(i+"");
			la.setBackground(col[i]);
			la.setOpaque(true);
			c.add(la);
		}
		
		setSize(600, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new h0905();

	}

}
