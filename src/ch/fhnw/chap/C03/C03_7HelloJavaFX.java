package ch.fhnw.chap.C03;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;

/*
Creates and displays two Text objects in a JavaFX window.
 */
public class C03_7HelloJavaFX extends Application {
    public void start (Stage primaryStage){
        Text hello = new Text(50,50, "Hello, JavaFX!");
        Text question = new Text(120, 80, "How's it going?");

        Group root = new Group(hello, question);
        Scene scene = new Scene(root, 300 ,120, Color.LIGHTBLUE);

        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
//-- -- -- --- - -- --- ---- - --- ----- - -- -- - ------------ -- -- ---- --- -- ------- - -
// Launches the Java FX application. This method is not required
// in IDEs that launch  JavaFX applications automatically .
//------- -- - - --- - -- ---- --------- --------- - ------- --- - ---- ----- ------- -
public static void main(String[] args) {
    launch(args);
}

}


