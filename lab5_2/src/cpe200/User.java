package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {

    private static final String USERNAME_PATTERN = "^[A-Za-z][A-Za-z0-9]{7,}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{12,}$";

    private String userName;
    private String password;

    public User() {
        userName = null;
        password = null;
    }

    @Override
    public String setUserName(String userName) throws Exception {
        if (null != userName && !userName.matches(USERNAME_PATTERN)) {
            throw new RuntimeException("Invalid username");
        }
        String tmp = getUserName();
        this.userName = userName;
        return tmp;
    }

    @Override
    public int setPassword(String password) throws Exception {
        if (null != password && !password.matches(PASSWORD_PATTERN)) {
            throw new RuntimeException("Invalid password");
        }
        this.password = password;
        return getPassword().length();
    }
    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

}
