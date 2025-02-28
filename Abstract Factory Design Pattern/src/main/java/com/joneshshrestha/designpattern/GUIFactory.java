package com.joneshshrestha.designpattern;

public interface GUIFactory {
    AbstractTextField createTextField();
    AbstractPushButton createPushButton();
    AbstractListBox createListBox();
}

