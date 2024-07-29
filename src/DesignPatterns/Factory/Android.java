package DesignPatterns.Factory;

public class Android extends Platform{
    @Override
    public UIComponectFactory createUIcomponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
