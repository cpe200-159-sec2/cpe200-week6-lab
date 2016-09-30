package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {

    private String userName;
    private String password;

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String setUserName(String u) {
        if(u==null){
            return null;
        }
        String check = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if (u.matches(check)) {
            String tmp = userName;
            userName = u;
            return tmp;
        } else {
            throw new RuntimeException("Invalid name");
        }
    }

    @Override
    public int setPassword(String p) {
        String check = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if (p.matches(check)) {
            password = p;
            return password.length();
        } else {
            throw new RuntimeException("Invalid password");
        }
    }
}

