package dtfraca.GUIComponent;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.11 JComboBox; Using an Anonymous Inner Class for Event Handling
 * ATTN: demonstrate usage of "anonymous inner class" as event handler
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-02-28 - tri
 */
public class ComboboxTest {
	public static void main(String[] args) {
		FrameWithCombo frm1 = new FrameWithCombo();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(400, 200); // set frame size (x,y)
		frm1.setVisible(true); // display frame
	}
}


// Class having No Access Modifier = visible to entire package
class FrameWithCombo extends JFrame {
	private JComboBox comboImgFileList; // combobox to hold imgFileNames of icons
	private JLabel lblDemo;
	private static final String[] imgFileNames = {"imgBoutonBleu.png", "imgBoutonRainbow.png", "imgGatito.jpg", "imgBird.png"};

	private Icon[] icons = {
			new ImageIcon(getClass().getResource("/resource/" + imgFileNames[0])),
			new ImageIcon(getClass().getResource("/resource/" + imgFileNames[1])),
			new ImageIcon(getClass().getResource("/resource/" + imgFileNames[2])),
			new ImageIcon(getClass().getResource("/resource/" + imgFileNames[3]))
	};

	// FrameWithCombo constructor adds JComboBox to JFrame
	public FrameWithCombo() {
		super("Testing JComboBox");
		setLayout(new FlowLayout()); // set frame layout
		comboImgFileList = new JComboBox(imgFileNames); // set up JComboBox
		comboImgFileList.setMaximumRowCount(3); // display three rows

		// Event handler by anonymous inner class
		// NOTE: an anonymous inner class can access its top-level class members (lblDemo in this example)
		comboImgFileList.addItemListener(
				new ItemListener() {
					// handle JComboBox event
					public void itemStateChanged(ItemEvent event) {
						if (event.getStateChange() == ItemEvent.SELECTED)
							lblDemo.setIcon(icons[comboImgFileList.getSelectedIndex()]);
					}
				}
		);

		this.add(comboImgFileList); // add combobox to JFrame

		lblDemo = new JLabel(icons[0]); // display first icon
		this.add(lblDemo);
	}

} // end class FrameWithCombo
