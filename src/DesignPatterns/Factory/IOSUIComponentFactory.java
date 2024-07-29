package DesignPatterns.Factory;

import DesignPatterns.Factory.Component.Button.Button;
import DesignPatterns.Factory.Component.Button.IOSButton;
import DesignPatterns.Factory.Component.Dropdown.Dropdown;
import DesignPatterns.Factory.Component.Dropdown.IOSDropdown;
import DesignPatterns.Factory.Component.Menu.IOSMenu;
import DesignPatterns.Factory.Component.Menu.Menu;

public class IOSUIComponentFactory implements UIComponectFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
