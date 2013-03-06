package dtfraca.DemoManualGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Book "Java for Programmers, 2ndEd" - 14.13 Multiple-Selection Lists
 * ATTN: demonstrate usage of "anonymous inner class" as event handler
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-02-28 - tri
 */
public class ListMultipleSelectionTest {
	public static void main(String[] args) {

		FrameWithListMutiSelect frm1 = new FrameWithListMutiSelect();
		frm1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm1.setSize(350, 230); // set frame size
		frm1.setVisible(true); // display frame (x,y)
	}
}


class FrameWithListMutiSelect extends JFrame {
	private JList colorJList; // list to hold color names
	private JList copyJList; // list to copy color names into
	private JButton copyJButton; // button to copy selected names
	private static final String[] colorNames = {
			"Janvier", "Février", "Mars", "Avril", "Mai", "Juin",
			"Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre",
			"-------",
			"Lundi", "Mardi", "Mercdredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"
	};

	// constructor
	public FrameWithListMutiSelect() {
		super("Multiple Selection Lists");
		setLayout(new FlowLayout()); // set frame layout

		colorJList = new JList(colorNames); // holds names of all colors
		colorJList.setVisibleRowCount(10); // nb visble items in the list
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		// Allow JList to have a scrollbar: JScrollPane
		// Reason: Unlike a JComboBox, a JList does not provide a scrollbar if there are more items in the list than
		// the number of visible rows. In this case, a JScrollPane object is used to provide the scrolling capability
		this.add(new JScrollPane(colorJList)); // add list with scrollpane

		copyJButton = new JButton("Copy >>>"); // create copy button
		copyJButton.addActionListener(
				new ActionListener() // anonymous inner class
				{
					// handle button event
					public void actionPerformed(ActionEvent event) {
						// place selected values in copyJList
						copyJList.setListData(colorJList.getSelectedValues());
					}
				}
		);

		this.add(copyJButton); // add copy button to JFrame

		copyJList = new JList(); // create list to hold copied color names
		copyJList.setVisibleRowCount(7);
		copyJList.setFixedCellWidth(100); // set width
		copyJList.setFixedCellHeight(15); // set height
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJList)); // add list with scrollpane
	}
}