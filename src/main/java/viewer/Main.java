package viewer;

import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/viewer/viewer.fxml"));
        primaryStage.setTitle("Mandelbrot");
        primaryStage.setScene(new Scene(root, 1200, 900));
        primaryStage.show();
    }

    /*

    Scanner saisieUtilisateur = new Scanner(System.in);
    System.out.println("Veuillez saisir un mot :");
    String str (or other if it's not string) = saisieUtilisateur.next();
     */

    public static void main(String[] args) {
        launch(args);
    }
}
