package shapes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Stuff {

	public static void main(String[] args)
	{

		int choice1 = JOptionPane.showConfirmDialog(
			    null,
			    "Would you like to calculate the area of a shape?",
			    "Shapes",
			    JOptionPane.YES_NO_OPTION);

		
		if(choice1 == JOptionPane.OK_OPTION)
		{
			
			do{
		        
		        
		        
			}while();
		}
	}
	private JPanel createShapesPicker() {
		final int numButtons = 3;
		JRadioButton[] radioButtons = new JRadioButton[numButtons];
		final ButtonGroup group = new ButtonGroup();

		JButton pickIt = null;

		Circle circle1 = new Circle();
		Rectangle rect1 = new Rectangle();
		Triangle tri1 = new Triangle();

		final String triangleCommand = "triangle";
		final String rectangleCommand = "rectangle";
		final String circleCommand = "circle";

		JTextField radius = new JTextField(10);
		JTextField length = new JTextField(10);
		JTextField height1 = new JTextField(10);
		JTextField base = new JTextField(10);
		JTextField height2 = new JTextField(10);

		final JPanel cirPanel = new JPanel();;
		final JPanel rectPanel = new JPanel();;
		final JPanel triPanel = new JPanel();;

		cirPanel.add(new JLabel("Radius: "));
		cirPanel.add(radius);

		rectPanel.add(new JLabel("Length: "));
		rectPanel.add(length);
		rectPanel.add(Box.createHorizontalStrut(15));
		rectPanel.add(new JLabel("Height: "));
		rectPanel.add(height1);

		triPanel.add(new JLabel("Base: "));
		triPanel.add(base);
		triPanel.add(Box.createHorizontalStrut(15));
		triPanel.add(new JLabel("Height: "));
		triPanel.add(height2);

		radioButtons[0] = new JRadioButton("Triangle");
		radioButtons[0].setActionCommand(triangleCommand);

		radioButtons[1] = new JRadioButton("Rectangle");
		radioButtons[1].setActionCommand(rectangleCommand);

		radioButtons[2] = new JRadioButton("Circle");
		radioButtons[2].setActionCommand(circleCommand);

		for (int i = 0; i < numButtons; i++) {
			group.add(radioButtons[i]);
		}

		radioButtons[0].setSelected(true);

		pickIt = new JButton("Pick It!");
		pickIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = group.getSelection().getActionCommand();

				if (command == triangleCommand) {
					int triInput = JOptionPane.showConfirmDialog(null,
							triPanel,
							"Please enter enter a base and height for your triangle.",
							JOptionPane.OK_CANCEL_OPTION);
					if(triInput == JOptionPane.OK_OPTION)
					{
						
					}
				} else if (command == circleCommand) {
					int cirInput = JOptionPane.showConfirmDialog(null,
							cirPanel,
							"Please enter enter a radius for your circle.",
							JOptionPane.OK_CANCEL_OPTION);
				} else if (command == rectangleCommand) {
					int rectInput = JOptionPane.showConfirmDialog(null,
							rectPanel,
							"Please enter enter a length and height for your rectangle.",
							JOptionPane.OK_CANCEL_OPTION);
					
				}
			}

		});
	}
}
