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
        String OldName;
        String Ncheck = "[A-Za-z][A-Za-z0-9]{7,}";
        if(u == null){
            return null;
        }
        else if(!u.matches(Ncheck)){
            throw new RuntimeException();
        }
        else{
            OldName = userName;
            userName = u;
            return OldName;
        }
    }

    @Override
    public int setPassword(String p) {
        String PCheck = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})";
        if (!p.matches(PCheck)){
            throw new RuntimeException();
        }
        else
            password = p;
        return password.length();
    }
}
