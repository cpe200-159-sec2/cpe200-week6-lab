package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    public  User(){
    }

    public User(String userName,String password){
        this.setUserName(userName);
        this.setPassword(password);
    }

    @Override
    public String getUserName(){
        return this.userName;
    }

    @Override
    public String getPassword(){
        return this.password;
    }

    @Override
    public String setUserName(String name){
        String oldname;
        String rx = "[A-Za-z][0-9A-Za-z]{7,}";
        if(name == null) return null;
        if(name.matches(rx))
        {
            oldname = userName;
            this.userName = name;
            return oldname;
        }
        else throw new RuntimeException();

    }

    @Override
    public int setPassword(String name){
        String rx = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if ( name.matches((rx)))
        {
            this.password = name;
            return password.length();
        }
        else throw new RuntimeException();

    }
}
