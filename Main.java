import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    private Stage window;
    private Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        //Button 1
        Label label1 = new Label("First Scene!");
        Button button1 = new Button("Next Scene");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children laid out in vertical column
        VBox layout1 = new VBox(5);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);


        //Button 2
        Label label2 = new Label("Second Scene!");
        Button button2 = new Button("Next Scene");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        VBox layout2 = new VBox(5);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 300, 300);

        //Display Scene 1
        window.setScene(scene1);
        window.setTitle("Javafx");
        window.show();
    }

    @Override
    public void handle(ActionEvent event) {

    }
}
