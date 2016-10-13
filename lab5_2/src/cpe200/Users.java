package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList;
    public Users(){
        userList = new ArrayList<IUser>();
    }

    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {

        userList.add(new User(userName,password));
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
        return username.contains(username);
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for(int i=0; i<userList.size(); i++){
            if(userList.get(i).getUserName().equals(userName)){
                return userList.get(i);
            }
        }
        return new User();
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {
        IUser[] userArray = new User[userList.size()];
        for(int i=0;i<userList.size();i++){
            userArray[i] = userList.get(i);
        }
         return userArray;
         }
    public IUser[] getArray(){
        return userList.toArray (new User[userList.size()]);
        }
}
