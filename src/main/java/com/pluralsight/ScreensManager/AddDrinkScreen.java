package com.pluralsight.ScreensManager;

import com.pluralsight.Interface.Screen;
import com.pluralsight.MenuItemManager.Drink;
import com.pluralsight.Utility.ConsoleHelper;

public class AddDrinkScreen implements Screen<Drink> {

    @Override
    public Drink display() {
        System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("                 🥤 Drink Menu 🥤");
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦\n");

        String size = "";
        String flavor = "";

        // Get drink size
        int sizeChoice = ConsoleHelper.readInt(
                "🍶 Choose your drink size:\n" +
                        "   1️⃣ Small ($2.00)\n" +
                        "   2️⃣ Medium ($2.50)\n" +
                        "   3️⃣ Large ($3.00)\n" +
                        "👉 Enter your choice", 1, 3);

        switch (sizeChoice) {
            case 1 -> size = "Small";
            case 2 -> size = "Medium";
            case 3 -> size = "Large";
        }

        // Get drink flavor
        int flavorChoice = ConsoleHelper.readInt(
                "🥤 Choose your drink flavor:\n" +
                        "   1️⃣ Pepsi\n" +
                        "   2️⃣ Fanta\n" +
                        "   3️⃣ Dr. Pepper\n" +
                        "   4️⃣ Lemonade\n" +
                        "👉 Enter your choice", 1, 4);

        switch (flavorChoice) {
            case 1 -> flavor = "Pepsi";
            case 2 -> flavor = "Fanta";
            case 3 -> flavor = "Dr. Pepper";
            case 4 -> flavor = "Lemonade";
        }

        return new Drink(size, flavor);
    }
}
