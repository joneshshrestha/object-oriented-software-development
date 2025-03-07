package com.joneshshrestha.designpattern;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConverterGUI {

	private String[] units = {"Mile", "Yard", "Foot"};
	private JFrame frame;

	public ConverterGUI() {
		initializeFrame();
	}

	private void initializeFrame() {
		frame = new JFrame("OOP: Assignment 4");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initUI();
		frame.setLayout(null);
		frame.setPreferredSize(new Dimension(450, 250));
		frame.pack();
		frame.setVisible(true);
	}

	private void initUI() {
		JLabel appTitle = new JLabel("Length Converter Program");
		appTitle.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		appTitle.setBounds(60, 10, 400, 30);

		JTextField inputField = new JTextField(15);
		inputField.setBounds(60, 50, 200, 30);
		JLabel kilometer = new JLabel("Kilometer");
		kilometer.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		kilometer.setBounds(300, 50, 200, 30);

		JTextField outputField = new JTextField(15);
		outputField.setEditable(false);
		outputField.setLocation(10, 200);

		outputField.setBounds(60, 100, 200, 30);
		JComboBox outputUnit = new JComboBox<String>();
		for (String u : units) {
			outputUnit.addItem(u);
		}
		outputUnit.setBounds(300, 100, 80, 30);
		JButton convertButton = new JButton("Convert!");
		convertButton.setBounds(60, 150, 200, 30);
		convertButton.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		frame.add(appTitle);
		frame.add(inputField);
		frame.add(kilometer);
		frame.add(outputField);
		frame.add(outputUnit);
		frame.add(convertButton);

		// TODO =============================================================================
		// TODO You should add ActionListener for the Convert button
		// TODO Here you have to implement the action listener..
		ActionListener convertListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("Convert button clicked");
				// TODO SUMMARY: You get the input from UI, you call the Convert method in the Client class, and you set the output in the UI
				try {
					// getText() on inputField
					String inputText = inputField.getText();

					if (inputText == null) {
						outputField.setText("Input is null!");
						return;
					}

					//    parse the input to double
					double inputValue = Double.parseDouble(inputText);

					if (inputValue < 0) {
						outputField.setText("Input is negative!");
						return;
					}
					//    try/catch block to catch any possible error
					//    Test the input for invalid value (negative, string, null, ...)
					//    getSelectedItem() on outputUnit to retrieve the unit selected by user
					String targetUnit = outputUnit.getSelectedItem().toString();
					//    Use your convert() logic on the input and unit values to apply the patterns
					String output = Client.Convert(inputValue, targetUnit);
					//    setText() on outputField to show the result or error message to the user.
					outputField.setText(output);

				} catch (Exception e) {
					outputField.setText("Invalid Number: " + e.getMessage());
					System.out.println("Invalid Number! " + e.getMessage());
				}

			}
		};
		// add ActionListener() to the button
		convertButton.addActionListener(convertListener);
	}
}
