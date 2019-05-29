package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane layout = new StackPane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(layout, 300, 275));

        Button button = new Button();
        button.setText("Click Me");
        button.setOnAction(this);

        layout.getChildren().add(button);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Test");
    }
}
