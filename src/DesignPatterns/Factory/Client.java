package DesignPatterns.Factory;

import DesignPatterns.Factory.Component.Button.Button;
import DesignPatterns.Factory.Component.Dropdown.AndroidDropdown;
import DesignPatterns.Factory.Component.Dropdown.Dropdown;
import DesignPatterns.Factory.Component.Menu.Menu;

public class Client {
    public static void main(String[] args) {

        String platform = "Android"; //Env variables
        Platform p = PlatformFactory.createPlatform(platform); // simple factory

//        Platform p = new Android(); -> end goal
        UIComponectFactory componectFactory = p.createUIcomponentFactory();
        Button b = componectFactory.createButton();
        Menu m = componectFactory.createMenu();
        Dropdown d = componectFactory.createDropdown();

        // I will be using this in my code -> b,m,d

    }
}
