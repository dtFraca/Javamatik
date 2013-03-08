package dtfraca.DemoManualGUI;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

/**
 * Book "Java for Programmers, 2ndEd" - 14.12 JList
 * ATTN: demonstrate usage of "anonymous inner class" as event handler
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-02-28 - tri
 */
public class ListSingleSelectionTest {
	public static void main(String[] args) {
		FrameWithList frm1 = new FrameWithList(); // create FrameWithList
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(350, 200); // set frame size (x,y)
		frm1.setVisible(true); // display frame
	}
}


// Class having No Access Modifier = visible to entire package
class FrameWithList extends JFrame {
	private JList colorJList; // list to display colors

	private static final String[] colorNames = {"Black", "Blue", "Cyan",
			"Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
			"Orange", "Pink", "Red", "White", "Yellow"};

	private static final Color[] colors = {Color.BLACK, Color.BLUE,
			Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
			Color.RED, Color.WHITE, Color.YELLOW};

	// FrameWithList constructor add JScrollPane containing JList to JFrame
	public FrameWithList() {
		super("List Test");
		setLayout(new FlowLayout()); // set frame layout
		colorJList = new JList(colorNames); // create with colorNames
		colorJList.setVisibleRowCount(7); // nb of max visible rows in the ListBox

		// do not allow multiple selections
		colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Allow JList to have a scrollbar: JScrollPane
		// Reason: Unlike a JComboBox, a JList does not provide a scrollbar if there are more items in the list than
		// the number of visible rows. In this case, a JScrollPane object is used to provide the scrolling capability
		this.add(new JScrollPane(colorJList));

		// Event handler by anonymous inner class
		// NOTE: an anonymous inner class can access its top-level class members (lblDemo in this example)
		colorJList.addListSelectionListener(
				new ListSelectionListener() // anonymous inner class
				{
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
					}
				}
		);
	}
} // end class FrameWithList