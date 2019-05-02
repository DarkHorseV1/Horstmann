package sample;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MyRotateTransition extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane();
        Rectangle rectangle = new Rectangle(50, 50, Color.AQUAMARINE);//создаем квадрат
        rectangle.setX(100);                //задаем позицию
        rectangle.setY(100);

        rectangle.setOnMouseClicked(event -> {
            javafx.animation.RotateTransition rt = new javafx.animation.RotateTransition(Duration.seconds(1), rectangle);/*анимация поворота,
            параметры - длительность и обект над которым она производится*/
            rt.setByAngle(300);             //На сколько градусов повернуть
            rt.setCycleCount(4);            //Счетчик поворовтов (Повернет 4 раза на 300 градусов)
            rt.setAutoReverse(false);       //Автоповорот назад, также считается за один цикл
            rt.play();                      //запуск анимации
        } );
        root.getChildren().add(rectangle);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

