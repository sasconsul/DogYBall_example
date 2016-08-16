package net.sasconsul.qs.DogYBall.model;

/**
 * Simulation of a bouncing ball
 *
 * Created by sasconsul on 8/15/16.
 */


public class Ball extends PhysicsElement {
    private String color;

    public Ball(String color) {
        this.color = color;
    }

    public void eaten() {
        //TODO implement.
    }

    public String getColor() {
        return this.color;
    }
}
