package dtfraca.ColorFont2D;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 * Book "Java for Programmers, 2ndEd" - 15.3 Color Control
 * Demo JColorChooser dialog of the Package javax.swing
 * (GUI component that enables application users to select colors)
 *
 * 2013-03-01 - tri
 */
public class ColorChooserTest {
    public static void main(String[] args) {
        MyFrameColorChooser frm1 = new MyFrameColorChooser();
        frm1.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frm1.setSize( 400, 130 ); // set frame size
        frm1.setVisible( true ); // display frame
    }
}


class MyFrameColorChooser extends JFrame
{
    private JButton btnChgColor;
    private Color colorBackgnd = Color.LIGHT_GRAY;
    private JPanel colorJPanel;


    // set up GUI
    public MyFrameColorChooser()
    {
        super( "Using JColorChooser" );

        // create JPanel for display colorBackgnd
        colorJPanel = new JPanel();
        colorJPanel.setBackground(colorBackgnd);

        // set up btnChgColor and register its event handler
        btnChgColor = new JButton( "Change Color" );

        btnChgColor.addActionListener(
            new ActionListener() // anonymous inner class
            {
                // display JColorChooser when user clicks button
                public void actionPerformed(ActionEvent event) {
                    colorBackgnd = JColorChooser.showDialog(MyFrameColorChooser.this, "Choose a color", colorBackgnd);

                    // set default colorBackgnd, if no colorBackgnd is returned
                    if (colorBackgnd == null)
                        colorBackgnd = Color.LIGHT_GRAY;

                    // change content pane's background colorBackgnd
                    colorJPanel.setBackground(colorBackgnd);
                }
            }
        );

        this.add(colorJPanel, BorderLayout.CENTER); // add colorJPanel
        this.add(btnChgColor, BorderLayout.SOUTH); // add button
    }
}
