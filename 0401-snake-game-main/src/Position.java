/*
 * Created on 2025-04-03
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import java.util.Random;

public class Position {
    private static Random rand = new Random();

    protected int x;
    protected int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position add(Position position) {
        return new Position(this.x + position.x, this.y + position.y);
    }

    public boolean equals(Position position) {
        return this.x == position.x && this.y == position.y;
    }

    public static Position randomPosition() {
        int randomX = SnakeGame.WIDTH / SnakeGame.SQUARE_SIZE;
        int randomY = SnakeGame.HEIGHT / SnakeGame.SQUARE_SIZE;

        return new Position(rand.nextInt(randomX), rand.nextInt(randomY));
    }
}
