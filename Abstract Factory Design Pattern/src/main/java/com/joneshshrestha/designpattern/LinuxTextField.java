package com.joneshshrestha.designpattern;

// Concrete Product LinuxTextField
// Public class LinuxTextField that implements the interface AbstractTextField
public class LinuxTextField implements AbstractTextField {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a Linux text field.");
    }
}
