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

        public void addUser(String userName, String password) {
               IUser temp = new User(userName,password);
                userList.add(temp);

    }

    public void deleteUser(IUser user)
    {
        userList.remove(userList.indexOf(user));
    }

    public boolean exists(IUser user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username){

        return false;
    }


    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (IUser i : userList){
                       if (i.getUserName().equals(userName)) return i;
                    }

        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {
        return userList.toArray(new IUser[1]);
    }
}


/*333