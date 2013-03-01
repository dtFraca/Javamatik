package dtfraca.DemoManualGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.10 Buttons That Maintain State, 14.10.1 JCheckBox
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-02-28 - tri
 */
public class CheckboxTest {
    public static void main(String[] args) {
        FrameWithChkBox frm1 = new FrameWithChkBox();
        frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm1.setSize(320, 100); // set frame size (x,y)
        frm1.setVisible(true); // display frame
    }
}


// Class having No Access Modifier = visible to entire package
class FrameWithChkBox extends JFrame
{
    private JTextField textField; // displays text in changing fonts
    private JCheckBox boldJCheckBox; // to select/deselect bold
    private JCheckBox italicJCheckBox; // to select/deselect italic

    // FrameWithChkBox constructor adds JCheckBoxes to JFrame
    public FrameWithChkBox()
    {
        super( "JCheckBox Test" );
        setLayout( new FlowLayout() ); // set frame layout

        // set up JTextField and set its font
        textField = new JTextField( "Leçon Française Apparaît Bien Nickelisée", 25 );
        textField.setFont( new Font( "Ubuntu", Font.PLAIN, 14 ) );
        this.add( textField ); // add textField to JFrame

        boldJCheckBox = new JCheckBox( "Bold" ); // create bold checkbox
        italicJCheckBox = new JCheckBox( "Italic" ); // create italic
        this.add( boldJCheckBox ); // add bold checkbox to JFrame
        this.add( italicJCheckBox ); // add italic checkbox to JFrame

        // register listeners for JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener( handler );
        italicJCheckBox.addItemListener( handler );
    } // end FrameWithChkBox constructor


    // private inner class for ItemListener event handling
    private class CheckBoxHandler implements ItemListener
    {
        // respond to checkbox events
        public void itemStateChanged( ItemEvent event )
        {
            Font fontDemo; // stores the new Font

            // determine which CheckBoxes are checked and create Font
            if ( boldJCheckBox.isSelected() && italicJCheckBox.isSelected() )
                fontDemo = new Font( "Ubuntu", Font.BOLD + Font.ITALIC, 14 );
            else if ( boldJCheckBox.isSelected() )
                fontDemo = new Font( "Ubuntu", Font.BOLD, 14 );
            else if ( italicJCheckBox.isSelected() )
                fontDemo = new Font( "Ubuntu", Font.ITALIC, 14 );
            else
                fontDemo = new Font( "Ubuntu", Font.PLAIN, 14 );

            textField.setFont( fontDemo ); // set textField's font
        } // end method itemStateChanged
    }
} // end class FrameWithChkBox