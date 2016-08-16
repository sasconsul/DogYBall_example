package net.sasconsul.qs.DogYBall;

import net.sasconsul.qs.DogYBall.model.Ball;
import net.sasconsul.qs.DogYBall.model.Dog;
import org.jbox2d.common.Vec2;
import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

/**
 * Created by sasconsul on 8/15/16.
 */
public class BallTest {

    @BeforeTest
    void setup() {
    }

    @Test
    void ballColorTest() {
        Ball ball = new Ball("red");

        assert ("red".equals(ball.getColor()));

    }

}
