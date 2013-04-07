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
 * "Java for developers, page 700, 22.4 Using Menus with Frames"
 * <p/>
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
	private JLabel lblSampleText; // displays sample text
	private ButtonGroup fontButtonGroup; // manages font menu items
	private ButtonGroup colorButtonGroup; // manages color menu items
	private int currFontStyle = Font.PLAIN; // used to create style for font


	public FrameWithMenu() {
		super("Using JMenus");


		JMenuBar barMenu = new JMenuBar(); // create menu bar
		setJMenuBar(barMenu);

		//=== Menu Item "File"=======================
		JMenu fileMenu = new JMenu("File"); // create file menu
		fileMenu.setMnemonic('F'); // set mnemonic to F

		JMenuItem aboutItem = new JMenuItem("About...");
		aboutItem.setMnemonic('A'); // set mnemonic to A
		fileMenu.add(aboutItem); // add about item to file menu
		aboutItem.addActionListener(
			new ActionListener() // anonymous inner class
			{
				// display message dialog when user selects About...
				public void actionPerformed(ActionEvent event) {
					JOptionPane.showMessageDialog(FrameWithMenu.this,
							"This is an example\nof using menus",
							"About", JOptionPane.PLAIN_MESSAGE);
				}
			}
		);

		JMenuItem exitItem = new JMenuItem("Exit"); // create exit item
		exitItem.setMnemonic('x'); // set mnemonic to x
		fileMenu.add(exitItem); // add exit item to file menu
		exitItem.addActionListener(
				new ActionListener() // anonymous inner class
				{
					// terminate application when user clicks exitItem
					public void actionPerformed(ActionEvent event) {
						System.exit(0); // exit application
					}
				}
		);

		barMenu.add(fileMenu); // add Format menu to menu bar


		//=== Menu Item "Format"=======================
		JMenu formatMenu = new JMenu("Format"); // create format menu
		formatMenu.setMnemonic('r'); // set mnemonic to r

		// array listing string colors
		String[] colors = {"Black", "Blue", "Red", "Green"};
		JMenu colorMenu = new JMenu("Color"); // create color menu
		colorMenu.setMnemonic('C'); // set mnemonic to C

		// create radio button menu items for colors
		colorItems = new JRadioButtonMenuItem[colors.length];
		colorButtonGroup = new ButtonGroup(); // manages colors
		ItemHandler itemHandler = new ItemHandler(); // handler for colors

		// create color radio button menu items
		for (int count = 0; count < colors.length; count++) {
			colorItems[count] =
					new JRadioButtonMenuItem(colors[count]); // create item
			colorMenu.add(colorItems[count]); // add item to color menu
			colorButtonGroup.add(colorItems[count]); // add to group
			colorItems[count].addActionListener(itemHandler);
		}
		colorItems[0].setSelected(true); // select first Color item
		formatMenu.add(colorMenu); // add color menu to format menu
		formatMenu.addSeparator(); // add separator in menu

		// array listing font names
		String[] fontNames = {"Serif", "Monospaced", "SansSerif"};
		JMenu fontMenu = new JMenu("Font"); // create font menu
		fontMenu.setMnemonic('n');

		// create radio button menu items for font names
		fonts = new JRadioButtonMenuItem[fontNames.length];
		fontButtonGroup = new ButtonGroup(); // manages font names

		// create Font radio button menu items
		for (int count = 0; count < fonts.length; count++) {
			fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
			fontMenu.add(fonts[count]); // add font to font menu
			fontButtonGroup.add(fonts[count]); // add to button group
			fonts[count].addActionListener(itemHandler); // add handler
		}
		fonts[0].setSelected(true); // select first Font menu item
		fontMenu.addSeparator(); // add separator bar to font menu
		String[] styleNames = {"Bold", "Italic"}; // names of styles
		styleItems = new JCheckBoxMenuItem[styleNames.length];

		StyleHandler styleHandler = new StyleHandler();

		// create style checkbox menu items
		for (int count = 0; count < styleNames.length; count++) {
			styleItems[count] =
					new JCheckBoxMenuItem(styleNames[count]); // for style
			fontMenu.add(styleItems[count]); // add to font menu
			styleItems[count].addItemListener(styleHandler); // handler
		}
		formatMenu.add(fontMenu); // add Font menu to Format menu
		barMenu.add(formatMenu); // add Format menu to menu bar


		//======= set up label to display text =====================
		lblSampleText = new JLabel("ABCdegf àçéêèîïôù 123456 !@#$%^&*", SwingConstants.CENTER);
		lblSampleText.setForeground(colorValues[0]);
		lblSampleText.setFont(new Font("Serif", Font.PLAIN, SAMPLE_FONTSIZE));
		getContentPane().setBackground(new Color(170, 220, 250));
		add(lblSampleText, BorderLayout.CENTER);
	} // end Constructor


	// inner class to handle action events from menu items
	private class ItemHandler implements ActionListener {
		// process color and font selections
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
	}


	private class StyleHandler implements ItemListener
	{
		// process font style selections
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
