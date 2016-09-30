package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList;

    public Users (){
        userList = new ArrayList<>();
    }

    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        userList.add(user);
    }

    public void deleteUser(IUser user)
    {
        if (userList.size()==0){
            throw new RuntimeException("Empty list");
        }
        userList.remove(user);
    }

    public boolean exists(IUser user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for (int i = 0 ; i < userList.size() ; i++){
            if (userList.get(i).getUserName().equals(username)){
                return true;
            }
        } return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (int i = 0; i< userList.size() ; i++){
            if (userList.get(i).getUserName().equals(userName)){
                return userList.get(i);
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
        return userList.toArray(new User[0]);
    }
}
