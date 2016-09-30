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
        String regex = "^([A-Za-z])([A-Za-z0-9]){7,}$";
        String index;
        if (this.userName == name) {
            return null;
        } else if (name.matches(regex)) {
            index = this.userName;
            userName = name;
            return index;
        }else {
            throw new RuntimeException("Invalid name");
        }
    }

    public int setPassword(String name) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]){12,}$";
        if (userName == name){
            return 0;
        } else if(name.matches(regex)) {
            password = name;
            return password.length();
        }else {
            throw new RuntimeException("Invalid name");
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
