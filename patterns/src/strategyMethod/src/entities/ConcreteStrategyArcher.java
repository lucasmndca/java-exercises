package entities;

import service.interfaces.Strategy;

public class ConcreteStrategyArcher implements Strategy {

    @Override
    public void lightAttack() {
        System.out.println("Archer has shot an arrow!");
    }

    @Override
    public void heavyAttack() {
        System.out.println("Archer has shot a fire arrow!");
    }

    @Override
    public void heal() {
        System.out.println("Archer heals. Life +50");
    }

    @Override
    public String selfName() {
        return "Archer";
    }
}
