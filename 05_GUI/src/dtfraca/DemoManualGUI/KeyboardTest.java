package dtfraca.DemoManualGUI;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;


/**
 * Book "Java for Programmers, 2ndEd" - 14.17 Key Event Handling
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-02-28 - tri
 */
public class KeyboardTest {
	public static void main(String[] args) {
		KeyDemoFrame frm1 = new KeyDemoFrame();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(350, 100); // set frame size
		frm1.setVisible(true); // display frame
	}
}

/**
 * Frame Demo
 * ATTENTION: The Frame implement itself the interface KeyListener
 * so the frame references to itself as event handler
 */
class KeyDemoFrame extends JFrame implements KeyListener {
	private String line1 = ""; // first line of textarea
	private String line2 = ""; // second line of textarea
	private String line3 = ""; // third line of textarea
	private JTextArea textArea; // textarea to display output

	// KeyDemoFrame constructor
	public KeyDemoFrame() {
		super("Demonstrating Keystroke Events");
		textArea = new JTextArea(10, 15); // set up JTextArea
		textArea.setText("Press any key on the keyboard...");
		textArea.setEnabled(false); // disable textarea
		textArea.setDisabledTextColor(Color.BLACK); // set text color
		add(textArea); // add textarea to JFrame
		addKeyListener(this); // allow frame to process key events
	}

	// Method keyPressed is called in response to pressing any key
	public void keyPressed(KeyEvent event) {
		line1 = String.format("Key PRESSED: %s (Keycode: %d)", KeyEvent.getKeyText(event.getKeyCode()), event.getKeyCode());
		this.summaryKeyStatus(event);
	}


	// Method keyTyped is called in response to pressing any key that is not an action key.
	// (The action keys are any arrow key, Home, End, Page Up, Page Down, any function key, etc.)
	public void keyTyped(KeyEvent event) {
		line1 = String.format("Key TYPED: %s", event.getKeyChar());
		this.summaryKeyStatus(event);
	}


	// Method keyReleased is called when the key is released after any keyPressed or keyTyped event
	public void keyReleased(KeyEvent event) {
		line1 = String.format("Key RELEASED: %s (Keycode: %d)", KeyEvent.getKeyText(event.getKeyCode()), event.getKeyCode());
		this.summaryKeyStatus(event);
	}


	private void summaryKeyStatus(KeyEvent event) {
		line2 = String.format("This key is %san action key", (event.isActionKey() ? "" : "not "));

		// Check if Ctrl, Shift, Alt is/are pressed (any combination is possible, Ex: Ctrl+Shit or Ctrl+Shift+Alt)
		String modifKeyStatus = KeyEvent.getKeyModifiersText(event.getModifiers());
		line3 = String.format("Modifier keys pressed: %s", (modifKeyStatus.equals("") ? "(none)" : modifKeyStatus)); // output modifiers

		textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3)); // output three lines of text
	}
}