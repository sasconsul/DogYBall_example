package net.sasconsul.qs.DogYBall.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BallTest {

    private Ball ball;

    @BeforeMethod
    public void setUp() {
        ball = new Ball("red");
    }

    @Test
    public void getBallColor() {
        assertEquals(ball.color, "red", "Ball should be red.");
    }

    @AfterMethod
    public void tearDown() {
    }
}
