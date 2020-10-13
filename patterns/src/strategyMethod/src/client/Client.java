package client;

import factory.ConcreteStrategyFactory;
import service.Context;

import java.util.logging.Logger;

public class Client {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Client.class));

    public static void main(String[] args) {
        Menu menu = new Menu();
        ConcreteStrategyFactory concreteStrategyFactory = new ConcreteStrategyFactory();
        Context context = new Context();

        while (0 == menu.getSelectedUnit()) {
            try {
                menu.writeInstructions();
                menu.askForAnUnit();
            } catch (Exception e) {
                LOGGER.severe(e.getMessage());
            }
        }

        context.setStrategy(concreteStrategyFactory.instantiateConcreteStrategy(menu.getSelectedUnit()));

        while (0 == menu.getSelectedAbility()) {
            try {
                menu.writeAbilityInstructions();
                menu.askForAbility();
            } catch (Exception e) {
                LOGGER.severe(e.getMessage());
            }
        }

        context.handleAbility(menu.getSelectedAbility());
    }
}
