package utils;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

class Alert {
    static void display(String title, String msg) {
        Stage window = new Stage();
        window.setTitle(title);

        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinHeight(200);
        window.setMinWidth(200);
        Label label = new Label();
        label.setText(msg);

        Button close = new Button("Close");
        close.setOnAction(e -> window.close());

        VBox layout = new VBox(5);
        layout.getChildren().addAll(label, close);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
