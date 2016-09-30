package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private String password;

    @Override
    public String setUserName(String name) throws RuntimeException {
        if(name==null){
            return null;
        }else if (name.length()>=8&&name.matches("^[A-Za-z][A-Za-z0-9]+$")){
            String temp = this.userName;
            this.userName = name;
            return temp;
        }else {
            throw new RuntimeException("Wrong input");
        }
    }

    @Override
    public int setPassword(String name) throws RuntimeException {
        if(name.length()>=12&&name.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[A-Za-z0-9]+")){
            this.password = name;
            return this.password.length();
        }else {
            throw new RuntimeException("Wrong input");
        }
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
