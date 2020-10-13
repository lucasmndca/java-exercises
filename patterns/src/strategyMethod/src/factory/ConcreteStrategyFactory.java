package factory;

import entities.ConcreteStrategyArcher;
import entities.ConcreteStrategyWarrior;
import entities.ConcreteStrategyWitch;
import service.interfaces.Strategy;

public class ConcreteStrategyFactory {

    public Strategy instantiateConcreteStrategy(int selectedUnit) {
        switch (selectedUnit) {
            case 1:
                return new ConcreteStrategyArcher();
            case 2:
                return new ConcreteStrategyWarrior();
            case 3:
                return new ConcreteStrategyWitch();
            default:
                return null;
        }
    }
}
