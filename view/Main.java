package view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utils.Alert;
import utils.Confirm;

public class Main extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label label1 = new Label("Button");

        //Button 1
        Button button1 = new Button("utils.Alert");
        button1.setOnAction(e -> Alert.display("utils.Alert Window", "utils.Alert"));


        //Button 2
        Button button2 = new Button("Confirmation");
        button2.setOnAction(e -> Confirm.display("Confirmation Window", "utils.Confirm"));

        //Layout 1 - children laid out in vertical column
        VBox layout1 = new VBox(5);
        layout1.getChildren().addAll(label1, button1, button2);
        layout1.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(layout1, 200, 200);


        primaryStage.setOnCloseRequest(event -> {
            event.consume();
            onClose();
        });
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Javafx");
        primaryStage.show();
    }

    private void onClose() {
        boolean answer = Confirm.display("Exit", "Are you sure you want to exit?");
        if (answer) {
            Platform.exit();
        }
    }

    @Override
    public void handle(ActionEvent event) {

    }
}
