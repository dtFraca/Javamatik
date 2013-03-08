package dtfraca.ColorFont2D;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 15.3 Color Control
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-03-01 - tri
 */
public class ColorTest {

	public static void main(String[] args) {
		JFrame frm1 = new JFrame("Using colors");
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		MyDemoPanel myPanel = new MyDemoPanel();
		frm1.add(myPanel);
		frm1.setSize(450, 180); // set frame size
		frm1.setVisible(true);
	}
}

class MyDemoPanel extends JPanel {
	// draw rectangles and Strings in different colors
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // call superclass's paintComponent
		this.setBackground(Color.WHITE);

		// set new drawing color using integers
		g.setColor(new Color(255, 0, 0));
		g.fillRect(15, 25, 100, 20); // (x, y, width, height)
		g.drawString("Current RGB: " + g.getColor(), 130, 40);

		// set new drawing color using floats
		g.setColor(new Color(0.50f, 0.75f, 0.0f));
		g.fillRect(15, 50, 100, 20); // (x, y, width, height)
		g.drawString("Current RGB: " + g.getColor(), 130, 65);

		// set new drawing color using static Color objects
		g.setColor(Color.BLUE);
		g.fillRect(15, 75, 100, 20); // (x, y, width, height)
		g.drawString("Current RGB: " + g.getColor(), 130, 90);

		// display individual RGB values
		Color color = Color.MAGENTA;
		g.setColor(color);
		g.fillRect(15, 100, 100, 20); // (x, y, width, height)
		g.drawString("RGB values: " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue(), 130, 115);
	}
}