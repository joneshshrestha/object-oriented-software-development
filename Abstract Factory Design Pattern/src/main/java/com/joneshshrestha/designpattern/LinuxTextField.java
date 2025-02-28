package com.joneshshrestha.designpattern;

public class LinuxTextField implements AbstractTextField {
    @Override
    public void render() {
        System.out.println("Rendering a Linux text field.");
    }
}
