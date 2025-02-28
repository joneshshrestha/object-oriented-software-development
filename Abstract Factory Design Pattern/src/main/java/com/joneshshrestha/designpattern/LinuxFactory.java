package com.joneshshrestha.designpattern;

public class LinuxFactory implements GUIFactory {
    public AbstractTextField createTextField() {
        return new LinuxTextField();
    }
    public AbstractPushButton createPushButton() {
        return new LinuxPushButton();
    }
    public AbstractListBox createListBox() {
        return new LinuxListBox();
    }
}
