package com.joneshshrestha.designpattern;

// Concrete Product MacTextField
// Public class MacTextField that implements the interface AbstractTextField
public class MacTextField implements AbstractTextField {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a macOS text field.");
    }
}
