package by.htp.git.bo;


public class Account {
    private String login;
    private String password;
    private String email;

    public Account(String login) {
        this.login = login;
    }

    public Account(String login, String email, String password) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
