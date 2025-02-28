package com.joneshshrestha.designpattern;

public class MacTextField implements AbstractTextField {
    @Override
    public void render() {
        System.out.println("Rendering a macOS text field.");
    }
}
