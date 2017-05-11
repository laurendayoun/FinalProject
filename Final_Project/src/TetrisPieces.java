/**
 * Created by ohl4928 on 5/9/2017.
 */

import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class TetrisPieces extends Application {
    public void start(Stage primaryStage)
    {
        TetrisBlock p1 = new TetrisBlock(Color.AQUA, 50, 200, 200);
        //TetrisBlock p2 = new TetrisBlock(Color.RED, 25, 200, 200);
//        TetrisBlock p3 = new TetrisBlock(Color.AQUA, 25, 125, 125);
//        TetrisBlock p4 = new TetrisBlock(Color.AQUA, 25, 150, 125);
//

        StackPane root = new StackPane();
        root.getChildren().addAll(p1);
//        root.getChildren().add(p2);
//        root.getChildren().add(p3);
//        root.getChildren().add(p4);
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
