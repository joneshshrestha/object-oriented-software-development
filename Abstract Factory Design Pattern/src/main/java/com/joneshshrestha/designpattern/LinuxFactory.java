package com.joneshshrestha.designpattern;

// Concrete Factory LinuxFactory implement creation methods
// Public class LinuxFactory that implements the interface GUIFactory
public class LinuxFactory implements GUIFactory {
    // Implementation for the abstract method createTextField of return type AbstractTextField that returns a new LinuxTextField object
    public AbstractTextField createTextField() {
        return new LinuxTextField();
    }
    // Implementation for the abstract method createPushButton of return type AbstractPushButton that returns a new LinuxPushButton object
    public AbstractPushButton createPushButton() {
        return new LinuxPushButton();
    }
    // Implementation for the abstract method createListBox of return type AbstractListBox that returns a new LinuxListBox object
    public AbstractListBox createListBox() {
        return new LinuxListBox();
    }
}
