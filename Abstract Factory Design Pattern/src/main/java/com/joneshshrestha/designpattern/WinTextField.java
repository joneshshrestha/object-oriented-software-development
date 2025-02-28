package com.joneshshrestha.designpattern;

public class WinTextField implements AbstractTextField{
    @Override
    public void render() {
        System.out.println("Rendering a Windows text field.");
    }
}
