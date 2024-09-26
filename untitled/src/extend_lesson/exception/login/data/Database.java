package extend_lesson.exception.login.data;

import extend_lesson.exception.login.entities.User;
import extend_lesson.exception.login.enums.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<User> users = new ArrayList<>(Arrays.asList
            (new User("admin", "123", Role.ADMIN),
                    new User("datct", "123", Role.CUSTOMER)));

}




