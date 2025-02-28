package com.joneshshrestha.designpattern;

// Concrete Product MacListBox
// Public class MacListBox that implements the interface AbstractListBox
public class MacListBox implements AbstractListBox {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a macOS list box.");
    }
}
