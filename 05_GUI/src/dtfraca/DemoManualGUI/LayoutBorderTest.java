package dtfraca.DemoManualGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.18.2 BorderLayout
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-02-28 - tri
 */
public class LayoutBorderTest {
    public static void main(String[] args) {
        BorderLayoutFrame frm1 = new BorderLayoutFrame();
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
class BorderLayoutFrame extends JFrame implements ActionListener
{
    private JButton[] buttons; // array of buttons to hide portions
    private BorderLayout layout; // borderlayout object

    private static final String[] names = {
            "Hide North", "Hide South",
            "Hide East", "Hide West", "Hide Center" };


    // Constructor, set up GUI and event handling
    public BorderLayoutFrame()
    {
        super( "BorderLayout Demo" );
        layout = new BorderLayout( 15, 15 ); // pixel gaps between each object on the frame
        this.setLayout(layout); // set frame layout
        buttons = new JButton[ names.length ]; // set size of array

        // create JButtons and register listeners for each button
        for ( int kk = 0; kk < names.length; kk++ )
        {
            buttons[ kk ] = new JButton( names[ kk ] );
            buttons[ kk ].addActionListener(this);
        }

        this.add(buttons[0], BorderLayout.NORTH); // add button to north
        this.add(buttons[1], BorderLayout.SOUTH); // add button to south
        this.add(buttons[2], BorderLayout.EAST); // add button to east
        this.add(buttons[3], BorderLayout.WEST); // add button to west
        this.add(buttons[4], BorderLayout.CENTER); // add button to center
    }


    // handle button event
    public void actionPerformed( ActionEvent event )
    {
        // check event source and lay out content pane correspondingly
        for ( JButton buttonSource : buttons )
        {
            if ( event.getSource() == buttonSource )
                buttonSource.setVisible( false ); // hide button clicked
            else
                buttonSource.setVisible( true ); // show other buttons
        }
        layout.layoutContainer( getContentPane() ); // layout content pane
    }
}
