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
        User u = new User();
        u.setUserName(userName);
        u.setPassword(password);
        userList.add(u);
    }

    public void deleteUser(IUser user)
    {
        if (!exists(user)){
            throw new RuntimeException("error");
        }
        userList.remove(user);
    }

    public boolean exists(IUser user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for (IUser user : userList){
            if(user.getUserName().equals(username))
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (IUser user : userList){
            if (user.getUserName().equals(userName))
                return user;
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {
        return userList.toArray(new IUser[count()]);
    }
}
