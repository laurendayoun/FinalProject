
/**
 * Created by ohl4928 on 5/11/2017.
 */
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TetrisBlock extends Rectangle
{
    public TetrisBlock(Color clr, double side, double place1, double place2)
    {
        super.setX(place1);
        super.setY(place2);
        super.setHeight(side);
        super.setWidth(side);
        super.setStroke(Color.BLACK);
        super.setStrokeWidth(1.3);
        super.setFill(clr);
    }

}