package com.joneshshrestha.designpattern;

// Concrete Product LinuxPushButton
// Public class LinuxPushButton that implements the interface AbstractPushButton
public class LinuxPushButton implements AbstractPushButton {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a Linux push button.");
    }
}
