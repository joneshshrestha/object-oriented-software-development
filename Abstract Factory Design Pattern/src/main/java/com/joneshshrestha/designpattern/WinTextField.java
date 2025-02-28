package com.joneshshrestha.designpattern;

// Concrete Product WinTextField
// Public class WinTextField that implements the interface AbstractTextField
public class WinTextField implements AbstractTextField {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a Windows text field.");
    }
}
