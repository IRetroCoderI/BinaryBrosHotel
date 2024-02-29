import java.util.HashMap;


public class PasswordsAndIDs{

    HashMap<String, String> loginInfo = new HashMap<String, String>();
    // using hashmaps for now bc they store key/value pairs, perfect for representing username/passwords for now. sql will be implemented later...

    PasswordsAndIDs(String userName, String password){ //constructor for "PasswordsAndIDs" class
        loginInfo.put(userName, password);

    }

    PasswordsAndIDs(){
        loginInfo.put("Manager","p@$$w0rd"); // temp login info for testing purposes.
    }

    
    @SuppressWarnings("rawtypes")
    protected HashMap getLoginInfo(){
        return loginInfo;
    }

}