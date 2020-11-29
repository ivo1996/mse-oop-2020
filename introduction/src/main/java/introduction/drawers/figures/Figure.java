package introduction.drawers.figures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ivelin.dimitrov
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Figure {
    private int startingX;
    private int startingY;
}
