package dtfraca.UIDesigner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This form uses Layout Manager = FormLayout (JGoodies)
 * MUST add in module dependencies the library /usr/local/IntelliJ/lib/jgoodies-forms.jar
 * Menu File / Project Structure -> Select Modules -> Dependencies Tab
 *
 * 2013-04-04 - tri
 */
public class HorribleCalculator {
	private JPanel panel1;
	private JTextField txtNumber2;
	private JTextField txtNumber1;
	private JRadioButton radioAddition;
	private JRadioButton radioSubstraction;
	private JTextField txtResult;
	private JButton btnCalculate;
	private JRadioButton radioMultiplication;
	private JRadioButton radioDivision;

	public HorribleCalculator() {
		//init some initial values
		txtNumber1.setText("12.33");
		txtNumber2.setText("3.45");

		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(txtNumber1.getText());
				double n2 = Double.parseDouble(txtNumber2.getText());

				if (radioAddition.isSelected()) {
					txtResult.setText(String.format("%.2f", n1 + n2));
				}
				else if (radioSubstraction.isSelected()) {
					txtResult.setText(String.format("%.2f", n1 - n2));
				}
				else if (radioMultiplication.isSelected()) {
					txtResult.setText(String.format("%.2f", n1 * n2));
				}
				else if (radioDivision.isSelected()) {
					txtResult.setText(String.format("%.2f",  n1 / n2));
				}
				//To change body of implemented methods use File | Settings | File Templates.
			}

		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("HorribleCalculator");
		frame.setContentPane(new HorribleCalculator().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
