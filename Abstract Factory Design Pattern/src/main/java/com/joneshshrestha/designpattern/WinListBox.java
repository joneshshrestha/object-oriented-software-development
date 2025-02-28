package com.joneshshrestha.designpattern;

// Concrete Product WinListBox
// Public class WinListBox that implements the interface AbstractListBox
public class WinListBox implements AbstractListBox {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a Windows list box.");
    }
}

