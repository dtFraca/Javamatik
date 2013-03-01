package dtfraca.DemoManualGUI;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.18.3 GridLayout
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-02-28 - tri
 */
public class LayoutGridTest {

    public static void main(String[] args) {
        GridLayoutFrame frm1 = new GridLayoutFrame();
        frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm1.setSize(300, 200); // set frame size
        frm1.setVisible(true); // display frame
    }
}


/**
 * Frame Demo
 * ATTENTION: The Frame implement itself the interface ActionListener
 * so the frame references to itself as event handler
 */
class GridLayoutFrame extends JFrame implements ActionListener
{
    private JButton[] buttons; // array of buttons
    private static final String[] buttonNames = { "one", "two", "three", "four", "five", "six" };
    private boolean layout2Active = true; // layout2Active between two layouts
    private Container container; // frame container
    private GridLayout gridLayout1; // first gridlayout
    private GridLayout gridLayout2; // second gridlayout

    // Constructor, set up GUI and event handling
    public GridLayoutFrame()
    {
        super( "GridLayout Demo" );
        gridLayout1 = new GridLayout( 2, 3, 15, 15 ); // (rowcount:2, colcount:3, hgap:15 pixels, vgap:15 pixels)
        gridLayout2 = new GridLayout( 3, 2 ); // rows:3, columns:2; no gaps
        container = getContentPane(); // get content pane
        setLayout( gridLayout1 ); // set JFrame layout

        buttons = new JButton[ buttonNames.length ]; // create array of JButtons
        for ( int kk = 0; kk < buttonNames.length; kk++ )
        {
            buttons[ kk ] = new JButton( buttonNames[ kk ] );
            buttons[ kk ].addActionListener( this ); // register listener
            add( buttons[ kk ] ); // add button to JFrame
        }
    }


    // handle button events by toggling between layouts
    public void actionPerformed( ActionEvent event )
    {
        if (layout2Active)
            container.setLayout( gridLayout2 ); // set layout to second
        else
            container.setLayout( gridLayout1 ); // set layout to first

        //each time a layout scheme is used, flip that active flag
        layout2Active = !layout2Active;

        container.validate(); // re-layout container
    }
}
