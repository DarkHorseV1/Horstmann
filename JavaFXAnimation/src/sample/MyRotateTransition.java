package sample;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
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
            RotateTransition rt = new RotateTransition(Duration.seconds(1), rectangle);/*анимация поворота,
            параметры - длительность и обект над которым она производится*/
            rt.setByAngle(300);             //На сколько градусов повернуть
            rt.setCycleCount(4);            //Счетчик поворовтов (Повернет 4 раза на 300 градусов)
            rt.setAutoReverse(false);       //Автоповорот назад, также считается за один цикл
            rt.play();                      //запуск анимации
        } );

        Rectangle rectangle2 = new Rectangle(50, 50, Color.DARKMAGENTA);
        rectangle2.setX(200);
        rectangle2.setY(200);

        rectangle2.setOnMouseEntered(event ->{
            ScaleTransition st = new ScaleTransition(Duration.seconds(0.5), rectangle2);//создать анимацию увеличения
            st.setToX(1.5);                 //Увеличение До по оси Х
            st.setToY(1.5);                 //Увеличение ДО по оси У
            st.play();
        });

        rectangle2.setOnMouseExited(event ->{
            ScaleTransition st = new ScaleTransition(Duration.seconds(0.5), rectangle2);
            st.setFromX(1.5);               //Уменьшение с 1.5
            st.setFromY(1.5);
            st.setToX(1);
            st.setToY(1);
            st.play();
        });

        root.getChildren().addAll(rectangle, rectangle2);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

