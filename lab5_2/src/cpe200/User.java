package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User(){}

    public User(String name,String password) {
        setUserName(name);
        setPassword(password);
    }

    public String setUserName(String name) {
        if(name == null)
            return null;

        String preUsername = getUserName();
        String temp = "[A-Za-z][A-Za-z0-9]{7,}";
        if(name.matches(temp)){
            this.userName = name;
            return preUsername;
        }
        throw new RuntimeException("Error");
    }

    public int setPassword(String name) {
        if(name == null)
            return 0;

        String temp = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-1])[A-Za-z0-9]{12,}";
        if(name.matches(temp)){
            this.password = name;
            return this.password.length();
        }
        throw new RuntimeException("Error");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}