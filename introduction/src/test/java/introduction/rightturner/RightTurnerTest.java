package introduction.rightturner;

import kareltherobot.Directions;
import kareltherobot.World;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RightTurnerTest {

    @Test
    public void test() {
        World.setSize(5,5);
        World.setDelay(0);
        RobotRightTurner robot = new RobotRightTurner(1, 1, Directions.East);
        robot.turnRight();
        assertTrue(robot.facingSouth());

        RobotRightTurner fancyRobot = new RobotRightTurner(1, 1, Directions.East);
        fancyRobot.turnRightFancy();
        assertTrue(robot.facingSouth());
    }
}
