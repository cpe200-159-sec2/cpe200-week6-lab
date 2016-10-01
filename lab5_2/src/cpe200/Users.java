package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<IUser> userList;

    public Users(){
        userList = new ArrayList<>();
    }

    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User u = new User();
        u.setUserName(userName);
        u.setPassword(password);
        userList.add(u);
    }

    public void deleteUser(IUser user)
    {
        if(userList.isEmpty()){
            throw new RuntimeException("Error");
        }
        userList.remove(user);
    }

    public boolean exists(IUser user)
    {
        for(int i = 0 ; i < count();i++){
            if(userList.get(i) == user)
                return true;
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i = 0 ; i < count() ; i++){
            if(userList.get(i).getUserName() == username)
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for(int i = 0 ; i < count() ; i++){
            if(userList.get(i).getUserName() == userName)
                return userList.get(i);
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {
        return userList.toArray(new User[userList.size()]);
    }

    public ArrayList<IUser> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<IUser> userList) {
        this.userList = userList;
    }
}