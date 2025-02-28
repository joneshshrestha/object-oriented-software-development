package com.joneshshrestha.designpattern;

// Abstract Factory Interface GUIFactory
// Interface for GUIFactory with abstract methods createTextField, createPushButton, createListBox
public interface GUIFactory {
    // Abstract method createTextField of type AbstractTextField
    AbstractTextField createTextField();
    // Abstract method createPushButton of type AbstractPushButton
    AbstractPushButton createPushButton();
    // Abstract method createListBox of type AbstractListBox
    AbstractListBox createListBox();
}

