package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
	
	JButton add, subtract, multiply, divide;
	JTextField num1, num2;
	JLabel result, enter1, enter2;
	
	public Calculator() {
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		enter1 = new JLabel("1st: ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(enter1, c);
		
		num1 = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 3;
		add(num1,c);
		
		enter2 = new JLabel("2nd: ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		add(enter2, c);
		
		num2 = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 3;
		add(num2,c);
		
		add = new JButton("+");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		add(add,c);
		
		subtract = new JButton("-");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		add(subtract,c);
		
		multiply = new JButton("*");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		add(multiply,c);
	
		divide = new JButton("/");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		add(divide,c);
		
		result = new JLabel("");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 4;
		add(result, c);
		
		event a = new event();
		add.addActionListener(a);
		subtract.addActionListener(a);
		multiply.addActionListener(a);
		divide.addActionListener(a);
		
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent a) {		//This is where the brains of the program goes
			
			double number1, number2;
			
			try {
				number1 = Double.parseDouble(num1.getText());
			} catch (NumberFormatException e) {
				result.setText("Illegal data for first field");
				result.setForeground(Color.RED);
				return;
			}
			
			try {
				number2 = Double.parseDouble(num2.getText());
			} catch (NumberFormatException e) {
				result.setText("Illegal data for second field");
				result.setForeground(Color.RED);
				return;
			}
			
			String op = a.getActionCommand();
			
			if(op.equals("+")) {
					double sum = number1 + number2;
					result.setText(number1 + " + " + number2 + " = " + sum);
					result.setForeground(Color.RED);
			} else if(op.equals("-")) {
					double difference = number1 - number2;
					result.setText(number1 + " - " + number2 + " = " + difference);
					result.setForeground(Color.RED);
			} else if(op.equals("*")) {
					double multiplication = number1 * number2;
					result.setText(number1 + " * " + number2 + " = " + multiplication);
					result.setForeground(Color.RED);
			} else if(op.equals("/")) {
					if(number2 == 0) {
							result.setText("You cannot divide by zero !!!");
							result.setForeground(Color.RED);
					} else {
							double division = number1 / number2;
							result.setText(number1 + " / " + number2 + " = " + division);
							result.setForeground(Color.RED);
						}
					}
				}
			}
	
	public static void main(String[] args) {
		Calculator a = new Calculator();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(300,300);
		a.setTitle("My First Calculator");
		a.setVisible(true);
		a.setResizable(false);
	}
}
