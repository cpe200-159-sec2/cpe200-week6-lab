package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    public String userName;
    public String password;
    private static String oldName;
    private static String oldpass;

    public User(){
        userName = null;
        password = null;
    }

    public User(String u,String p) {
        setUserName(u);
        setPassword(p);

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
    public String setUserName(String u) {
        oldName = userName;
        if (u == null) {return null;}

        else if ((u.length() >= 8) &&(u.matches("^([A-Za-z])([A-Za-z0-9]+)$"))){
            userName = u;
        }

        else throw new RuntimeException("ERROR");
        return  oldName;
    }

    @Override
    public int setPassword(String p) {
        if((p.length() >=12)&&(p.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]+)$"))){
            password =p;

        }
        else throw  new RuntimeException("ERROR");

        return password.length();
    }
}
