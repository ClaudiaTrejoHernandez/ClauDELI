package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Chip;
import com.pluralsight.Utility.ConsoleHelper;

public class AddChipsScreen implements Screen<Chip> {

    @Override
    public Chip display() {
        System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("                  🍟 Chips Menu 🍟");
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦\n");

        int chipChoice = ConsoleHelper.readInt(
                 "🍟 Choose your chip flavor:\n" +
                        "     1) Lay's BBQ\n" +
                        "     2) Funyuns\n" +
                        "     3) Salt & Vinegar\n" +
                        "     4) Fritos\n" +
                        "👉 Enter your choice", 1, 4);

        String flavor = switch (chipChoice) {
            case 1 -> "Lay's BBQ";
            case 2 -> "Funyuns";
            case 3 -> "Salt & Vinegar";
            case 4 -> "Fritos";
            default -> throw new IllegalStateException("Unexpected value: " + chipChoice);
        };

        return new Chip(flavor);
    }
}
