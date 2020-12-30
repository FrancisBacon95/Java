import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class homework_clock extends Application {
    @Override
    public void start(Stage primaryStage) {

        double h = 252;
        double w = 252;
        //Create "HBox" with "ClockPane".
        ClockPane clock1 = new ClockPane();
        HBox hBox = new HBox(clock1);
        
        //Using "HBox" with "ClockPane", Create Scene.
        Scene scene = new Scene(hBox, w, h);
        
        //Create and run "Stage" using the scene.
        primaryStage.setScene(scene);
        primaryStage.setTitle("Draw a detailed clock");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}