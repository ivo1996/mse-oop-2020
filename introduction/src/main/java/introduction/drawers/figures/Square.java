package introduction.drawers.figures;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ivelin.dimitrov
 */
@Getter
@Setter
public class Square extends Figure {
    private int width;

    /**
     * @param x
     * @param y
     * @param width
     */
    public Square(int x, int y, int width) {
        super(x, y);
        this.width = width;
    }
}
