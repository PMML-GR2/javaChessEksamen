package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{


        BorderPane mikaelPane = new BorderPane();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        BorderPane bpane = new BorderPane();
        BorderPane Mirsa = new BorderPane();


        Scene scene = new Scene(bpane, 650, 500);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
