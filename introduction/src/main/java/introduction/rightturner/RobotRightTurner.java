package introduction.rightturner;

import kareltherobot.Directions;
import kareltherobot.Robot;
import lombok.Getter;
import lombok.Setter;

/**
 * Robot that allows turning right
 *
 * @author ivelin.dimitrov
 */
@Getter
@Setter
public class RobotRightTurner extends Robot implements RightTurner {

    private int street;
    private int avenue;
    private int availableBeepers;
    private Direction direction;

    /**
     * Creates a new robot.
     *
     * @param street
     * @param avenue
     * @param direction
     */
    public RobotRightTurner(int street, int avenue, Direction direction) {
        super(street, avenue, direction, 0);
        this.street = street;
        this.avenue = avenue;
    }

    /**
     * Creates a new robot with beepers.
     *
     * @param street
     * @param avenue
     * @param direction
     * @param beepers
     */
    public RobotRightTurner(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
        this.street = street;
        this.avenue = avenue;
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
    public void turnRightFancy() {
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
    }

    /**
     * Moves the robot and extracts its coordinates.
     */
    @Override
    public void move() {
        super.move();
        String[] split = this.toString().split(" ");
        String srtStreet = split[4].replaceAll("\\D+", "");
        this.street = Integer.parseInt(srtStreet);
        String strAvenue = split[6].replaceAll("\\D+", "");
        this.avenue = Integer.parseInt(strAvenue);
    }

    /**
     * Extracts the available beepers of a given robot.
     *
     * @return availableBeepers
     */
    public int getAvailableBeepers() {
        String[] split = this.toString().split(" ");
        this.availableBeepers = Integer.parseInt(split[8].replaceAll("\\D+", ""));
        return this.availableBeepers;
    }

    /**
     * Moves to desired location with coordinates
     *
     * @param x
     * @param y
     */
    public void moveTo(int x, int y) {
        if (x < getAvenue()) {
            while (!facingWest()) {
                turnLeft();
            }
            while (x != getAvenue()) {
                move();
            }
        } else if (x > getAvenue()) {
            while (!facingEast()) {
                turnLeft();
            }
            while (x != getAvenue()) {
                move();
            }
        }

        if (y < getStreet()) {
            while ((!facingSouth())) {
                turnLeft();
            }
            while (y != getStreet()) {
                move();
            }
        } else if (y > getStreet()) {
            while (!facingNorth()) {
                turnLeft();
            }
            while (y != getStreet()) {
                move();
            }
        }
    }

    /**
     * Gets current direction
     *
     * @return
     */
    public Direction getDirection() {
        if (facingNorth()) {
            return Directions.North;
        }
        if (facingEast()) {
            return Directions.East;
        }
        if (facingWest()) {
            return Directions.West;
        }
        if (facingSouth()) {
            return Directions.South;
        }
        throw new UnknownError();
    }

    /**
     * turns to a desired direction
     *
     * @param direction
     */
    public void turnTo(Direction direction) {
        while (getDirection() != direction) {
            turnLeft();
        }
    }
}
