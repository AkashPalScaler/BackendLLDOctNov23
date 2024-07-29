package DesignPatterns.Factory;

public class PlatformFactory {
    public static Platform createPlatform(String platform){
        if(platform == "Android"){
            return new Android();
        } else if (platform == "IOS") {
            return new IOS();
        }
        return null;
    }
}
