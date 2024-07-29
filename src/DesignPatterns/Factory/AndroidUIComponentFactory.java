package DesignPatterns.Factory;

import DesignPatterns.Factory.Component.Button.AndroidButton;
import DesignPatterns.Factory.Component.Button.Button;
import DesignPatterns.Factory.Component.Dropdown.AndroidDropdown;
import DesignPatterns.Factory.Component.Dropdown.Dropdown;
import DesignPatterns.Factory.Component.Menu.AndroidMenu;
import DesignPatterns.Factory.Component.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponectFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
