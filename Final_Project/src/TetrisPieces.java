/**
 * Created by ohl4928 on 5/9/2017.
 */

import javafx.scene.Scene;
import javafx.application.Application;
import java.util.ArrayList;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class TetrisPieces extends Application {
    public void start(Stage primaryStage)
    {
        Horizontal H = new Horizontal(125, 125);

        TetrisBlock pp1 = new TetrisBlock(Color.RED, 25, 125, 150);
        TetrisBlock pp2 = new TetrisBlock(Color.RED, 25, 150, 150);
        TetrisBlock pp3 = new TetrisBlock(Color.RED, 25, 125, 125);
        TetrisBlock pp4 = new TetrisBlock(Color.RED, 25, 150, 125);

        ArrayList<TetrisBlock> block = new ArrayList<>();
        block.add(pp1);
        block.add(pp2);
        block.add(pp3);
        block.add(pp4);

        Pane root = new Pane();
        root.getChildren().addAll(H, block);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Piece1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args)
    {
        launch(args);
    }
}
