package dtfraca.DemoManualGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

/**
 * Demo JMenuBar, JMenu, JMenuItem, ButtonGroup, JRadioButtonMenuItem, JCheckBoxMenuItem
 * This is the improved version (better syntax, better class organization) found in
 * Book "Java for developers, page 700, 22.4 Using Menus with Frames"
 * NOTE: this class is code manually (no GUI editor)
 *
 * 2013-04-07 - tri
 */
public class JMenuTest {
	public static void main(String[] args) {
		FrameWithMenu myFrame = new FrameWithMenu(); // create MenuFrame
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 200); // set frame size
		myFrame.setLocation(100, 200);
		myFrame.setVisible(true);
	}
}

class FrameWithMenu extends JFrame {

	final int SAMPLE_FONTSIZE = 32;

	private final Color[] colorValues = {Color.BLACK, Color.BLUE, Color.RED, new Color(0, 128, 0)};
	private JRadioButtonMenuItem[] colorItems; // color menu items
	private JRadioButtonMenuItem[] fonts; // font menu items
	private JCheckBoxMenuItem[] styleItems; // font style menu items
	private JLabel lblSampleText; // sample text to show the effects of Font, Color, Style
	private ButtonGroup fontButtonGroup; // grouping Radio Buttons for Font selection (so that only 1 item can be selected at a time)
	private ButtonGroup colorButtonGroup; // grouping Radio Buttons for Color selection (so that only 1 item can be selected at a time)
	private int currFontStyle = Font.PLAIN; // used to create style for font


	public FrameWithMenu() {
		super("Using JMenus");

		JMenuBar barMenu = new JMenuBar(); // create menu bar
		setJMenuBar(barMenu);

		//=== Menu Item "File"=======================
		JMenu fileMenu = new JMenu("File"); // create file menu
		fileMenu.setMnemonic('F'); // set mnemonic to F
		barMenu.add(fileMenu);

		JMenuItem aboutItem = new JMenuItem("About...");
		aboutItem.setMnemonic('A');
		fileMenu.add(aboutItem);

		// anonymous inner class: display message dialog when user clicks About...
		aboutItem.addActionListener(
			new ActionListener()
			{
				//
				public void actionPerformed(ActionEvent event) {
					JOptionPane.showMessageDialog(FrameWithMenu.this,
							"This is an example\nof using menus",
							"About",
							JOptionPane.PLAIN_MESSAGE);
				}
			}
		);

		JMenuItem exitItem = new JMenuItem("Exit"); // create exit item
		exitItem.setMnemonic('x');
		fileMenu.add(exitItem);

		// anonymous inner class: terminate application when user clicks exitItem
		exitItem.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event) {
						System.exit(0); // exit application
					}
				}
		);



		//=== Menu Item "Format"=======================
		JMenu formatMenu = new JMenu("Format"); // create format menu
		formatMenu.setMnemonic('r');
		barMenu.add(formatMenu);

		MyMenuItemListener itemHandler = new MyMenuItemListener(); // common handler for MenuItems

		// array listing string colors
		String[] colors = {"Black", "Blue", "Red", "Green"};
		JMenu colorMenu = new JMenu("Color"); // create color menu
		colorMenu.setMnemonic('C');

		// create radio button menu items for colors
		colorItems = new JRadioButtonMenuItem[colors.length];
		colorButtonGroup = new ButtonGroup(); // Grouping all color MenuItems together (so that only 1 item can be selected at a time)

		// create color radio button menu items
		for (int count = 0; count < colors.length; count++) {
			colorItems[count] = new JRadioButtonMenuItem(colors[count]); // create item
			colorMenu.add(colorItems[count]); // add item to color menu
			colorButtonGroup.add(colorItems[count]); // add to group
			colorItems[count].addActionListener(itemHandler);
		}
		colorItems[0].setSelected(true); // select first Color item
		formatMenu.add(colorMenu);
		formatMenu.addSeparator();

		// array listing font names
		String[] fontNames = {"Serif", "Monospaced", "SansSerif"};
		JMenu fontMenu = new JMenu("Font");
		fontMenu.setMnemonic('n');

		// create radio button menu items for font names
		fonts = new JRadioButtonMenuItem[fontNames.length];
		fontButtonGroup = new ButtonGroup(); // Grouping all font MenuItems together (so that only 1 item can be selected at a time)

		// create Font radio button menu items
		for (int count = 0; count < fonts.length; count++) {
			fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
			fontMenu.add(fonts[count]);
			fontButtonGroup.add(fonts[count]);
			fonts[count].addActionListener(itemHandler);
		}
		fonts[0].setSelected(true); // select first Font menu item
		fontMenu.addSeparator();

		String[] styleNames = {"Bold", "Italic"}; // names of styles
		styleItems = new JCheckBoxMenuItem[styleNames.length];

		// create style checkbox menu items
		for (int count = 0; count < styleNames.length; count++) {
			styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);
			fontMenu.add(styleItems[count]);
			styleItems[count].addItemListener(itemHandler);
		}
		formatMenu.add(fontMenu);


		//======= set up label to display text =====================
		lblSampleText = new JLabel("ABCdegf àçéêèîïôù 123456 !@#$%^&*", SwingConstants.CENTER);
		lblSampleText.setForeground(colorValues[0]);
		lblSampleText.setFont(new Font("Serif", Font.PLAIN, SAMPLE_FONTSIZE));
		getContentPane().setBackground(new Color(170, 220, 250));
		add(lblSampleText, BorderLayout.CENTER);
	} // end Constructor


	/**
	 * Inner class Listener to handle events related to MenuItem
	 */
	private class MyMenuItemListener implements ActionListener, ItemListener {

		// When an item is selected
		@Override
		public void actionPerformed(ActionEvent event) {

			// process color selection
			for (int count = 0; count < colorItems.length; count++) {
				if (colorItems[count].isSelected()) {
					lblSampleText.setForeground(colorValues[count]);
					break;
				}
			}

			// process font selection
			for (int count = 0; count < fonts.length; count++) {
				if (event.getSource() == fonts[count]) {
					lblSampleText.setFont(new Font(fonts[count].getText(), currFontStyle, SAMPLE_FONTSIZE));
				}
			}
			repaint(); // redraw application
		}


		// When a JCheckBoxMenuItem changes state
		@Override
		public void itemStateChanged( ItemEvent e )
		{
			// determine which items are checked and create Font
			if ( styleItems[ 0 ].isSelected() && styleItems[ 1 ].isSelected() )
				currFontStyle = Font.BOLD + Font.ITALIC;
			else if ( styleItems[ 0 ].isSelected() )
				currFontStyle = Font.BOLD;
			else if ( styleItems[ 1 ].isSelected() )
				currFontStyle = Font.ITALIC;
			else
				currFontStyle = Font.PLAIN;

			String name = lblSampleText.getFont().getName(); // current Font
			Font font = new Font( name, currFontStyle, SAMPLE_FONTSIZE );
			lblSampleText.setFont(font);
			repaint(); // redraw application
		}
	}

}
