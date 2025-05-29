package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Chip;
import com.pluralsight.Utility.ConsoleHelper;

public class AddChipsScreen implements Screen<Chip> {

    public Chip display() {
        int chipChoice = ConsoleHelper.readInt(
                "Choose your chips:\n1) BBQ\n2) Sour Cream & Onion\n3) Salt & Vinegar\n4) Classic", 1,4);

        String flavor = switch (chipChoice) {
            case 1 -> "BBQ";
            case 2 -> "Sour Cream & Onion";
            case 3 -> "Salt & Vinegar";
            case 4 -> "Classic";
            default -> throw new IllegalStateException("Unexpected value: " + chipChoice);
        };

        System.out.println("\n✅ " + flavor + " selected!");
        return new Chip(flavor);
    }
}
