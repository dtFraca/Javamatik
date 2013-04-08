package dtfraca.GUIComponent;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


/**
 * Book "Java for Programmers, 2ndEd" - 14.6 Text Fields and an Introduction to Event Handling with Nested Classes
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-02-28 - tri
 */
public class TextFieldTest {
	public static void main(String[] args) {
		FrameWithTextField frm1 = new FrameWithTextField();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(350, 100); // set frame size (x,y)
		frm1.setVisible(true); // display frame
	}
}


/*
Java Access Modifiers:
- private..: Visible to the class only
- protected: Visible to the package and all subclasses
- (none)...: Visible to the package (default)
- public...: Visible to the world
*/
class FrameWithTextField extends JFrame {
	private JTextField textField1; // text field with set size
	private JTextField textField2; // text field constructed with text
	private JTextField textField3; // text field with text and size
	private JPasswordField passwordField; // password field with text


	// Constructor adds JTextFields to JFrame
	public FrameWithTextField() {
		super("Testing JTextField and JPasswordField");
		setLayout(new FlowLayout()); // set frame layout

		// construct textfield with 10 columns
		textField1 = new JTextField(10);
		this.add(textField1); // add textField1 to JFrame

		// construct textfield with default text
		textField2 = new JTextField("Taper qqc SVP");
		textField2.setColumns(15);
		this.add(textField2); // add textField2 to JFrame

		// construct textfield with default text and 21 columns
		textField3 = new JTextField("Uneditable text field", 21);
		textField3.setEditable(false); // disable editing
		this.add(textField3); // add textField3 to JFrame

		// construct passwordfield with default text
		passwordField = new JPasswordField("Hidden text");
		this.add(passwordField); // add passwordField to JFrame

		// register event handlers
		MyTextFieldHandler handler = new MyTextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}


	// private inner class for event handling
	private class MyTextFieldHandler implements ActionListener {
		/*
				  When an event occurs, the
				  GUI component receives (from the JVM) a unique event ID specifying the event type.
				  The GUI component uses the event ID to decide the listener type to which the event
				  should be dispatched and to decide which method to call on each listener object. For an
				  ActionEvent, the event is dispatched to every registered ActionListener’s actionPer-
				  formed method (the only method in interface ActionListener)
		*/
		public void actionPerformed(ActionEvent event) {
			String feedbackTxt = ""; // declare string to display

			// user pressed Enter in JTextField textField1
			if (event.getSource() == textField1)
				feedbackTxt = String.format("textField1: %s", event.getActionCommand()); // obtain the text the user typed in the text field that generated the event.

				// user pressed Enter in JTextField textField2
			else if (event.getSource() == textField2)
				feedbackTxt = String.format("textField2: %s", event.getActionCommand());

				// user pressed Enter in JTextField textField3
			else if (event.getSource() == textField3)
				feedbackTxt = String.format("textField3: %s", event.getActionCommand());

				// user pressed Enter in JTextField passwordField
			else if (event.getSource() == passwordField)
				feedbackTxt = String.format("passwordField: %s", event.getActionCommand());

			// display JTextField content
			JOptionPane.showMessageDialog(null, feedbackTxt);
		}
	} // end private inner class MyTextFieldHandler

} // end FrameWithTextField

