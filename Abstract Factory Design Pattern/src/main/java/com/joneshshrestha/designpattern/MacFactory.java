package com.joneshshrestha.designpattern;

// Concrete Factory MacFactory implement creation methods
// Public class MacFactory that implements the interface GUIFactory
public class MacFactory implements GUIFactory {
    // Implementation for the abstract method createTextField of return type AbstractTextField that returns a new MacTextField object
    public AbstractTextField createTextField() {
        return new MacTextField();
    }
    // Implementation for the abstract method createPushButton of return type AbstractPushButton that returns a new MacPushButton object
    public AbstractPushButton createPushButton() {
        return new MacPushButton();
    }
    // Implementation for the abstract method createListBox of return type AbstractListBox that returns a new MacListBox object
    public AbstractListBox createListBox() {
        return new MacListBox();
    }
}
