import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

class Confirm {

    private static boolean answer;

    static boolean display(String title, String msg) {
        Stage window = new Stage();
        window.setTitle(title);

        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinHeight(200);
        window.setMinWidth(200);

        Button yes = new Button("Yes");
        Button no = new Button("No");

        yes.setOnAction(event -> {
            answer = true;
            window.close();
        });

        no.setOnAction(event -> {
            answer = false;
            window.close();
        });

        Label label = new Label();
        label.setText(msg);


        VBox layout = new VBox(5);
        layout.getChildren().addAll(label, yes, no);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
