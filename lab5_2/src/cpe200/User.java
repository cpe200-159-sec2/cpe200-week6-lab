package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName = " ";
    private String password = " ";
    private static String oldusername = null;
    private static final String CHECKusername = "^[A-Za-z][A-Za-z0-9]{7,}$";

    public User() {
        }

    public String setUsername(String name) {
        this.oldusername = this.userName ;
        if (name == null){
            return null;
        }
        if (name.matches(CHECKusername)){
            this.userName = name;
        } else {
            throw new RuntimeException("Incorrect name.");
        } return this.oldusername;
    }

    public int setPassword(String name){
        if((name.length()>=12)&&(name.matches(".*[a-z]+.*"))&&(name.matches(".*[A-Z]+.*"))&&(name.matches(".*[0-9]+.*"))){
            this.password = name;
        }else {
            throw new RuntimeException("Incorrect password.");
        } return password.length();
    }

    public String getUsername(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }

    @Override
    public String setUserName(String u) {
        return null;
    }
}
