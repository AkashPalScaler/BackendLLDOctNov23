package DesignPatterns.Factory;

public class IOS extends Platform{
    @Override
    public UIComponectFactory createUIcomponentFactory() {
        return new IOSUIComponentFactory();
    }
}
