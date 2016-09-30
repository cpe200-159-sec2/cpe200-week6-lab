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
        String regex = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(u == null){
            return null;
        }else{
            if(!u.matches(regex)){
                throw new RuntimeException();
            }else{
                String old_name = userName;
                this.userName = u;
                return old_name;
            }
        }
    }

    @Override
    public int setPassword(String p) {
        String regex = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if(p.matches(regex)){
            this.password = p;
            return p.length();
        }else{
            throw new RuntimeException();
        }
    }
}
