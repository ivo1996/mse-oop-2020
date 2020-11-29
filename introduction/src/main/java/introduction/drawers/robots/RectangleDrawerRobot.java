package introduction.drawers.robots;

import introduction.drawers.figures.Figure;
import introduction.drawers.figures.Rectangle;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ivelin.dimitrov
 */
@Getter
@Setter
public class RectangleDrawerRobot extends SquareDrawerRobot implements Drawer {

    /**
     * Creates a squareDrawerRobot.
     *
     * @param street
     * @param avenue
     * @param direction
     * @param beepers
     */
    public RectangleDrawerRobot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    /**
     * Draws rectangle
     *
     * @param figure
     */
    @Override
    public void draw(Figure figure) {
        if (!(figure instanceof Rectangle)) {
            System.err.println("Unsupported parameter type");
            return;
        }
        Rectangle rectangle = (Rectangle) figure;
        turnTo(East);
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < (j % 2 == 0 ? rectangle.getWidth() : rectangle.getHeight()); i++) {
                super.putBeeper();
                move();
            }
            turnLeft();
        }
    }
}
