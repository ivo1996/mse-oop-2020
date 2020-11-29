package introduction.rightturner;

import kareltherobot.Directions;
import kareltherobot.World;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RightTurnerTest {

    @Test
    public void testPolymorphism() {
        World.setSize(5, 5);
        World.setDelay(0);
//        World.setVisible();
        RobotRightTurner robot = new RobotRightTurner(1, 1, Directions.East);
        robot.turnRight();

        RobotRightTurner fancyRobot = new RobotRightTurner(1, 1, Directions.East);
        fancyRobot.turnRightFancy();

        assertTrue(robot.facingSouth());
        assertTrue(fancyRobot.facingSouth());
    }

    /**
     * Tests whether the robot moves to a desired location
     */
    @Test
    public void moveTo() {
        World.setSize(100, 100);
        World.setDelay(0);
//        World.setVisible();
        RobotRightTurner robot = new RobotRightTurner(1, 1, Directions.East);
        robot.moveTo(25, 41);

        assertEquals(robot.getAvenue(), 25);
        assertEquals(robot.getStreet(), 41);
    }
}
