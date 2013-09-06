package dtfraca.MenuTabLookAndFeel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

/**
 * Demo UIManager, JComboBox, JRadioButton
 * This is the improved version (better syntax, better class organization) found in
 * Book "Java for developers, page 711, 22.6 Pluggable Look-and-Feel"
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-04-07 - tri
 */
public class LookAndFeel {
	public static void main(String[] args) {
		LookAndFeelFrame myFrame = new LookAndFeelFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400, 220);
		myFrame.setLocation(100, 200);
		myFrame.setVisible(true);
	}
}

class LookAndFeelFrame extends JFrame {
	private UIManager.LookAndFeelInfo[] infoLaFs; // L&F avaiable for this computer
	private String[] lafNames; // names of look and feels
	private JRadioButton[] radioLaFNames; // radioButton MenuItem to select look-and-feel
	private ButtonGroup grpRadioLaf;
	private JButton btnAbout;
	private JLabel lblMessage;
	private JComboBox comboLaFNames; // displays look of combo box

	public LookAndFeelFrame() {
		super("Pluggable Look-and-Feel DEMO");
		// get installed look-and-feel information
		infoLaFs = UIManager.getInstalledLookAndFeels();
		lafNames = new String[infoLaFs.length];
		for (int i = 0; i < infoLaFs.length; i++) {
			lafNames[i] = infoLaFs[i].getName();
		}

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(3, 1, 0, 5)); // row, col, horizGap, vertiGap
		add(northPanel, BorderLayout.NORTH);

		lblMessage = new JLabel("This is a " + lafNames[0] + " look-and-feel", SwingConstants.CENTER);
		lblMessage.setForeground(new Color(0, 40, 160));
		northPanel.add(lblMessage);
		btnAbout = new JButton("Check L&F ClassNames");
		northPanel.add(btnAbout);
		comboLaFNames = new JComboBox(lafNames);
		northPanel.add(comboLaFNames);

		comboLaFNames.addItemListener(new MyComboListener());

		// anonymous inner class: display message dialog when clicked
		btnAbout.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						// Build a msg containing the list of available Look & Feel Themes:
						StringBuilder sbMsg = new StringBuilder();
						sbMsg.append("UIManager.getInstalledLookAndFeels()\n\n");
						sbMsg.append("Name:\t ClassName\n");
						for (UIManager.LookAndFeelInfo lafInfo : infoLaFs) {
							sbMsg.append(String.format("%s:\t %s\n", lafInfo.getName(), lafInfo.getClassName()));
						}

						JOptionPane.showMessageDialog(LookAndFeelFrame.this,
								sbMsg.toString(),
								"Demo of Pluggable Look-and-Feel",
								JOptionPane.PLAIN_MESSAGE);
					}
				}
		);


		// create array for radioLaFNames buttons: each represents a choice of Pluggable Look and Feel
		radioLaFNames = new JRadioButton[infoLaFs.length];
		JPanel southPanel = new JPanel();
		add(southPanel, BorderLayout.SOUTH);

		grpRadioLaf = new ButtonGroup(); // Grouping all radioLaFNames menuitem together (so that only 1 item can be selected at a time)

		MyRadioItemListener itemHandler = new MyRadioItemListener();
		for (int count = 0; count < radioLaFNames.length; count++) {
			radioLaFNames[count] = new JRadioButton(lafNames[count]);
			radioLaFNames[count].addItemListener(itemHandler);
			grpRadioLaf.add(radioLaFNames[count]);
			southPanel.add(radioLaFNames[count]);
		}

		radioLaFNames[0].setSelected(true); // default selection = first L&F found in the list
	} // end constructor


	// use UIManager to change look-and-feel of GUI
	private void changeTheLookAndFeel(int value) {
		try {
			// set look-and-feel for this application
			UIManager.setLookAndFeel(infoLaFs[value].getClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Inner class Listener to handle events related to JRadioButton
	 */
	private class MyRadioItemListener implements ItemListener {
		// When an item changes States
		@Override
		public void itemStateChanged(ItemEvent event) {
			for (int kk = 0; kk < radioLaFNames.length; kk++) {
				if (radioLaFNames[kk].isSelected()) {
					lblMessage.setText(String.format("This is a %s look-and-feel", lafNames[kk]));
					// mirror de selected choice in the combobox
					comboLaFNames.setSelectedIndex(kk);
					changeTheLookAndFeel(kk);
				}
			}
		}
	}

	/**
	 * Inner class Listener to handle events related to Combobox Item
	 */
	private class MyComboListener implements ItemListener {
		// When an item changes States
		@Override
		public void itemStateChanged(ItemEvent event) {
			JComboBox cb = (JComboBox) event.getSource();
			//String itemText = (String)cb.getSelectedItem();
			int selectedItemIndex = cb.getSelectedIndex();
			changeTheLookAndFeel(selectedItemIndex);
			// mirror de selected choice in the radio buttons
			radioLaFNames[selectedItemIndex].setSelected(true);
		}
	}

}