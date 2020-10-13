package entities;

import service.interfaces.Strategy;

public class ConcreteStrategyWitch implements Strategy {

    @Override
    public void lightAttack() {

    }

    @Override
    public void heavyAttack() {

    }

    @Override
    public void heal() {

    }

    @Override
    public String selfName() {
        return "Witch";
    }
}
