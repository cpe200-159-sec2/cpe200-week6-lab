package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName,password;
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
        String oldName;
        String pattern="^([A-Za-z])([A-Za-z0-9]{7,})$";
        if(u==null) return null;
        if(!u.matches(pattern))
        {
            throw new RuntimeException();
        }
        else
        {
            oldName=userName;
            userName=u;
            return oldName;
        }
    }

    @Override
    public int setPassword(String p) {
        String pass="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})$";
        if(!p.matches(pass))
        {
            throw new RuntimeException();
        }
        else
        {
            password=p;
            return password.length();
        }
    }
}
