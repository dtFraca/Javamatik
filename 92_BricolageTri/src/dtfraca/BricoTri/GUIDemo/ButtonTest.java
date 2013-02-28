package dtfraca.BricoTri.GUIDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


/**
 * Book "Java for Programmers, 2ndEd" - 14.9 JButton
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-02-28 - tri
 */
public class ButtonTest {
    public static void main(String[] args) {

        FrameWithButton buttonFrame = new FrameWithButton(); // create ButtonFrame
        buttonFrame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        buttonFrame.setSize( 300, 170 ); // set frame size
        buttonFrame.setVisible( true ); // display frame
    }
}


// Class having No Access Modifier = visible to entire package
class FrameWithButton extends JFrame
{
    private JButton plainJButton; // button with just text
    private JButton fancyJButton; // button with icons

    // Constructor
    public FrameWithButton()
    {
        super( "Testing Buttons" );
        setLayout( new FlowLayout() ); // set frame layout
        plainJButton = new JButton( "Bouton Simple" ); // button with text
        this.add( plainJButton ); // add plainJButton to JFrame

        Icon iconBtn1 = new ImageIcon( getClass().getResource( "imgBoutonBleu.png" ) );
        Icon iconBtn2 = new ImageIcon( getClass().getResource( "imgBoutonRainbow.png" ) );
        fancyJButton = new JButton( "Bouton Deluxe", iconBtn1 ); // set image
        fancyJButton.setRolloverIcon( iconBtn2 ); // set rollover image
        this.add( fancyJButton ); // add fancyJButton to JFrame

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener( handler );
        plainJButton.addActionListener( handler );
    }

    // inner class for button event handling
    private class ButtonHandler implements ActionListener
    {
        // handle button event
        public void actionPerformed( ActionEvent event )
        {
            JOptionPane.showMessageDialog (
                FrameWithButton.this,
                String.format("Vous avez pressé: %s", event.getActionCommand() )
            );
        }
    }

} // end class FrameWithButton