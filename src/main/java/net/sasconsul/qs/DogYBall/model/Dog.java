package net.sasconsul.qs.DogYBall.model;

import org.jbox2d.common.Vec2;

/**
 * Simulation of an active dog.
 *
 * Created by sasconsul on 8/15/16.
 */
public class Dog extends PhysicsElement {
    private String name;
    private boolean seesBall;
    private boolean isChasingBall;
    private boolean caughtBall;
    private Double lookingAt;    // radians??
    private Ball ball;

    public Dog(String name, Vec2 position) {
        this.name = name;
        this.pos = position;
    }

    public void chaseBall(Ball ball) {
        this.ball = ball;
        this.isChasingBall = true;
        this.caughtBall = false;
    }

    public void catchBall() {
        this.isChasingBall = false;
        this.caughtBall = true;
    }

    public void eatBall() {
        synchronized (this) {
            this.isChasingBall = false;
            this.caughtBall = true;
        }

        // Really dog eating ball.
        ball.eaten();

        synchronized (this) { // For multi-threaded simulation.
            this.ball = null;
            this.caughtBall = false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSeesBall() {
        return seesBall;
    }

    public void setSeesBall(boolean seesBall) {
        this.seesBall = seesBall;
    }

    public boolean isChasingBall() {
        return isChasingBall;
    }

    public void setChasingBall(boolean chasingBall) {
        isChasingBall = chasingBall;
    }

    public boolean isCaughtBall() {
        return caughtBall;
    }

    public void setCaughtBall(boolean caughtBall) {

        if (caughtBall) {
            this.isChasingBall = false;
        }

        this.caughtBall = caughtBall;
    }

    public Double getLookingAt() {
        return lookingAt;
    }

    public void setLookingAt(Double lookingAt) {
        this.lookingAt = lookingAt;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }
}
