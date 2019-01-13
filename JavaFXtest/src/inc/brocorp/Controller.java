package inc.brocorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button pushButton;

    @FXML
    private TextField textField;
    private int count = 0;

    @Override
    public void initialize(URL location, ResourceBundle resource){

    }
    public void showDateAndTime(ActionEvent ae){
        count++;
        System.out.println("Button clicked "+count+" times!");

        Date now = new Date();

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        String date = df.format(now);

        textField.setText(date);
    }
}
