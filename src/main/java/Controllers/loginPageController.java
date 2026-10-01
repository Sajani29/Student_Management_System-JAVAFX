package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginPageController {

    @FXML
    public TextField txtField1;
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btnSubmit;

    @FXML
    void btn01OnAction(ActionEvent event) {
        System.out.println("btn01");
    }

    @FXML
    void btn2OnAction(ActionEvent event) {
        System.out.println("btn02");
    }

    @FXML
    void btn3OnAction(ActionEvent event) {
        System.out.println("btn03");
    }

    @FXML
    void btn4OnAction(ActionEvent event) {
        System.out.println("btn04");
    }

    @FXML
    void btn5OnAction(ActionEvent event) {
        System.out.println("btn05");
    }

    @FXML
    void btn6OnAction(ActionEvent event) {
        System.out.println("btn06");
    }

    @FXML
    void onActionSubmit(ActionEvent event) {
        System.out.println("btnSubmit");
    }

    public void txt1OnAction(ActionEvent actionEvent) {
        System.out.println("txt values");
    }
}
