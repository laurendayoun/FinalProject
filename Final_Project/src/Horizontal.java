import javafx.scene.paint.Color;
import java.util.ArrayList;
import javafx.scene.shape.Rectangle;

/**
 * Created by ohl4928 on 5/15/2017.
 */
public class Horizontal
{
    public Horizontal()
    {
        ArrayList<TetrisBlock> horizontal = new ArrayList<>();
        TetrisBlock p1 = new TetrisBlock(Color.AQUA, 25, 175, 125);
        TetrisBlock p2 = new TetrisBlock(Color.AQUA, 25, 100, 125);
        TetrisBlock p3 = new TetrisBlock(Color.AQUA, 25, 125, 125);
        TetrisBlock p4 = new TetrisBlock(Color.AQUA, 25, 150, 125);

        horizontal.add(p1);
        horizontal.add(p2);
        horizontal.add(p3);
        horizontal.add(p4);
    }

    public Horizontal(double centerx, double centery)
    {
        ArrayList<TetrisBlock> horizontal = new ArrayList<>();
        TetrisBlock p1 = new TetrisBlock(Color.AQUA, 25, centerx + 12.5, centery);
        TetrisBlock p2 = new TetrisBlock(Color.AQUA, 25, centerx + 37.5, centery);
        TetrisBlock p3 = new TetrisBlock(Color.AQUA, 25, centerx - 12.5 , centery);
        TetrisBlock p4 = new TetrisBlock(Color.AQUA, 25, centerx - 37.5 , centery);

        horizontal.add(p1);
        horizontal.add(p2);
        horizontal.add(p3);
        horizontal.add(p4);
    }
}
