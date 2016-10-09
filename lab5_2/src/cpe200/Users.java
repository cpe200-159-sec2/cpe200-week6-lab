package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<IUser> userList;

    public Users(){
        setUserList(new ArrayList<IUser>());
    }

    public void addUser(IUser user) {
        getUserList().add(user) ;
    }

    public void addUser(String userName, String password) {
        User user = new User();
        user.setUserName(userName) ;
        user.setPassword(password) ;
        getUserList().add(user) ;

    }

    public void deleteUser(IUser user) {
        if(count()==0) throw new RuntimeException("") ;
        getUserList().remove(user) ;
    }

    public boolean exists(IUser user)
    {
        if(getUserList().contains(user)){
            return true ;
        }
        else {
            return false ;
        }
    }

    public boolean usernameExists(String username)
    {
        for(int i = 0; i< getUserList().size() ; i++){
            if(getUserList().get(i).equals(username)){
                return true ;
            }

        }
        throw new RuntimeException("ERROR") ;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for(int i = 0; i< getUserList().size() ; i++) {
            if (getUserList().get(i).getUserName().equals(userName)) {
                return getUserList().get(i);
            }
        }
        throw new RuntimeException("ERROR") ;
    }

    public int count()
    {
        return getUserList().size();
    }

    public IUser[] getUserArray()
    {
        return getUserList().toArray(new User[getUserList().size()]) ;
    }

    public ArrayList<IUser> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<IUser> userList) {
        this.userList = userList;
    }
}