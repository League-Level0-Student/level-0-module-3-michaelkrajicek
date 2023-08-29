package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {
		String keepOn = "Keep doing whatever you're doing.";
		
		String input = JOptionPane.showInputDialog("Are you Happy?");
		
		if (input.equalsIgnoreCase("yes")) {
			
			JOptionPane.showMessageDialog(null, keepOn);
			
		} else if (input.equalsIgnoreCase("no")) {
			
			input = JOptionPane.showInputDialog("Do you want to be happy");
			
			if (input.equalsIgnoreCase("no")) {
				
				JOptionPane.showMessageDialog(null, keepOn);
				
			} else if (input.equalsIgnoreCase("yes")) {
				
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		}

	}
}
