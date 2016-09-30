package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser{
    protected String userName;
    protected String password;
    private String user = new String("^[A-Za-z][a-zA-Z0-9]{7,}$");
    private String pass = new String("^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{12,}$");

    public User() {
    }

    public String setUserName(String name) {
        String namefake = this.userName;
        if(null == name){
            return null;
        }
        else if(name.matches(user)) {
            userName = name;
            return namefake;
        }
        else {
            throw new RuntimeException();
        }
    }

    public int setPassword(String name) {
        password = name;

        if(name.matches(pass)) {
            return name.length();
        }
        else {
            throw new RuntimeException();
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}