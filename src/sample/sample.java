package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class sample {
    public Label number;
    private Integer num = 0;

    public void addOne(ActionEvent actionEvent) {
        num++;
        number.setText(num.toString());
    }

    public void subtractOne(ActionEvent actionEvent) {
        num--;
        number.setText(num.toString());
    }

    public void addFive(ActionEvent actionEvent) {
        num += 5;
        number.setText(num.toString());
    }

    public void subtractFive(ActionEvent actionEvent) {
        num -= 5;
        number.setText(num.toString());
    }
}
