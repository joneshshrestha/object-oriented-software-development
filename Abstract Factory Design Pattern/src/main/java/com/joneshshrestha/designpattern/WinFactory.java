package com.joneshshrestha.designpattern;

public class WinFactory implements GUIFactory {
    public AbstractTextField createTextField() {
        return new WinTextField();
    }
    public AbstractPushButton createPushButton() {
        return new WinPushButton();
    }
    public AbstractListBox createListBox() {
        return new WinListBox();
    }
}

