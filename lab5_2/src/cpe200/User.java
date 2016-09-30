package cpe200;

import com.sun.org.apache.bcel.internal.generic.IUSHR;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public User() {


    }

    @Override
    public String setUserName(String name) {
        if(name == null) return null;

        String r = this.getUserName();
        String regex = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(name.matches(regex)) {
            this.userName = name;
            return r;
        }
        else throw new RuntimeException();
    }
    @Override
    public int setPassword(String name) {
        String check = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if (name.matches(check)) {
            this.password = name;
            return this.password.length();
        }
        throw new RuntimeException();
    }
    @Override
    public String getUserName() {
        return this.userName;
    }
    @Override
    public String getPassword() {
        return this.password;
    }


}
