package NotepadApp.models;

public class LoginRes {

    String accesToken;

    public LoginRes() {
    }

    public LoginRes(String accesToken, String email) {
        this.accesToken = accesToken;
        this.email = email;
    }

    String email;

    public String getAccesToken() {
        return accesToken;
    }

    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
