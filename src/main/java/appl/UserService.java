package appl;

import org.springframework.stereotype.Component;

/**
 * Created by Andrii_Banul on 1/24/2017.
 */

@Component
public class UserService {

    public User getUser() {
        User user = new User();
        user.setName("Andrew");
        return user;
    }

}
