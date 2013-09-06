package dtfraca.LayoutManager;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.*;

/**
 * GridBagLayout
 * Book "Java for developers, page 725, 22.9 GridBag Layout"
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-04-08 - tri
 */
public class GridBagLayoutTest {
	public static void main(String[] args) {
		FrameWithGridBag myFrame = new FrameWithGridBag();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 150);
		myFrame.setLocation(200, 100);
		myFrame.setVisible(true);
	}
}

class FrameWithGridBag extends JFrame {
	private GridBagLayout layoutMgr; // layout of this frame
	private GridBagConstraints gbConstraints; // constraints of this layout


	public FrameWithGridBag() {
		super("GridBagLayout");

		layoutMgr = new GridBagLayout();
		setLayout(layoutMgr); // set frame layout
		gbConstraints = new GridBagConstraints(); // instantiate constraints

		JTextArea textArea1 = new JTextArea("TextArea1", 5, 10); //initial text, rows, columns
		textArea1.setLineWrap(true);
		JScrollPane scrollTA1 = new JScrollPane(textArea1);
		scrollTA1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		JTextArea textArea2 = new JTextArea("TextArea2", 2, 2); //initial text, rows, columns
		textArea2.setLineWrap(true);

		String[] names = {"Iron", "Steel", "Brass"};
		JComboBox comboBox = new JComboBox(names);
		JTextField textField = new JTextField("TextField");
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");

/*
GridBagConstraints fields.
--------------------------
anchor
	Specifies the relative position (NORTH, NORTHEAST, EAST,
	SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST, CENTER) of the
	component in an area that it does not fill.
   NOTE: The default anchor for all components is CENTER

fill
	Resizes the component in the specified direction (NONE,
	HORIZONTAL, VERTICAL, BOTH) when the display area is larger
	than the component.

gridx     : The column in which the component will be placed.
gridy     : The row in which the component will be placed.
gridwidth : The number of columns the component occupies.
gridheight: The number of rows the component occupies.
weightx   : The amount of extra space to allocate horizontally.
            The grid slot can become wider when extra space is available.
weighty   : The amount of extra space to allocate vertically. The grid slot
            can become taller when extra space is available.
*/

		//


		gbConstraints.weightx = 500; // force some width otherwise only the scrollbar is visible (bug?)
		gbConstraints.fill = GridBagConstraints.BOTH;
		//addComponent( textArea1, 0, 0, 1, 3 ); // gridX, gridY, gridWidth, gridHeight
		addComponent(scrollTA1, 0, 0, 1, 3); // gridX, gridY, gridWidth, gridHeight

		// button1: the default weightx and weighty for button1 are both 0
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		addComponent(button1, 1, 0, 2, 1); // gridX, gridY, gridWidth, gridHeight

		// button2
		gbConstraints.weightx = 1000; // can grow wider
		gbConstraints.weighty = 1; // can grow taller
		gbConstraints.fill = GridBagConstraints.BOTH;
		addComponent(button2, 1, 1, 1, 1); // gridX, gridY, gridWidth, gridHeight

		// button3: fill is BOTH
		gbConstraints.weightx = 0;
		gbConstraints.weighty = 0;
		addComponent(button3, 2, 1, 1, 1); // gridX, gridY, gridWidth, gridHeight

		// weightx and weighty for comboBox are both 0: the default fill is HORIZONTAL
		addComponent(comboBox, 1, 2, 2, 1); // gridX, gridY, gridWidth, gridHeight

		// weightx and weighty for textField are both 0, fill is BOTH
		addComponent(textField, 0, 3, 2, 1); // gridX, gridY, gridWidth, gridHeight

		// weightx and weighty for textArea2 are both 0, fill is BOTH
		addComponent(textArea2, 2, 3, 1, 1); // gridX, gridY, gridWidth, gridHeight

		//Change Look & Feel
		try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // end constructor


	// method to set constraints on
	private void addComponent(Component component, int gridX, int gridY, int gridWidth, int gridHeight) {
		gbConstraints.gridx = gridX; // column # (0-based)
		gbConstraints.gridy = gridY; // row # (0-based)
		gbConstraints.gridwidth = gridWidth; // The number of columns the component occupies.
		gbConstraints.gridheight = gridHeight; // The number of rows the component occupies.

		layoutMgr.setConstraints(component, gbConstraints);
		add(component);
	}
}
