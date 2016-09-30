package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public interface IUser {
    String getUserName();
    String getPassword();
    String setUserName(String u) throws Exception;
    int setPassword(String p) throws Exception;
}
