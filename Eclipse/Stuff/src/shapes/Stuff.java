package shapes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Stuff {

	public static void main(String[] args)
	{
		
		JPanel shapePanel;
		int choice1 = JOptionPane.showConfirmDialog(
			    null,
			    "Would you like to calculate the area of a shape?",
			    "Shapes",
			    JOptionPane.YES_NO_OPTION);
		int choice2;
		
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		
		if(choice1 == 1)
		{
			
			do{
		        
		        
		        
			}while()
		}
	}

	private JPanel createShapesPicker()
	{
		final int numButtons = 3;
		JRadioButton[] radioButtons = new JRadioButton[numButtons];
		final ButtonGroup group = new ButtonGroup();
		
        JButton pickIt = null;
		
        final String triangleCommand = "triangle";
        final String rectangleCommand = "rectangle";
        final String circleCommand = "circle";
        
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
		
					if(command==triangleCommand)
					{
						
					}
				}
		
		
			}
			
		}
	
}
