package dtfraca.GUIComponent;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.20 JTextArea
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-03-01 - tri
 */
public class TextAreaTest {
	public static void main(String[] args) {
		TextAreaFrame frm1 = new TextAreaFrame();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(425, 200); // set frame size
		frm1.setVisible(true); // display frame
	}
}


class TextAreaFrame extends JFrame {
	private JTextArea textArea1; // displays demo string
	private JTextArea textArea2; // highlighted text is copied here
	private JButton btnCopySelectedTxt; // initiates copying of text

	// Constructor
	public TextAreaFrame() {
		super("TextArea Demo");

/*
		  Box is a subclass of Container that uses
        a BoxLayoutTest layout manager (discussed in detail in Section 22.9) to arrange the GUI
        components either horizontally or vertically. Box’s static method createHorizontalBox
        creates a Box that arranges components from left to right in the order that they’re attached.
*/
		Box box = Box.createHorizontalBox();


		String txtDemo = "Les fleurs émettent un faible " +
				"champ électrique qui signale aux insectes " +
				"pollinisateurs la présence de nectar dans leur corolle.";

		textArea1 = new JTextArea(txtDemo, 10, 15); // rows:10, col:15
		textArea1.setLineWrap(true);

/*
		  NOTE: uses a JScrollPane to provide scrolling for a JTextArea. By default,
        JScrollPane displays scrollbars only if they’re required. You can set the horizontal and
        vertical scrollbar policies of a JScrollPane when it’s constructed.
        If a program has a reference to a JScrollPane, ScrollBarPolicy
        and the program can use methods setHorizontal to change the scrollbar policies at
        JScrollPane setVerticalScrollBarPolicy any time.
        Class JScrollPane declares the constants JScrollPane.XXX
        Example:

*/
		box.add(new JScrollPane(textArea1));

		btnCopySelectedTxt = new JButton("Copy >>>"); // create copy button
		box.add(btnCopySelectedTxt); // add copy button to box

		btnCopySelectedTxt.addActionListener(
				new ActionListener() // anonymous inner class
				{
					// set text in textArea2 to selected text from textArea1
					public void actionPerformed(ActionEvent event) {
						textArea2.setText(textArea1.getSelectedText());
					}
				}
		);

		textArea2 = new JTextArea(10, 15); // rows:10, col:15
		textArea2.setEditable(false); // disable editing
		textArea2.setLineWrap(true);
		box.add(new JScrollPane(textArea2)); // add scrollpane
		this.add(box);
	}
}
