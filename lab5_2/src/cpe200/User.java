package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {

    public String userName;
    public String password;

    public User() {
    }

    public String setUserName(String name) {
        String regex = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        String nameBefore = this.userName;
        if (this.userName == name){
            return null;

        }
        if(name.matches(regex)) {
            userName = name;
            return nameBefore;
        }
        else throw new RuntimeException("ERROR");
    }

    public int setPassword(String name) {
        String check = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if (name.matches(check)) {
            password = name;
            return name.length();
        }
        else throw new RuntimeException("ERROR");
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {

        return password;
    }
}
