package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginPageController {

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void onActionLogin(ActionEvent event) {
            String userName = txtUserName.getText();
            String passWord = txtPassword.getText();

           boolean status = validateUsernameAndPw(userName,passWord);
           System.out.println(status);
    }

    private boolean validateUsernameAndPw(String userName, String passWord) {
        if (userName.equals("sajani") && passWord.equals("1234")){
            return true;
        }
        return false;
    }

}
