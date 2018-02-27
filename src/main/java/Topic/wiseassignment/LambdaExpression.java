package Topic.wiseassignment;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaExpression 
{
	public void addValues()
	{
		
		JFrame frame = new JFrame();

		//Release the window and quit the application when it has been closed
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Creating a button and setting its action
		JButton clickMeButton = new JButton("Click Me!");
		clickMeButton.addActionListener(e->{		//Usage of Lambda expression to add username to Popup
		        // Ask for the user name and say hello
		        String name = JOptionPane.showInputDialog("What is your name?");
		        JOptionPane.showMessageDialog(frame, "Hello " + name + '!');
		    }
		);
		
		//Implementation prior to Lambda expression
		/*clickMeButton.addActionListener(new ActionListener() {

		    public void actionPerformed(ActionEvent e) {
		        // Ask for the user name and say hello
		        String name = JOptionPane.showInputDialog("What is your name?");
		        JOptionPane.showMessageDialog(frame, "Hello " + name + '!');
		    }
		});*/
		
		
		

		// Add the button to the window and resize it to fit the button
		frame.getContentPane().add(clickMeButton);
		frame.pack();

		// Displaying the window
		frame.setVisible(true);
		
	 }  
}
