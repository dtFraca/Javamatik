package dtfraca.LayoutManager;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.18.1 FlowLayout
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-02-28 - tri
 */
public class LayoutFLowTest {
	public static void main(String[] args) {
		FlowLayoutFrame frm1 = new FlowLayoutFrame();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(350, 100); // set frame size
		frm1.setVisible(true); // display frame
	}
}


class FlowLayoutFrame extends JFrame {
	private JButton btnLeft; // button to set alignment left
	private JButton btnCenter; // button to set alignment center
	private JButton btnRight; // button to set alignment right
	private FlowLayout layout; // layout object
	private Container container; // container to set layout

	// Constructos + Setup GUI elements
	public FlowLayoutFrame() {
		super("FlowLayout Demo");
		layout = new FlowLayout(); // create FlowLayout
		container = getContentPane(); // get container to layout
		setLayout(layout); // set frame layout

		// set up btnLeft and register listener
		btnLeft = new JButton("Left"); // create Left button
		this.add(btnLeft); // add Left button to frame
		btnLeft.addActionListener(
				new ActionListener() // anonymous inner class
				{
					// process btnLeft event
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container); // realign attached components
					}
				}
		);


		// set up btnCenter and register listener
		btnCenter = new JButton("Center"); // create Center button
		this.add(btnCenter);
		btnCenter.addActionListener(
				new ActionListener() // anonymous inner class
				{
					// process btnCenter event
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container); // realign attached components
					}
				}
		);


		// set up btnRight and register listener
		btnRight = new JButton("Right"); // create Right button
		this.add(btnRight); // add Right button to frame
		btnRight.addActionListener(
				new ActionListener() // anonymous inner class
				{
					// process btnRight event
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container); // realign attached components
					}
				}
		);
	} // end constructor
}
