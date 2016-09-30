package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User(){}

    public User(String user,String pass) {
        this.userName = user;
        this.password = pass;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String setUserName(String name) {
        String regex = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(name != null && !name.matches(regex)) throw new RuntimeException();

        if(name != null && name.matches(regex)) {
            String oldName = userName;
            userName = name;
            return oldName;
        }
        else return userName;
    }

    @Override
    public int setPassword(String pass) {
        String rx = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";

        if(pass.matches(rx)) {
            password = pass;
            return password.length();
        }
        return 0;
    }
}
