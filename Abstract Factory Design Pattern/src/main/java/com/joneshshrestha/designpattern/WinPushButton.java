package com.joneshshrestha.designpattern;

public class WinPushButton implements AbstractPushButton {
    @Override
    public void render() {
        System.out.println("Rendering a Windows push button.");
    }
}
