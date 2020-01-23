package factoryMethod.concreteProducts;

import factoryMethod.interfaces.Smartphone;

public class Galaxy implements Smartphone {

    @Override
    public void downloadApp() {
        System.out.println("Your app is being downloaded from the Play Store");
    }

    @Override
    public void surfInternet() {
        System.out.println("Starting Chrome...");
    }

    public void rootPhone() {
        System.out.println("Your phone is now being rooted...");
    }
}
