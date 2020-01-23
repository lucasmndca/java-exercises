package factoryMethod.dialogs;

import factoryMethod.concreteProducts.Iphone;
import factoryMethod.interfaces.Smartphone;

public class IphoneDialog extends Dialog {
    @Override
    public Smartphone generateSmartphone() {
        return new Iphone();
    }
}
