package ch.fhnw.chap.C03;
/*
Creates and displays several shapes.
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class C03_08Einstein extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //เส้นตรง
        Line line = new Line(35,60,150,170);

        //วงกลม
        Circle circle = new Circle(100, 65, 20);
        circle.setFill(Color.BLUE);

        //สี่เหลี่ยม
        Rectangle rect = new Rectangle(60, 70, 250 ,60);
        rect.setStroke(Color.RED);
        rect.setStrokeWidth(2);
        rect.setFill(null);

        //วงรี
        Ellipse ellipse = new Ellipse(200, 100, 150, 50);
        ellipse.setFill(Color.PALEGREEN);

        Text quote = new Text(120,100, "Put of clutter, find " + "simplicity.\n --Albert Einstein");

        Group root = new Group(ellipse,rect, circle, line, quote);
        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Einstein");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
