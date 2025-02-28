package com.joneshshrestha.designpattern;

public class LinuxPushButton implements AbstractPushButton {
    @Override
    public void render() {
        System.out.println("Rendering a Linux push button.");
    }
}
