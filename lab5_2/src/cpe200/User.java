package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        setUserName(username);
        setPassword(password);
    }


    public String setUserName(String name) {
        String temp;
        String check = "^([A-Za-z])([A-Za-z0-9]{7,})$";
        if (name == null)
            return  null;
        if (name != null && name.matches(check)) {
            temp = getUserName();
            userName = name;
            return temp;
        } else {
            throw new RuntimeException(""+getUserName());
        }
    }


    public int setPassword(String pass) {
        String check = "^(?=.*[0-9])(?=.*[A-Za-z])(?=.*[A-Z])(?=.*[a-z])([A-Za-z0-9]{12,})$";

        if (pass.matches(check)) {
            password = pass;
            return getPassword().length();

        } else {
            throw new RuntimeException("Don't setPassword");
        }
    }


    public String getUserName() {
        return this.userName;
    }


    public String getPassword() {
        return this.password.toString();
    }
}
