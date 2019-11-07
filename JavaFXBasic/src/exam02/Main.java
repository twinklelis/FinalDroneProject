package exam02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("init()");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start()");
        primaryStage.setTitle("내가 만든 윈도우임");
        //primaryStage.setMaximized(true);

        //AnchorPane anchorPane = (AnchorPane) FXMLLoader.load(getClass().getResource("Main.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        AnchorPane anchorPane = (AnchorPane) fxmlLoader.load();

        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);

        primaryStage.setWidth(600);
        primaryStage.setHeight(400);

        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop()");
    }

    public static void main(String[] args){
        launch(args);
    }

}