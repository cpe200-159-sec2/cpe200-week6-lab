package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList = new ArrayList<>();

    public void addUser(IUser user) {
        userList.add(user);
    }

    public void addUser(String userName, String password) {
        User Name = new User();
        Name.setUserName(userName);
        Name.setPassword(password);
        addUser(Name);
    }

    public void deleteUser(IUser user) {
        if(!exists(user)){
            throw new RuntimeException();
        }else
            userList.remove(user);
    }

    public boolean exists(IUser user) {
        if (userList.contains(user))
            return true;
        return false;
    }

    public boolean usernameExists(String username) {
        for (IUser userN : userList) {
            if (userN.getUserName().equals(username))
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName) {
        for (IUser userN : userList) {
        if (userN.getUserName().equals(userName))
                return userN;
        }
        return null;
    }

    public int count() {
        return userList.size();
    }

    public IUser[] getUserArray() {
        return userList.toArray(new IUser[userList.size()]);
    }
}
