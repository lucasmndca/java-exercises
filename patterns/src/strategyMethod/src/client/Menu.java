package client;

import java.util.Scanner;

public class Menu {

    private int selectedUnit = 0;
    private int selectedAbility = 0;

    public int getSelectedUnit() {
        return selectedUnit;
    }

    public void setSelectedUnit(int selectedUnit) {
        this.selectedUnit = selectedUnit;
    }

    public int getSelectedAbility() {
        return selectedAbility;
    }

    public void setSelectedAbility(int selectedAbility) {
        this.selectedAbility = selectedAbility;
    }

    public void writeInstructions() {
        System.out.println("Please select one of the available units:\n");
        System.out.println("1 - Archer");
        System.out.println("2 - Warrior");
        System.out.println("3 - Witch");
    }

    public void writeAbilityInstructions() {
        System.out.println("Please select one of the available abilities:\n");
        System.out.println("1 - Light Attack");
        System.out.println("2 - Heavy Attack");
        System.out.println("3 - Heal");
    }

    public void askForAnUnit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selected unit: ");
        String selectedUnit = scanner.nextLine();

        if (!selectedUnit.equals("1") && !selectedUnit.equals("2") && !selectedUnit.equals("3")) {
            throw new IllegalArgumentException("The selected unit value must be between 1 and 3.");
        }

        this.setSelectedUnit(Integer.parseInt(selectedUnit));
    }

    public void askForAbility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selected ability: ");
        String selectedUnit = scanner.nextLine();

        if (!selectedUnit.equals("1") && !selectedUnit.equals("2") && !selectedUnit.equals("3")) {
            throw new IllegalArgumentException("The selected ability value must be between 1 and 3.");
        }

        this.setSelectedAbility(Integer.parseInt(selectedUnit));
    }

}
