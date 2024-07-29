package DesignPatterns.Factory;


import DesignPatterns.Factory.Component.Button.Button;
import DesignPatterns.Factory.Component.Dropdown.Dropdown;
import DesignPatterns.Factory.Component.Menu.Menu;

public interface UIComponectFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
