package common;

import user.User;

import java.util.Scanner;

public class EnterPeople {//To get the information of User
    //Like cin in cpp, get values in terminal
    private Scanner scanner;
    private User user;

    public EnterPeople() {
        scanner = new Scanner(System.in);
        user = new User();
    }

    public User getUser() {// getting username and password
        System.out.println("Enter your username:");
        String username = scanner.next();
        System.out.println("Enter your password:");
        String password = scanner.next();

        setUser(username, password);
        return user;
    }

    //we should write a method for username and password processing

    public void setUser(String username, String password) {// set username and password for user
        user.setUsername(username);
        user.setPassword(password);
    }
}
