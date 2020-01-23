package factoryMethod.dialogs;

import factoryMethod.concreteProducts.Galaxy;
import factoryMethod.interfaces.Smartphone;

public class GalaxyDialog extends Dialog {
    @Override
    public Smartphone generateSmartphone() {
        return new Galaxy();
    }
}
