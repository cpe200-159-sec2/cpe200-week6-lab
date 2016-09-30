package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList;
    public Users(){
        userList = new ArrayList<>();
    }
    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        IUser user = new User();
        user.setPassword(password);
        user.setUserName(userName);
        userList.add(user);
    }

    public void deleteUser(IUser user)
    {
        if(!exists(user))throw new RuntimeException("ERROR");
        userList.remove(user);
    }

    public boolean exists(IUser user)
    {
        if(userList.contains(user)) return true;
        else return false;
    }

    public boolean usernameExists(String username)
    {
        for (IUser findUser : userList) {
            if (findUser.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (IUser findUser : userList) {
            if (findUser.getUserName().equals(userName)){
                return findUser;
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {
        User[] usertoArray = new User[userList.size()];
        usertoArray = userList.toArray(usertoArray);
        return usertoArray;
    }
}
