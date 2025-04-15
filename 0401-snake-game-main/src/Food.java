/*
 * Created on 2025-04-03
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import java.util.Random;

public abstract class Food {
    public abstract Position getPosition();

    public abstract String getIcon();

    public static Food randomFood(Position position) {
        int maxActiveFoodItems = 1; // Represents the number of food items

        int randomNumber = new Random().nextInt(maxActiveFoodItems);

        switch (randomNumber) {
            // TODO: Add two more food items!
            case 0:
                return new Cherry(position);
            default:
                return null;
                //test
        }

    }
}
