package com.joneshshrestha.designpattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to choose a platform
        System.out.println("Choose a platform (1=Windows, 2=macOS, 3=Linux): ");
        int platform = input.nextInt();

        // Create a factory object based on the user's choice of platform
        GUIFactory factory;
        switch (platform) {
            case 1:
                factory = new WinFactory();
                break;
            case 2:
                factory = new MacFactory();
                break;
            case 3:
                factory = new LinuxFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid platform choice.");
        }

        // Use the factory object to create and render GUI elements for the selected platform
        AbstractTextField textField = factory.createTextField();
        AbstractPushButton pushButton = factory.createPushButton();
        AbstractListBox listBox = factory.createListBox();

        textField.render();
        pushButton.render();
        listBox.render();
    }
}