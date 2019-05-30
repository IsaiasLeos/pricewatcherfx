package view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        vBox.getChildren().add(createMenuBar());
        vBox.getChildren().add(createToolBar());
        Scene scene1 = new Scene(vBox, 600, 400);
        primaryStage.setOnCloseRequest(event -> {
            event.consume();
            onClose();
        });
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Javafx");
        primaryStage.show();
    }

    private void onClose() {
        Platform.exit();
    }

    @Override
    public void handle(ActionEvent event) {

    }

    private ToolBar createToolBar() {
        ToolBar toolBar = new ToolBar();
        Button checkPrices = new Button();
        checkPrices.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/checkmark.png"))));
        Button add = new Button();
        add.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/plus.png"))));
        Button search = new Button();
        search.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/search.png"))));
        Button up = new Button();
        up.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/up.png"))));
        Button down = new Button();
        down.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/down.png"))));
        Button refresh = new Button();
        refresh.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/refresh.png"))));
        Button openLink = new Button();
        openLink.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/webbrowser.png"))));
        Button delete = new Button();
        delete.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/delete.png"))));
        Button edit = new Button();
        edit.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/edit.png"))));
        Button about = new Button();
        about.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/about.png"))));
        toolBar.getItems().addAll(checkPrices,
                add,
                search,
                up,
                down,
                new Separator(),
                refresh,
                openLink,
                delete,
                edit,
                new Separator(),
                about);
        return toolBar;
    }

    private MenuBar createMenuBar() {
        MenuBar menuBar = new MenuBar();
        Menu app = new Menu("App");
        Menu item = new Menu("Item");
        Menu sort = new Menu("Sort");

        MenuItem about = new MenuItem("About");
        about.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/about.png"))));
        MenuItem exit = new MenuItem("Exit");
        exit.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/exit.png"))));
        app.getItems().addAll(about, exit);

        MenuItem price = new MenuItem("Check Prices");
        price.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/checkmark.png"))));
        MenuItem add = new MenuItem("Exit");
        add.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/plus.png"))));
        MenuItem search = new MenuItem("Check Prices");
        search.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/search.png"))));
        MenuItem first = new MenuItem("Exit");
        first.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/up.png"))));
        MenuItem last = new MenuItem("Exit");
        last.setGraphic(new ImageView(String
                .valueOf(getClass()
                        .getClassLoader()
                        .getResource("resources/down.png"))));
        item.getItems().addAll(price, add, new SeparatorMenuItem(), search, first, last);

        RadioMenuItem sortOld = new RadioMenuItem("Oldest");
        RadioMenuItem sortNew = new RadioMenuItem("Newest");
        RadioMenuItem ascending = new RadioMenuItem("Ascending Order");
        RadioMenuItem descending = new RadioMenuItem("Descending Order");
        RadioMenuItem lowPrice = new RadioMenuItem("Lowest Price ($)");
        RadioMenuItem highPrice = new RadioMenuItem("Highest Price ($)");
        RadioMenuItem lowChange = new RadioMenuItem("Lowest Change (%)");
        RadioMenuItem highChange = new RadioMenuItem("Highest Change (%)");
        ToggleGroup toggleGroup = new ToggleGroup();
        toggleGroup.getToggles().addAll(
                sortOld,
                sortNew,
                ascending,
                descending,
                lowPrice,
                highPrice,
                lowChange,
                highChange);
        sort.getItems().addAll(
                sortOld,
                sortNew,
                new SeparatorMenuItem(),
                ascending,
                descending,
                new SeparatorMenuItem(),
                lowPrice,
                highPrice,
                lowChange,
                highChange);
        menuBar.getMenus().addAll(app, item, sort);
        return menuBar;
    }
}
