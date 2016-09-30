package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    private static final String userREGEX = "^([A-Za-z])([A-Za-z0-9]{7,})$";
    private static final String passREGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]){12,}$";

    public User() {
        userName = null;
        password = null;
    }

    @Override
    public String setUserName(String name) {
        if (name != null && !name.matches(userREGEX))
        {
            throw new RuntimeException();
        }
        String tmp_str = userName;
        userName = name;
        return tmp_str;
    }

    @Override
    public int setPassword(String pass) {
        if (pass != null && !pass.matches(passREGEX))
        {
            throw new RuntimeException();
        }
        password = pass;
        return pass.length();

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
