package dtfraca.MenuTabLookAndFeel;

import java.awt.*;
import javax.swing.*;

/**
 * Demo: JTabbedPaneTest
 * Book "Java for developers, page 720, 22.8 JTabbedPane"
 * NOTE: this class is code manually (no GUI editor)
 * <p/>
 * 2013-04-07 - tri
 */
public class JTabbedPaneTest {
	public static void main(String[] args) {
		JTabbedPaneFrame myFrame = new JTabbedPaneFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400, 200);
		myFrame.setLocation(200, 100);
		myFrame.setVisible(true);
	}
}


class JTabbedPaneFrame extends JFrame {
	public JTabbedPaneFrame() {
		super("JTabbedPaneTest Demo ");
		JTabbedPane tabbedPane = new JTabbedPane();

		//Tab #1
		JLabel label1 = new JLabel("Panel One (#1)", SwingConstants.CENTER);
		JPanel panel1 = new JPanel(); // create first panel
		panel1.add(label1);
		tabbedPane.addTab("Tab #1", null, panel1, "First Panel"); //title, icon, component, tooltip

		//Tab #2
		JLabel label2 = new JLabel("Voici l'Onglet Numéro 2", SwingConstants.CENTER);
		label2.setForeground(new Color(0, 40, 90));
		label2.setFont(new Font("Ubuntu", Font.BOLD, 14));

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(120, 200, 180)); // green pastel
		panel2.add(label2);
		tabbedPane.addTab("Tab Deux", null, panel2, "Le Deuxième Panel"); //title, icon, component, tooltip

		//Tab #3
		JLabel label3 = new JLabel("Welcome to Panel #3", SwingConstants.CENTER);
		label3.setForeground(new Color(220, 0, 90));
		label3.setFont(new Font("Droid Sans", Font.BOLD, 14));

		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout()); // use borderlayout
		panel3.add(new JButton("North"), BorderLayout.NORTH);
		panel3.add(new JButton("West"), BorderLayout.WEST);
		panel3.add(new JButton("East"), BorderLayout.EAST);

		panel3.add(new JButton("South"), BorderLayout.SOUTH);
		panel3.add(label3);
		tabbedPane.addTab("Tab Three", null, panel3, "Third Panel"); //title, icon, component, tooltip

		// add JTabbedPaneTest to frame
		add(tabbedPane);


		//Set Native GUI (less ugly than the default Java Metal Look & Feel)
		try {
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // NOT WORKING: give same than Metal theme
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}