package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName = null;
    private String password = "";
    private static String oldUsername = null;
    private static final String CHECKUSERNAME = "^[A-Za-z][A-Za-z0-9]{7,}$";

    public User() {
    }

    public String setUserName(String name) {
        this.oldUsername = this.userName;
        if(name == null) return null;
        if(name.matches(CHECKUSERNAME)){
            this.userName = name;
        } else {
            throw new RuntimeException("Incorrect Name");
        }
        return this.oldUsername;
    }

    public int setPassword(String name) {
        if((name.length()>=12)&&(name.matches(".*[a-z]+.*"))&&(name.matches(".*[A-Z]+.*"))&&(name.matches(".*[0-9]+.*"))){
            this.password = name;
        } else {
            throw new RuntimeException("Incorrect Password");
        }
        return password.length();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

}
