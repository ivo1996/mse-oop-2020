package introduction.drawers.figures;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ivelin.dimitrov
 */
@Getter
@Setter
public class Rectangle extends Square {
    private int height;

    /**
     *
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width);
        this.height = height;
    }
}
