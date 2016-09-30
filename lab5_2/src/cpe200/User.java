package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser{

     protected String userName;
     protected String password;
     public User() {

            }
     public User(String user,String pass){
                setUserName(user);
                setPassword(pass);
            }
     public String setUserName(String u)
     {
         if(u==null)return null;
                String preUsername = getUserName();
                if(u.matches("^([A-Za-z])([A-Za-z0-9]{7,})$")){
                        this.userName = u;
                        return preUsername;
                    }
            throw new RuntimeException("ERROR");
            }


    public int setPassword(String p)
     {
         if(p.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]){12,}$")){
                        this.password = p;
                        return this.password.length();
                    }
                throw new RuntimeException("ERROR");
         }

    public String getUserName() {
                return userName;
    }

    public String getPassword() {
                return password;
    }
}

