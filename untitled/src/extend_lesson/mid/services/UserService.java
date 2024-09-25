package extend_lesson.mid.service;

import extend_lesson.mid.data.Database;
import extend_lesson.mid.entities.User;


import java.util.Scanner;

public class UserService {

    public void register(Scanner scanner){
        //Insert a new account
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password: ");
        String password = scanner.nextLine();
        System.out.println("Mời b nhập email: ");
        String email = scanner.nextLine();
        // todo check regex for email and password


        if(findUserByUsernameAndEmail(username, email) == null){
            Database.users.add(new User(username, password, email));
            System.out.println("Đăng lý thành công");
        } else {
            System.out.println("Username hoặc email đã tồn tại ");
        }
    }

    public User login(Scanner scanner){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password: ");
        String password = scanner.nextLine();
        User user = findUserByUsernameAndPassword(username, password);
        if(user != null){
            return user;
        } else {
            return null;
        }
    }

    public User findUserByUsername(String username){
        for (User user: Database.users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    public User findUserByEmail(String email){
        for (User user: Database.users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
    public User findUserByUsernameAndPassword(String username, String password){// 100
        for (User user: Database.users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public User findUserByUsernameAndEmail(String username, String email){
        for (User user: Database.users){
            if(user.getUsername().equals(username) && user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public void changeUsername(Scanner scanner, User user){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        // Kiểm tra username đã tồn tại hay chưa
        if(findUserByUsername(username) !=null){
            //Đã tồn tại -> báo lỗi

        } else {
            user.setUsername(username);
        }

    }
}