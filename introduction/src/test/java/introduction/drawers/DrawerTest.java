package introduction.drawers;

import introduction.drawers.figures.Rectangle;
import introduction.drawers.figures.Square;
import introduction.drawers.robots.RectangleDrawerRobot;
import introduction.drawers.robots.SquareDrawerRobot;
import kareltherobot.Directions;
import kareltherobot.World;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ivelin.dimitrov
 */
public class DrawerTest {

    /**
     * Tests whether the robot draws an actual square
     */
    @Test
    public void testSquareDrawer() {
        int sideSize = 2;
        int totalBeepers = 100;
        Square square = new Square(4, 7, 2);

        World.setSize(20, 20);
        World.setDelay(0);
//        World.setVisible();
        SquareDrawerRobot robot = new SquareDrawerRobot(1, 1, Directions.East, totalBeepers);

        robot.moveTo(square.getStartingX(), square.getStartingY());
        robot.draw(square);

        assertEquals(square.getStartingY(), robot.getStreet());
        assertEquals(square.getStartingX(), robot.getAvenue());
        assertEquals(4 * sideSize, totalBeepers - robot.getAvailableBeepers());
    }

    /**
     * Tests whether the robot draws a rectangle with given height and width.
     */
    @Test
    public void testRectangleDrawer() {
        int totalBeepers = 100;
        int width = 2;
        int height = 3;

        Rectangle rectangle = new Rectangle(6, 8, 2, 3);

        World.setSize(20, 20);
        World.setDelay(0);
//        World.setVisible();
        RectangleDrawerRobot robot = new RectangleDrawerRobot(1, 1, Directions.South, totalBeepers);

        robot.moveTo(rectangle.getStartingX(), rectangle.getStartingY());
        robot.draw(rectangle);

        assertEquals(rectangle.getStartingY(), robot.getStreet());
        assertEquals(rectangle.getStartingX(), robot.getAvenue());
        assertEquals(2 * width + 2 * height, totalBeepers - robot.getAvailableBeepers());
    }
}
