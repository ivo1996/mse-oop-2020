import introduction.drawers.figures.Rectangle;
import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;

public class RobotTester {

    public static void main(String[] args) {
        World.setSize(5, 5);
        World.setVisible();
        Robot robot = new Robot(1, 1, Directions.East, 0);
        robot.turnLeft();
    }
}
