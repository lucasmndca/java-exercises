package service;

import service.interfaces.Strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handleAbility(int selectedAbility) {
        switch (selectedAbility) {
            case 1:
                lightAttack();
                break;
            case 2:
                heavyAttack();
                break;
            case 3:
                heal();
                break;
            default:
                break;
        }
    }

    private void lightAttack() {
        strategy.lightAttack();
    }

    private void heavyAttack() {
        strategy.heavyAttack();
    }

    private void heal() {
        strategy.heal();
    }

}
