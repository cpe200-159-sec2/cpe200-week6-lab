package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User() {
    }

    public String setUserName(String name) {
        String oldName;
        String pattern = "^([A-Za-z])([A-Za-z0-9]{7,})$";
        if(name == null) return null;
        if (!name.matches(pattern)) {
            throw new RuntimeException();
        } else {
            oldName = userName;
            userName = name;
            return oldName;
        }
    }

    public int setPassword(String name) {
        String pass = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})$";
        if (!name.matches(pass)) {
            throw new RuntimeException();
        } else {
            password = name;
            return password.length();
        }
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }

}
