package dtfraca.DemoManualGUI;

import javax.swing.*;

/**
 * Swing class JOptionPane (showInputDialog & showMessageDialog)
 * Book "Java for Programmers, 2ndEd" - 14.3 Simple GUI-Based Input/Output with JOptionPane
 *
 * 2013-02-22 - tri
 */
public class AdditionDialog {
    public static void main(String[] args) {
        String strN1 = JOptionPane.showInputDialog("Enter integer N1");
        String strN2 = JOptionPane.showInputDialog("Enter integer N2");

        int n1 = Integer.parseInt( strN1 );
        int n2 = Integer.parseInt( strN2 );

        JOptionPane.showMessageDialog(
                null, //parent component, null = display msg in center of screen
                String.format("%d + %d = %d",n1, n2,  (n1 + n2)), // body text of msgBox
                "Addition du Pauvre (GUI)", // title of msgBox
                JOptionPane.INFORMATION_MESSAGE // msg type
        );
    }
}
