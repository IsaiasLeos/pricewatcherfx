import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label label1 = new Label("Button");

        //Button 1
        Button button1 = new Button("Alert");
        button1.setOnAction(e -> Alert.display("Alert Window", "Alert"));


        //Button 2
        Button button2 = new Button("Confirmation");
        button2.setOnAction(e -> Confirm.display("Confirmation Window", "Confirm"));

        //Layout 1 - children laid out in vertical column
        VBox layout1 = new VBox(5);
        layout1.getChildren().addAll(label1, button1, button2);
        layout1.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(layout1, 200, 200);


        //Display Scene 1
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Javafx");
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {

    }
}
