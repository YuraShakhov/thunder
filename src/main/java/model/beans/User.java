package model.beans;

/**
 * Created by shakhov on 23.03.14.
 */
public class User {
    private String login;
    private String pas;

    public User(String login, String pas){
        this.login = login;
        this.pas=pas;
    }

    public String getLogin() {
        return login;
    }

    public String getPas() {
        return pas;
    }

}

