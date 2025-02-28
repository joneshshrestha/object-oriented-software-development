package com.joneshshrestha.designpattern;

// Concrete Factory WinFactory implement creation methods
// Public class WinFactory that implements the interface GUIFactory
public class WinFactory implements GUIFactory {
    // Implementation for the abstract method createTextField of return type AbstractTextField that returns a new WinTextField object
    public AbstractTextField createTextField() {
        return new WinTextField();
    }
    // Implementation for the abstract method createPushButton of return type AbstractPushButton that returns a new WinPushButton object
    public AbstractPushButton createPushButton() {
        return new WinPushButton();
    }
    // Implementation for the abstract method createListBox of return type AbstractListBox that returns a new WinListBox object
    public AbstractListBox createListBox() {
        return new WinListBox();
    }
}

