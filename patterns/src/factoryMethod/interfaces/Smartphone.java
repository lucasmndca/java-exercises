package factoryMethod.interfaces;

public interface Smartphone {
    public default void call() {
        System.out.println("Your smartphone is calling someone...");
    }
    public void downloadApp();
    public void surfInternet();
}