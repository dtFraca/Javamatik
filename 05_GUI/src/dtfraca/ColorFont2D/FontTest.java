package dtfraca.ColorFont2D;

import java.awt.*;
import javax.swing.*;


/**
 * Book "Java for Programmers, 2ndEd" - 15.4 Manipulating Fonts
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-03-01 - tri
 */
public class FontTest {
	public static void main(String[] args) {
		JFrame frm1 = new JFrame("Using fonts");
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		FontJPanel pnlDemo = new FontJPanel(); // create FontJPanel
		frm1.add(pnlDemo);
		frm1.setSize(550, 150); // set frame size (x,y)
		frm1.setVisible(true);
	}
}


class FontJPanel extends JPanel {
	// display Strings in different fonts and colors
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // call superclass's paintComponent

		// set font to Serif (Times), bold, 12pt and draw a string
		Font font1 = new Font("Ubuntu", Font.BOLD, 16);
		g.setFont(font1);
		g.drawString(String.format("%s, %d points, %s.",
				font1.getFontName(), font1.getSize(), (font1.isBold() ? "BOLD" : "NORMAL")), 20, 30);

		// set font to Monospaced (Courier), italic, 24pt and draw a string
		Font font2 = new Font("DejaVu Sans Mono", Font.ITALIC, 24);
		g.setColor(new Color(0, 60, 180));
		g.setFont(font2);
		g.drawString(String.format("%s, %d points, %s.",
				font2.getFontName(), font2.getSize(), (font2.isItalic() ? "ITALIC" : "NORMAL")), 20, 50);

		// set font to SansSerif (Helvetica), plain, 14pt and draw a string
		Font font3 = new Font("Droid Sans", Font.PLAIN, 14);
		g.setColor(Color.BLACK);
		g.setFont(font3);
		g.drawString(String.format("%s, %d points, %s.",
				font3.getFontName(), font3.getSize(), (font3.isItalic() ? "ITALIC" : "NORMAL")), 20, 70);


		Font font4 = new Font("Trebuchet MS", Font.BOLD + Font.ITALIC, 18);
		g.setColor(Color.RED);
		g.setFont(font4);
		g.drawString(String.format("%s, %d points, %s & %s.",
				font4.getFontName(), font4.getSize(),
				(font1.isBold() ? "BOLD" : "NORMAL"),
				(font4.isItalic() ? "ITALIC" : "NORMAL")), 20, 90);
	}
}