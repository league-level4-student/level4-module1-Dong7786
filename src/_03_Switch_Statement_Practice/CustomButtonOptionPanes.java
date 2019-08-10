package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option

		switch (choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Sunday clears the rust from the rest of the week!");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Our greatest glory is not in never falling but in rising every time we fall.");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Nothing messes up your Friday like realizing it's tuesday. ");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "IITTTTT'SSS HUMP DAY!");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Thursday is the end day in weekend!");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Music always sound better on friday!");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Weekends don't count unless you spend them doing something completely pointless.");
				
				
			}
		}

	}

