package dtfraca.BricoTri.GUIDemo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFirstFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3842741273195735414L;
	private JTextField txtUserName;

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
	 * Create the frame.
	 */
	public MyFirstFrame() {
		setTitle("Capitalizer Utility");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtUserName = new JTextField();
		txtUserName.setText("IntelliJ Idea v12.0.4 & jdk 1.6.39");
		getContentPane().add(txtUserName);
		txtUserName.setColumns(15);
		
		JButton btnCapitalize = new JButton("Capitalize");
		btnCapitalize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtUserName.setText(txtUserName.getText().toUpperCase());
			}
		});
		getContentPane().add(btnCapitalize);
	}

}
