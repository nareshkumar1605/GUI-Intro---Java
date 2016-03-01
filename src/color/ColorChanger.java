package color;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

import javax.swing.*;

import calculator.Calculator.event;

public class ColorChanger extends JFrame {
	
	JButton red_color, blue_color, green_color, yellow_color, colorChangeButton, cool, boring;
	
	public ColorChanger() {
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		red_color = new JButton("RED");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(red_color,c);
		
		blue_color = new JButton("BLUE");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 10;
		c.gridy = 0;
		add(blue_color,c);
		
		green_color = new JButton("GREEN");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 10;
		add(green_color,c);
		
		yellow_color = new JButton("YELLOW");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 10;
		c.gridy = 10;
		add(yellow_color,c);
		
		colorChangeButton = new JButton("I'm colorful !");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 5;
		add(colorChangeButton,c);
		
		cool = new JButton("So Cool !");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 20;
		add(cool,c);
		
		boring = new JButton("So Boring !");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 25;
		add(boring,c);
		
		event a = new event();
		red_color.addActionListener(a);
		blue_color.addActionListener(a);
		green_color.addActionListener(a);
		yellow_color.addActionListener(a);
		colorChangeButton.addActionListener(a);
		cool.addActionListener(a);
		boring.addActionListener(a);
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent a) {		
			
//			Container c = JFrame.getContentPane();
			
			String op = a.getActionCommand();
			
			if(op.equals("RED")) {
				colorChangeButton.setBackground(Color.red);
			}
			else if(op.equals("BLUE")) {
				colorChangeButton.setBackground(Color.blue);
			}
			else if(op.equals("GREEN")) {
				colorChangeButton.setBackground(Color.green);
			}
			else if(op.equals("YELLOW")) {
				colorChangeButton.setBackground(Color.yellow);
			}
			else if(op.equals("So Cool !")) {
				blue_color.setBackground(Color.blue);
				red_color.setBackground(Color.red);
				green_color.setBackground(Color.green);
				yellow_color.setBackground(Color.yellow);
			}
			else if(op.equals("So Boring !")) {
				blue_color.setBackground(Color.white);
				red_color.setBackground(Color.white);
				green_color.setBackground(Color.white);
				yellow_color.setBackground(Color.white);		
				colorChangeButton.setBackground(Color.white);
			}
		}
	}
	public static void main(String[] args) {
		ColorChanger a = new ColorChanger();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(300,300);
		a.setVisible(true);
		a.setResizable(false);
		a.setTitle("COLOR SPLASH");
	}
}
