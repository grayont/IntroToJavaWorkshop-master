package day3;

import javax.swing.JOptionPane;

public class Greeting {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "How do you close this window?");
		JOptionPane.showMessageDialog(null, "You said " + answer) ; 
		JOptionPane.showMessageDialog(null, "The answer was the OK button OR the red X");
	}

}
