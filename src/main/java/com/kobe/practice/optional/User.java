package com.kobe.practice.optional;

/**
 * @ClassName User
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-26 12:05
 * @Version 1.0
 */
public class User {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static String getName(User user) {
        if (user == null) {
            return "Unknow";
        }
        return user.username;
    }

}
