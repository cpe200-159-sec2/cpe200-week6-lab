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
        this.userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setPassword(password);

        if(newUser != null){
            this.userList.add(newUser);
        }
    }

    public void deleteUser(IUser user)
    {
        if(exists(user)){
            this.userList.remove(user);
        }else{
            throw new RuntimeException();
        }
    }

    public boolean exists(IUser user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        return userList.contains(username);
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for(int i=0; i < userList.size() ; i++){
            if(userList.get(i).getUserName().equalsIgnoreCase(userName)){
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
        return userList.toArray(new IUser[count()]);
    }
}
