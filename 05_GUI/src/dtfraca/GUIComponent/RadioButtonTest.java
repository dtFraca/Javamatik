package dtfraca.GUIComponent;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;


/**
 * Book "Java for Programmers, 2ndEd" - 14.10.2 JRadioButton
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-02-28 - tri
 */
public class RadioButtonTest {
	public static void main(String[] args) {
		FrameWithRadio frm1 = new FrameWithRadio();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(350, 100); // set frame size (x,y)
		frm1.setVisible(true); // display frame
	}
}


// Class having No Access Modifier = visible to entire package
class FrameWithRadio extends JFrame {
	private JTextField textField; // used to display font changes
	private Font plainFont; // font for plain text
	private Font boldFont; // font for bold text
	private Font italicFont; // font for italic text
	private Font boldItalicFont; // font for bold and italic text
	private JRadioButton plainJRadioButton; // selects plain text
	private JRadioButton boldJRadioButton; // selects bold text
	private JRadioButton italicJRadioButton; // selects italic text
	private JRadioButton boldItalicJRadioButton; // bold and italic
	private ButtonGroup radioGroup; // buttongroup to hold radio buttons

	// FrameWithRadio constructor adds JRadioButtons to JFrame
	public FrameWithRadio() {
		super("RadioButton Test");
		setLayout(new FlowLayout()); // set frame layout
		textField = new JTextField("Leçon Française Apparaît Bien Nickelisée", 25);
		this.add(textField); // add textField to JFrame

		// create radio buttons
		plainJRadioButton = new JRadioButton("Plain", true);
		boldJRadioButton = new JRadioButton("Bold", false);
		italicJRadioButton = new JRadioButton("Italic", false);
		boldItalicJRadioButton = new JRadioButton("Bold+Italic", false);
		this.add(plainJRadioButton); // add plain button to JFrame
		this.add(boldJRadioButton); // add bold button to JFrame
		this.add(italicJRadioButton); // add italic button to JFrame
		this.add(boldItalicJRadioButton); // add bold and italic button

		// create logical relationship between JRadioButtons
		radioGroup = new ButtonGroup(); // create ButtonGroup
		radioGroup.add(plainJRadioButton); // add plain to group
		radioGroup.add(boldJRadioButton); // add bold to group
		radioGroup.add(italicJRadioButton); // add italic to group
		radioGroup.add(boldItalicJRadioButton); // add bold and italic

		// create font objects
		plainFont = new Font("Ubuntu", Font.PLAIN, 14);
		boldFont = new Font("Ubuntu", Font.BOLD, 14);
		italicFont = new Font("Ubuntu", Font.ITALIC, 14);
		boldItalicFont = new Font("Ubuntu", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont); // set initial font to plain

		// register events for JRadioButtons
		plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
	}


	// private inner class to handle radio button events
	private class RadioButtonHandler implements ItemListener {
		private Font font; // font associated with this listener

		public RadioButtonHandler(Font f) {
			font = f; // set the font of this listener
		}

		// handle radio button events
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font); // set font of textField
		}
	}

} // end class FrameWithRadio