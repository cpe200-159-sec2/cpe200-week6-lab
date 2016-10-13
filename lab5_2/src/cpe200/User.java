package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    public String userName;
    public String password;
    private static String OldName;
    private static String OldPassword;

    public User() {
        userName = null;
        password = null;
    }

    public User(String u ,String p){
        setUserName(u);
        setPassword(p);
    }

    public String setUserName(String u) {
        OldName = userName;
    if(u == null){
        return null;
    }
        else if (u.matches("^([A-Z|a-z])([A-Z|a-z|0-9]+)$")&&u.length()>=8){
            userName = u;

        }
        else throw new RuntimeException("error");
        return  OldName;
    }

    public int setPassword(String p) {

        if (p.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([A-Z|a-z|0-9])+$")&&p.length()>=8){
            password = p;

        }
        else throw new RuntimeException("error");
        return password.length();
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }
}
