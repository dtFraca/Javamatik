package dtfraca.BricoTri.GUIDemo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFirstFrame extends JFrame {
	private static final long serialVersionUID = -3842741273195735414L;
	private JTextField txtUserName;
    private JLabel labelEcho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstFrame frame = new MyFirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor JFrame + add some widgets: Inputbox, Label, Button
	 */
	public MyFirstFrame() {
		setTitle("Transform Lowercase & Uppercase");
		setBounds(100, 100, 450, 200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Frame Layout examples: http://www.cis.upenn.edu/~matuszek/cit591-2004/Pages/layout-examples.html
		//getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        getContentPane().setLayout(new GridLayout(5, 5));

		
		txtUserName = new JTextField();
		txtUserName.setText("IntelliJ Idea v12.0.4 & jdk 1.6.39 - dTfRaCa");
		txtUserName.setColumns(20);
        getContentPane().add(txtUserName);

        labelEcho = new JLabel("(will contain text in lowercase)");
        labelEcho.setToolTipText( "This label will echo the text in lowercase" );
        add(labelEcho); // add label1 to JFrame

		JButton btnCapitalize = new JButton("Upper + Lower");

        //Click button: change content of inputbox and Label
		btnCapitalize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtUserName.setText(txtUserName.getText().toUpperCase());
                labelEcho.setText(txtUserName.getText().toLowerCase());
			}
		});
		getContentPane().add(btnCapitalize);
	}

}
