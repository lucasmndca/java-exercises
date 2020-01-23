package factoryMethod.concreteProducts;

import factoryMethod.interfaces.Smartphone;

public class Iphone implements Smartphone {

    @Override
    public void downloadApp() {
        System.out.println("Your app is being downloaded from the App Store");
    }

    @Override
    public void surfInternet() {
        System.out.println("Starting Safari...");
    }

    public void startFaceTime() {
        System.out.println("Starting FaceTime...");
    }
}
