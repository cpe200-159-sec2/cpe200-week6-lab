package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {

    protected String userName;
    protected String password;

    public User() {

    }

    public User(String user,String pass){
        setUserName(user);
        setPassword(pass);
    }

    public String setUserName(String name) {
        String OldN;
        String Ncheck = "[A-Za-z][A-Za-z0-9]{7,}";
        if (name==null){
            return null;
        }
        if(name.matches(Ncheck)){
            OldN = userName;
            userName = name;
            return OldN;
        }
            throw new RuntimeException();
    }

    public int setPassword(String name) {
        String CheckP = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})";
        if (!name.matches(CheckP)){
            throw new RuntimeException();
        }
        else
            password = name;
        return password.length();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
