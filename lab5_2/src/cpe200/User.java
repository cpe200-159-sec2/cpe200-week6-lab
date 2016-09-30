package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String Username ;
    private String Password ;


    @Override
    public String getUserName() {
        return Username ;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    @Override
    public String setUserName(String u) {
        if(u==null){
            return null ;
        }
        String temp = getUserName() ;
        String check = "^[a-zA-Z][a-zA-Z0-9]{7,}$" ;
        if(u.matches(check)){
            Username=u ;
            return temp ;
        }
        throw new RuntimeException("ERROR") ;
    }

    @Override
    public int setPassword(String p) {
        String check = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if(p.matches(check)){
            Password = p ;
            return  Password.length() ;
        }
        throw new RuntimeException("ERROR") ;
    }
}
