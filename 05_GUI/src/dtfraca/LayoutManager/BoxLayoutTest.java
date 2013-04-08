package dtfraca.LayoutManager;

import java.awt.Dimension;
import javax.swing.*;

/**
 * BoxLayout + notions Glue, Strut, Rigid Area
 * Book "Java for developers, page 722, 22.9 Layout Managers"
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-04-08 - tri
 */
public class BoxLayoutTest {
	public static void main(String[] args) {
		FrameWithBoxLayout myFrame = new FrameWithBoxLayout();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 220); // set frame size
		myFrame.setLocation(200,100);
		myFrame.setVisible(true);
	}
}

class FrameWithBoxLayout extends JFrame
{
	// set up GUI
	public FrameWithBoxLayout()
	{
		super( "BoxLayout Demo" );

		// create Box containers with BoxLayoutTest
		Box horizontal1 = Box.createHorizontalBox();
		Box vertical1 = Box.createVerticalBox();
		Box horizontal2 = Box.createHorizontalBox();
		Box vertical2 = Box.createVerticalBox();

		final int SIZE = 3; // number of buttons on each Box

		// add buttons to Box horizontal1
		// In a horizontal BoxLayout, GUI components are arranged left-to-right
		for ( int count = 0; count < SIZE; count++ ) {
			horizontal1.add( new JButton( "Button " + count ) );
		}

		// create STRUT and add buttons to Box vertical1
		// A vertical strut is an invisible GUI component that has a fixed pixel height and is used to guarantee
		// a fixed amount of space between GUI components. The int argument to method createVerticalStrut
		// determines the height of the strut in pixels. When the container is resized,
		// the distance between GUI components separated by struts does not change
		for ( int count = 0; count < SIZE; count++ )
		{
			vertical1.add( Box.createVerticalStrut( 25 ) ); // constant gap of 25 pixels between components
			vertical1.add( new JButton( "Button " + count ) );
		}

		// create HORIZONTAL GLUE and add buttons to Box horizontal2
		// Horizontal glue is an invisible GUI component that can be used
		// between fixed-size GUI components to occupy additional space. Normally, extra space
		// appears to the right of the last horizontal GUI component or below the last vertical one in
		// a BoxLayout. Glue allows the extra space to be placed between GUI components. When
		// the container is resized, components separated by glue components remain the same size,
		// but the glue stretches or contracts to occupy the space between them.
		for ( int count = 0; count < SIZE; count++ )
		{
			horizontal2.add( Box.createHorizontalGlue() );
			horizontal2.add( new JButton( "Button " + count ) );
		}

		// create RIGID AREA and add buttons to Box vertical2
		// A rigid area is an invisible GUI component that always has a fixed pixel
		// width and height. The argument to method createRigidArea is a Dimension object that
		// specifies the area’s width and height.
		for ( int count = 0; count < SIZE; count++ )
		{
			vertical2.add( Box.createRigidArea( new Dimension( 12, 8 ) ) );
			vertical2.add( new JButton( "Button " + count ) );
		}

		// create VERTICAL GLUE and add buttons to panel
		JPanel panel = new JPanel();
		panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ) );

		for ( int count = 0; count < SIZE; count++ )
		{
			panel.add( Box.createGlue() );
			panel.add( new JButton( "Button " + count ) );
		}

		// create a JTabbedPane + scrollable tabs
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT );

		// place each container on tabbed pane
		tabs.addTab( "HorizBox", horizontal1 );
		tabs.addTab( "VertiBox + Struts", vertical1 );
		tabs.addTab( "HorizBox + Glue", horizontal2 );
		tabs.addTab( "VertiBox + Rigid Areas", vertical2 );
		tabs.addTab( "VertiBox + Glue", panel );

		// place tabbed pane on frame
		add( tabs );

		//Change Look & Feel
		try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}