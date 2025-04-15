/*
 * Created on 2025-04-03
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

public class Cherry extends Food {
    private Position position;
    private String icon = "./assets/cherries.png";

    public Cherry(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public String getIcon() {
        return this.icon;
    }
}
