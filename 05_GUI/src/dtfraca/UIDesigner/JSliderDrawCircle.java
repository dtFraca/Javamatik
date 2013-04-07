package dtfraca.UIDesigner;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import javax.swing.JPanel;

/**
 * JSlider Demo
 * Code inspired from "Java for Programmers, page 696, 22.2 JSlider"
 * Except here the GUI design uses IntelliJ Idea UI Designer with FormLayout (JGoodies)
 * 1. Use createUIComponents method: to allow custom initialization
 * 2. Use derived JPanel class to add functionalities
 *
 * 2013-04-06 - tri
 */
public class JSliderDrawCircle {
	private JSlider sliderDiameter;
	private JPanel panel1;


	public static void main(String[] args) {
		JFrame frame = new JFrame("JSliderDrawCircle");

		frame.setContentPane(new JSliderDrawCircle().panel1);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		//frame.pack();
		frame.setVisible(true);
	}


	public JSliderDrawCircle() {
		sliderDiameter.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				//To change body of implemented methods use File | Settings | File Templates.
				int newDiameter = sliderDiameter.getValue();
				((PanelWithCircle) panel1).setDiameter(newDiameter);
				//lblDiameter.setText(Integer.toString(newDiameter));
			}
		});
	}

	private void createUIComponents() {
		// this method is create when the "Custom Code" property is checked in UI Designer
		// Doc: http://www.jetbrains.com/idea/webhelp/creating-form-initialization-code.html
		panel1 = new PanelWithCircle();
		//panel1.setBackground( Color.YELLOW );
		panel1.setBackground(new Color(160, 200, 240));
	}
}

class PanelWithCircle extends JPanel
{
	private int diameter = 30; // Initial size of the circle in pixels

	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		g.fillOval( 10, 10, diameter, diameter ); // draw circle
	}

	public void setDiameter( int newDiameter )
	{
		diameter = ( newDiameter >= 0 ? newDiameter : 10 );
		this.repaint();
	}
}