package appl;

import org.springframework.stereotype.Component;

/**
 * Created by Andrii_Banul on 1/24/2017.
 */
@Component
public class User {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
