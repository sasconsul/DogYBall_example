package net.sasconsul.qs.DogYBall.model;

import org.jbox2d.common.Vec2;
import org.testng.Assert;
import org.testng.annotations.*;


/**
 * Created by sasconsul on 8/15/16.
 */
public class DogTest {

    private Dog dog;
    private Ball ball;

    @BeforeTest
    void setup() {
        dog = new Dog("dog1", new Vec2(0.0F,0.0F));
        ball = new Ball("red");
    }

    @Test
    void dogChaseTest() {
        dog.chaseBall(ball);

        Assert.assertTrue(dog.isChasingBall(), "Dog should be chasing ball.");
    }

    @Test
    void dogCatchBallTest() {
        dog.chaseBall(ball);
        dog.setCaughtBall(true);

        Assert.assertTrue((dog.isCaughtBall() && !dog.isChasingBall()),
                "Dog can not be chasing and have caught ball at the same time");

    }

    @Test
    void dogEatBallTest() {
        dog.chaseBall(ball);
        dog.setCaughtBall(true);

        dog.eatBall();  // Not multi-threaded.

        Assert.assertFalse(dog.isCaughtBall(), "Dog can not have caught a ball that has been eaten (single thread case.)");
        Assert.assertFalse(dog.isChasingBall(), "Dog can not be chasing an eaten ball.");
        Assert.assertNull(dog.getBall(), "Dog can not an eaten ball");
    }
}
