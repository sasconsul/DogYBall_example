package net.sasconsul.qs.DogYBall.model;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;

/**
 * Created by sasconsul on 8/15/16.
 */
public class PhysicsElement {
    protected Vec2 pos;
    protected Double movingTo;    // radians??
    protected Double speed;       // Units per time inc.

    PhysicsElement() {
        this.pos = new Vec2(0,0);
        this.movingTo = 0.0D;
        this.speed = 0.0D;
    }

    void init(Vec2 position, Double movingTo, Double speed) {
        this.pos = position;
        this.movingTo = movingTo;
        this.speed = speed;
    }


}
