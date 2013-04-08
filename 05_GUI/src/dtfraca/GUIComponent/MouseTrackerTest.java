package dtfraca.GUIComponent;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;


/**
 * Book "Java for Programmers, 2ndEd" - 14.13 Multiple-Selection Lists
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-02-28 - tri
 */
public class MouseTrackerTest {
	public static void main(String[] args) {
		FrameMouseTracker frm1 = new FrameMouseTracker();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(300, 100); // set frame size
		frm1.setVisible(true); // display frame (x,y)
	}
}


class FrameMouseTracker extends JFrame {
	private JPanel mousePanel; // panel in which mouse events will occur
	private JLabel lblStatus; // label that displays event information
	//private JLabel lblXY; // label containing X,Y coordinates of mouse cursor

	// FrameMouseTracker constructor sets up GUI and registers mouse event handlers
	public FrameMouseTracker() {
		super("Demonstrating Mouse Events");
		mousePanel = new JPanel(); // create panel
		mousePanel.setBackground(Color.WHITE); // set background color
		this.add(mousePanel, BorderLayout.CENTER); // add panel to JFrame

		lblStatus = new JLabel("Mouse outside JPanel");
		this.add(lblStatus, BorderLayout.SOUTH); // add label to JFrame

		//lblXY = new JLabel( "X=n1 , Y=n2" );
		//this.add(lblXY); // add label to JFrame

		// create and register listener for mouse and mouse motion events
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}


	/**
	 * This event-handler class implements both interfaces MouseListener (5 methods) & MouseMotionListener (2 methods)
	 * Therefore ALL seven methods from these two interfaces must be implemented
	 */
	private class MouseHandler implements MouseListener, MouseMotionListener {

		//======= MouseListener event handlers ===============================
		public void mouseClicked(MouseEvent event) {
			lblStatus.setText(String.format("Clicked at [%d, %d]", event.getX(), event.getY()));
		}

		public void mousePressed(MouseEvent event) {
			lblStatus.setText(String.format("Pressed at [%d, %d]", event.getX(), event.getY()));
		}

		public void mouseReleased(MouseEvent event) {
			lblStatus.setText(String.format("Released at [%d, %d]", event.getX(), event.getY()));
		}

		public void mouseEntered(MouseEvent event) {
			lblStatus.setText(String.format("Mouse entered at [%d, %d]", event.getX(), event.getY()));
			mousePanel.setBackground(Color.GREEN);
		}

		public void mouseExited(MouseEvent event) {
			lblStatus.setText("Mouse outside JPanel");
			mousePanel.setBackground(Color.WHITE);
		}


		//======= MouseMotionListener event handlers ===============================

		public void mouseDragged(MouseEvent event) {
			lblStatus.setText(String.format("Dragged at [%d, %d]", event.getX(), event.getY()));
		}

		public void mouseMoved(MouseEvent event) {
			lblStatus.setText(String.format("Moved at [%d, %d]", event.getX(), event.getY()));
		}
	}
}