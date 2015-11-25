package day3;

import javax.swing.JOptionPane;

public class Stalker {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
				String address = JOptionPane.showInputDialog("What's your address?");
						String motherName = JOptionPane.showInputDialog("What is your mother's name?");
						String credit = JOptionPane.showInputDialog("What's your credit card number?");
						String alone = JOptionPane.showInputDialog("Where would you be alone on a typical day?");
					    String die = JOptionPane.showInputDialog("How would you like to die one day?");
					    JOptionPane.showMessageDialog(null, "Hello there " + name);
					    JOptionPane.showMessageDialog(null, "Now that I know you live at " + address);
					    JOptionPane.showMessageDialog(null, "Your mom, " + motherName);
					    JOptionPane.showMessageDialog(null, "will never find you");
					    JOptionPane.showMessageDialog(null, "And I'm going to buy everythign I've ever wanted with your credit card number, " + credit);
					    JOptionPane.showMessageDialog(null, "I'll see you at " + alone);
					    JOptionPane.showMessageDialog(null, "And treat you to " + die);
					    
	}

}
