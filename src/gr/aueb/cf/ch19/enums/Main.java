package gr.aueb.cf.ch19.enums;

import gr.aueb.cf.ch12.User;

public class Main {

    public static void main(String[] args) {
        UserRole role = UserRole.STUDENT;
        String strRole = role.name();  //toString() --> "STUDENT"
        UserRole studentRole = UserRole.valueOf(strRole); // typecasts String back to Enum
    }
}
