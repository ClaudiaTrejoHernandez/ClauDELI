package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Chip;
import com.pluralsight.Utility.ConsoleHelper;

public class AddChipsScreen implements Screen<Chip> {

    @Override
    public Chip display() {
        System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("         🍟 Choose Your Chips 🍟");
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦\n");

        int chipChoice = ConsoleHelper.readInt(
                "🥔 1) Lay's BBQ\n" +
                        "🥔 2) Sour Cream & Onion\n" +
                        "🥔 3) Salt & Vinegar\n" +
                        "🥔 4) Fritos", 1, 4);

        String flavor = switch (chipChoice) {
            case 1 -> "Lay's BBQ";
            case 2 -> "Sour Cream & Onion";
            case 3 -> "Salt & Vinegar";
            case 4 -> "Fritos";
            default -> throw new IllegalStateException("Unexpected value: " + chipChoice);
        };

        System.out.println("\n✅ " + flavor + " selected!");
        return new Chip(flavor);
    }
}
