package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList;

    public Users()
    {
        userList = new ArrayList<IUser>();
    }

    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        IUser tmp_user = new User();
        tmp_user.setUserName(userName);
        tmp_user.setPassword(password);
        userList.add(tmp_user);
    }

    public void deleteUser(IUser user)
    {
        if (!exists(user))
        {
            throw new RuntimeException();
        }
        userList.remove(user);
    }

    public boolean exists(IUser user)
    {
        for (short i = 0; i < count(); i++)
        {
            if(userList.get(i) == user)
                return true;
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for (short i = 0; i < count(); i++)
        {
            if(userList.get(i).getUserName().equals(username))
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (short i = 0; i < count(); i++)
        {
            if(userList.get(i).getUserName().equals(userName))
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
        IUser tmp_user[] = new User[count()];
        for (short i = 0; i < count(); i++)
        {
            tmp_user[i] = userList.get(i);
        }
        return tmp_user;
    }
}
