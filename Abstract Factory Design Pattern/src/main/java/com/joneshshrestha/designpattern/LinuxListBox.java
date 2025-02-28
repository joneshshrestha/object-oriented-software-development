package com.joneshshrestha.designpattern;

// Concrete Product LinuxListBox
// Public class LinuxListBox that implements the interface AbstractListBox
public class LinuxListBox implements AbstractListBox {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a Linux list box.");
    }
}

