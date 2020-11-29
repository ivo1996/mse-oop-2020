package introduction.drawers.robots;

import introduction.drawers.figures.Figure;
import introduction.drawers.figures.Square;
import introduction.rightturner.RobotRightTurner;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ivelin.dimitrov
 */
@Getter
@Setter
public class SquareDrawerRobot extends RobotRightTurner implements Drawer {
    /**
     * Creates a squareDrawerRobot.
     *
     * @param street
     * @param avenue
     * @param direction
     * @param beepers
     */
    public SquareDrawerRobot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    /**
     * Draws Sqaure.
     *
     * @param figure
     */
    @Override
    public void draw(Figure figure) {
        if (!(figure instanceof Square)) {
            System.err.println("Unsupported parameter type");
            return;
        }
        Square square = (Square) figure;
        turnTo(East);
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < square.getWidth(); i++) {
                super.putBeeper();
                move();
            }
            turnLeft();
        }
    }
}
