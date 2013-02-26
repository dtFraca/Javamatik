package dtfraca.BricoTri.GUIDemo;

import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.5 Displaying Text and Images in a Window
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-02-22 - tri
 */
public class FrameWithLabelsTest {
    public static void main(String[] args) {
        FrameWithLabels myFrame = new FrameWithLabels();

        myFrame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        myFrame.setSize( 300, 180 ); // set frame size
        myFrame.setVisible( true ); // display frame
    }
}


class FrameWithLabels extends JFrame {
    private JLabel label1; // JLabel with just text
    private JLabel label2; // JLabel constructed with text and icon
    private JLabel label3; // JLabel with added text and icon

    public FrameWithLabels() {
        super( "Testing JLabel" );
        //setLayout( new FlowLayout() );
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5)); // align, horiz gap, vertical gap (gap = space between 2 objects in frame)

        // JLabel constructor with a string argument
        label1 = new JLabel( "Label with text" );
        label1.setToolTipText( "This is label1" );
        add( label1 ); // add label1 to JFrame

        // JLabel constructor with string, Icon and alignment arguments
        Icon myIcon = new ImageIcon( getClass().getResource( "RainbowSphere.png" ) );
        label2 = new JLabel( "Label with text and icon on left", myIcon, SwingConstants.LEFT );
        label2.setToolTipText( "This is label2" );
        add( label2 ); // add label2 to JFrame

        label3 = new JLabel(); // JLabel constructor no arguments
        label3.setText( "Label with icon and text centered at bottom" );
        label3.setIcon( myIcon ); // add icon to JLabel
        label3.setHorizontalTextPosition( SwingConstants.CENTER );
        label3.setVerticalTextPosition( SwingConstants.BOTTOM );
        label3.setToolTipText( "This is label3" );
        add( label3 ); // add label3 to JFrame
    }
}
