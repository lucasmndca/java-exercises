package factoryMethod.dialogs;

import factoryMethod.interfaces.Smartphone;

public abstract class Dialog {
    public void printFunctionalities() {
        Smartphone smartphone = generateSmartphone();
        smartphone.call();
    }
    public abstract Smartphone generateSmartphone();
}
