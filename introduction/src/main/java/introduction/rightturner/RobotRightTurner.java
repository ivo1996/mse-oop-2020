package introduction.rightturner;

import kareltherobot.Robot;

/**
 * Robot that allows turning right
 * @author ivelin.dimitrov
 */
public class RobotRightTurner extends Robot {

    /**
     * Creates a new robot.
     * @param street
     * @param avenue
     * @param direction
     */
    public RobotRightTurner(int street, int avenue, Direction direction) {
        super(street, avenue, direction, 0);
    }

    /**
     * Turns the robot right.
     */
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /**
     * Turns the robot right in a fancy way.
     */
    public void turnRightFancy(){
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
    }
}
