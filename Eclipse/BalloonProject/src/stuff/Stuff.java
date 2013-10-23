package stuff;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Stuff extends Applet implements ActionListener// import
// java.awt.event.*;
// goes with
// ActionListener
// and
// actionPerformed
{// variable & object declarations and initializations
	Button right;
	public static final int DISPLAY_WIDTH = 600;// this is a constant
	private int startX = DISPLAY_WIDTH / 2;

	public void init() {
		right = new Button("something longer");
		add(right);
		right.addActionListener(this);
	}// endInit
	public void paint(Graphics g) {
		resize(DISPLAY_WIDTH, 500);
		setBackground(Color.CYAN);
		g.setColor(Color.BLACK);
		g.fillRect(startX, 225, 50, 50);// okay it is a weird balloon
	}// endPaint

	public void actionPerformed(ActionEvent clic)// import java.awt.event.*;
													// goes with ActionListener
													// and actionPerformed
	{
		if (clic.getSource() == right)
			doRight();
		repaint();
	}// endActionPerformed

	public void doRight() {
		startX += 50;
	}
} // endProgram   