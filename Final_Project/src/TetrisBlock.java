
/**
 * Created by ohl4928 on 5/11/2017.
 */
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TetrisBlock extends Rectangle
{
    public TetrisBlock(Color clr, int side, int place1, int place2)
    {
        this.setX(place1);
        this.setY(place2);
        super.setHeight(side);
        super.setWidth(side);
        super.setStroke(Color.BLACK);
        super.setStrokeWidth(1.3);
        super.setFill(clr);
    }

}