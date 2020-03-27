package thinkingingames;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ThinkingInGames extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Nonogram root = new Nonogram();
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
