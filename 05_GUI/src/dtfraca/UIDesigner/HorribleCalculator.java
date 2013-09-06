package dtfraca.UIDesigner;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * This form uses Layout Manager = FormLayout (JGoodies)
 * MUST add in module dependencies the library /usr/local/IntelliJ/lib/jgoodies-forms.jar
 * Menu File / Project Structure -> Select Modules -> Dependencies Tab
 * <p/>
 * 1. use anonymous listener to Handle button click
 * 2. use a common listener to handle radiobutton itemStateChanged within the SAME class (implements ItemListener)
 * 3. Playaround with UIManager to set the LookAndFeel theme
 * <p/>
 * 2013-04-04 - tri
 */
public class HorribleCalculator implements ItemListener //ActionListener,
{
	private JPanel panel1;
	private JTextField txtNumber2;
	private JTextField txtNumber1;
	private JRadioButton radioAddition;
	private JRadioButton radioSubstraction;
	private JTextField txtResult;
	private JButton btnCalculate;
	private JRadioButton radioMultiplication;
	private JRadioButton radioDivision;
	private JLabel lblMessage;
	private JRadioButton radioLaFGTK;
	private JRadioButton radioLaFMetal;
	private JRadioButton radioLaFNimbus;
	private JRadioButton radioLaFCDEMotif;

	public HorribleCalculator() {
		//init some initial values
		txtNumber1.setText("12.33");
		txtNumber2.setText("3.45");

		// List of available Look & Feel Themes:
		StringBuilder sbAvailLaF = new StringBuilder();
		UIManager.LookAndFeelInfo plaf[] = UIManager.getInstalledLookAndFeels();
		System.out.println("===== UIManager.getInstalledLookAndFeels() =====");
		for (int i = 0, n = plaf.length; i < n; i++) {
			sbAvailLaF.append(String.format("[%s] ", plaf[i].getName()));
			//sbAvailLaF.append(String.format("[%s] ", plaf[i].getClassName()));
			System.out.println("Name: " + plaf[i].getName());
			System.out.println("  Class name: " + plaf[i].getClassName());
		}
		lblMessage.setText(sbAvailLaF.toString());

		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(txtNumber1.getText());
				double n2 = Double.parseDouble(txtNumber2.getText());

				if (radioAddition.isSelected()) {
					txtResult.setText(String.format("%.2f", n1 + n2));
				} else if (radioSubstraction.isSelected()) {
					txtResult.setText(String.format("%.2f", n1 - n2));
				} else if (radioMultiplication.isSelected()) {
					txtResult.setText(String.format("%.2f", n1 * n2));
				} else if (radioDivision.isSelected()) {
					txtResult.setText(String.format("%.2f", n1 / n2));
				}
				//To change body of implemented methods use File | Settings | File Templates.
			}

		});

		radioLaFGTK.addItemListener(this);
		radioLaFMetal.addItemListener(this);
		radioLaFNimbus.addItemListener(this);
		radioLaFCDEMotif.addItemListener(this);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("HorribleCalculator");
		frame.setContentPane(new HorribleCalculator().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(200, 50);

/*
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		frame.setSize(screenWidth / 2, screenHeight / 2);
		frame.setLocation(screenWidth / 4, screenHeight / 4);
*/

	}


	//public void actionPerformed(ActionEvent evt) {
	//}

	// handle radio button events
	public void itemStateChanged(ItemEvent evt) {
		//LookAndFeel laf = UIManager.getLookAndFeel();
		JRadioButton source = (JRadioButton) evt.getSource();

		if (source == radioLaFGTK)
			try {
				//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
				SwingUtilities.updateComponentTreeUI(panel1);
			} catch (Exception e) {
				lblMessage.setText("Error setting GTK+ LAF: " + e);
			}

		else if (source == radioLaFMetal)
			try {
				// cross-platform Java L&F (also called "Metal")
				//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
				SwingUtilities.updateComponentTreeUI(panel1);
			} catch (Exception e) {
				lblMessage.setText("Error setting CrossPlatform LAF: " + e);
			}

		else if (source == radioLaFCDEMotif)
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				SwingUtilities.updateComponentTreeUI(panel1);
			} catch (Exception e) {
				lblMessage.setText("Error setting Motif LAF: " + e);
			}

		else if (source == radioLaFNimbus)
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				SwingUtilities.updateComponentTreeUI(panel1);
			} catch (Exception e) {
				lblMessage.setText("Error setting Nimbus LAF: " + e);
			}

		lblMessage.setText(String.format("Look and Feel: %s", UIManager.getLookAndFeel().getName()));

	}

}
