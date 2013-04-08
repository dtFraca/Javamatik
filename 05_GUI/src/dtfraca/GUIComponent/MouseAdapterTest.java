package dtfraca.GUIComponent;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


/**
 * Book "Java for Programmers, 2ndEd" - 14.15 Adapter Classes
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * Many event-listener interfaces, such as MouseListener and MouseMotionListener, contain multiple methods
 * It’s not always desirable to declare every method in an event-listener interface.
 * For instance, an application may need only the mouseClicked handler from MouseListener or the
 * mouseDragged handler from MouseMotionListener. Interface WindowListener specifies seven window
 * event-handling methods. For many of the listener interfaces that have multiple methods,
 * packages java.awt.event and javax.swing.event provide event-listener adapter classes.
 * An adapter class implements an interface and provides a default implementation
 * (with an empty method body) of each method in the interface.
 * <p/>
 * 2013-02-28 - tri
 */
public class MouseAdapterTest {
	public static void main(String[] args) {
		MyFrame frm1 = new MyFrame();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(400, 150); // set frame size
		frm1.setVisible(true);
	}
}

/**
 * Demonstrate mouse event handler deriving from MouseAdapter class
 * Notice that now we no longer need to implement ALL methods from
 * MouseListener (5 methods) & MouseMotionListener (2 methods) as in the MouseTrackerTest class
 */
class MyFrame extends JFrame {
	//private String statusTxt; // String that is displayed in the lblStatus
	private JLabel lblStatus; // JLabel that appears at bottom of window

	// constructor sets title bar String and register mouse listener
	public MyFrame() {
		super("MouseAdapter event handler");
		lblStatus = new JLabel("Click the mouse");
		add(lblStatus, BorderLayout.SOUTH);
		addMouseListener(new MouseClickHandler()); // add handler
	}

	// inner class to handle mouse events
	private class MouseClickHandler extends MouseAdapter {
		// handle mouse-click event and determine which button was pressed
		public void mouseClicked(MouseEvent event) {
			// get x,y position of mouse
			//int xPos = event.getX();
			//int yPos = event.getY();

			String statusTxt = String.format("Clicked %d time(s)", event.getClickCount());

			if (event.isMetaDown()) // right mouse button
				statusTxt += " with RIGHT mouse button";
			else if (event.isAltDown()) // middle mouse button
				statusTxt += " with CENTER mouse button";
			else // left mouse button
				statusTxt += " with LEFT mouse button";

			lblStatus.setText(statusTxt);
		}
	}
}
