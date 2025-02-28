package com.joneshshrestha.designpattern;

public class MacPushButton implements AbstractPushButton {
    @Override
    public void render() {
        System.out.println("Rendering a macOS push button.");
    }
}
