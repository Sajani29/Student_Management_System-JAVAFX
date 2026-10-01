package Controllers.login;

public class LoginController {
    boolean validateUsernameAndPw(String userName, String passWord) {
        if (userName.equals("sajani") && passWord.equals("1234")){
            return true;
        }
        return false;
    }

}
