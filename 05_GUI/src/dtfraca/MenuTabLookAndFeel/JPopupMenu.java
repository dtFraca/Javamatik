package dtfraca.MenuTabLookAndFeel;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Demo JPopupMenu, ButtonGroup, JRadioButtonMenuItem
 * Book "Java for developers, page 708, 22.5 JPopupMenu"
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-04-07 - tri
 */
public class JPopupMenu {
	public static void main(String[] args) {
		FrameWithPopupMenu myFrame = new FrameWithPopupMenu();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(300, 200);
		myFrame.setLocation(100, 200);
		myFrame.setVisible(true); // display frame
	}
}

class FrameWithPopupMenu extends JFrame
{
	private JRadioButtonMenuItem[] menuItems; // holds menuItems for colors
	private final Color[] bkgrdColors = { Color.BLUE, Color.YELLOW, Color.RED , new Color(40, 250, 220)};
	private javax.swing.JPopupMenu popupMenu;
	private JLabel lblMessage;


	// no-argument constructor sets up GUI
	public FrameWithPopupMenu()
	{
		super( "Using JPopupMenus" );

		lblMessage = new JLabel("Right Click Mouse to show Popup Menu", SwingConstants.LEFT);
		add(lblMessage, BorderLayout.SOUTH);

		MyMenuItemListener menuItemHandler = new MyMenuItemListener(); // handler for menu menuItems
		String[] colorNames = { "Blue", "Yellow", "Red", "Green Pastel" };
		ButtonGroup colorGroup = new ButtonGroup(); // Grouping all color MenuItems together (so that only 1 item can be selected at a time)
		popupMenu = new javax.swing.JPopupMenu();

		menuItems = new JRadioButtonMenuItem[ colorNames.length ];

		// construct menu item, add to pop-up menu, enable event handling
		for ( int count = 0; count < menuItems.length; count++ )
		{
			menuItems[ count ] = new JRadioButtonMenuItem( colorNames[ count ] );
			popupMenu.add( menuItems[ count ] ); // add item to pop-up menu
			colorGroup.add( menuItems[ count ] ); // add item to button group
			menuItems[ count ].addActionListener( menuItemHandler ); // add handler
		}
		setBackground( Color.WHITE ); // set background to white

		// declare a MouseListener for the window to display pop-up menu
		addMouseListener(
			new MouseAdapter() // anonymous inner class
			{
				// handle mouse press event
				public void mousePressed( MouseEvent event )
				{
					checkForTriggerEvent( event );
				}

/*
				// handle mouse release event (Mouse Release: NOT necessary)
				public void mouseReleased( MouseEvent event )
				{
					checkForTriggerEvent( event );
				}
*/

				// determine whether event should trigger pop-up menu
				private void checkForTriggerEvent( MouseEvent event )
				{
					if ( event.isPopupTrigger() )
						popupMenu.show(event.getComponent(), event.getX(), event.getY() );
				}
			}
		);

	} // end constructor



	/**
	 * Inner class Listener to handle events related to MenuItem
	 */
	private class MyMenuItemListener implements ActionListener
	{
		// When an item is selected
		@Override
		public void actionPerformed( ActionEvent event )
		{
			// determine which menu item was selected
			for ( int i = 0; i < menuItems.length; i++ )
			{
				if ( event.getSource() == menuItems[ i ] )
				{
					getContentPane().setBackground( bkgrdColors[ i ] );
					return;
				}
			}
		}
	}
}