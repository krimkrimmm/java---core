package service;
import constant.Regex;
import constant.Status;
import enums.Role;
import entities.User;
import main.Main;

import util.FileUtil;
import util.InputUtil;

import java.util.*;
public class CustomerService {
    private List<User> users;
    private List<String> lockedCustomer = new ArrayList<>();
    private static final HashSet<String> lockUserByEmails = new HashSet<>();

    private static final String USER_DATA_FILE = "users.json";
    private static final String ADMIN_EMAIL = "admin@gmail.com";
    private static final String ADMIN_PASSWORD = "admin";
    private final FileUtil<User> fileUtil = new FileUtil<>();
    private static int AUTO_ID;


    private static final int MAX_LOGIN_TIMES = 5;



    // Customer co chuc nang gi thi code vao day

}









