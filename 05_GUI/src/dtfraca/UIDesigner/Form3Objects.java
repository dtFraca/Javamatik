package dtfraca.UIDesigner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class Description: ?
 * <p/>
 * 2013-04-04 - tri
 */
public class Form3Objects {
	private JTextField textField1;
	private JLabel lblSalut;
	private JButton btnDireBonjour;
	private JPanel panelMain;
	private int clickCount = 0;

	public static void main(String[] args) {
		JFrame frame = new JFrame("IntelliJ IDEA 12.1 GUI Designer - Test #1");
		frame.setContentPane(new Form3Objects().panelMain);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public Form3Objects() {
		btnDireBonjour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clickCount++;
				//NOTE: JTextField is single line display. To break line, must use JTextArea
				textField1.setText(String.format("Bonjour Maître !\nClick Count = %d", clickCount));
				lblSalut.setText("Votre GUI vous dit");
			}
		});
	}

}
