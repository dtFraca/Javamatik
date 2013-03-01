package dtfraca.DemoManualGUI;

import java.awt.*;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.19 Using Panels to Manage More Complex Layouts
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-02-28 - tri
 */
public class PanelTest {
    public static void main(String[] args) {
        FrameWithPanel frm1 = new FrameWithPanel();
        frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm1.setSize(450, 200); // set frame size
        frm1.setVisible(true);
    }
}


class FrameWithPanel extends JFrame
{
    private JPanel panel1; // panel to hold buttons
    private JButton[] buttons; // array of buttons

    // constructor
    public FrameWithPanel()
    {
        super( "Panel Demo" );
        buttons = new JButton[ 5 ]; // create buttons array
        panel1 = new JPanel(); // set up panel
        panel1.setLayout(new GridLayout(1, buttons.length, 10, 10)); // row=1, column=number of buttons
        panel1.setBackground(Color.RED);

        // create and add buttons
        for ( int count = 0; count < buttons.length; count++ )
        {
            buttons[ count ] = new JButton( "Button " + ( count + 1 ) );
            panel1.add(buttons[count]); // add button to panel
        }

/*
        class JPanel does not have a content pane, unlike a JFrame.
        the code below uses the JFrame’s default BorderLayout to add panel1 to the
        SOUTH region. The SOUTH region is as tall as the buttons on panel1

        A JPanel is sized to surround exactly the components it contains. As more components are added,
        the JPanel grows (according to the restrictions of its layout manager) to accommodate the components.
        Resize the window to see how the layout manager affects the size of the JButtons.
 */
        this.add(panel1, BorderLayout.SOUTH); // add panel to JFrame
    }
}
