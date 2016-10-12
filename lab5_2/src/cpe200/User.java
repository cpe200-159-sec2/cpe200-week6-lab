package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName;
    private  String passward;

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String setUserName(String userName) {
        String OldName;
        String Ncheck = "[A-Za-z][A-Za-z0-9]{7,}";
        if (userName == null){
            return null;
        }else if (!userName.matches(Ncheck)){
            throw new RuntimeException();
        }else {
            OldName = this.userName;
            this.userName = userName;
            return OldName;
        }
    }

    @Override
    public String getPassword() {
        return passward;
    }

    @Override
    public int setPassword(String p) {
        String PCheck = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})";
        if (!p.matches(PCheck)){
            throw new RuntimeException();
        }else {
            passward = p;
        }
        return passward.length();
    }

}