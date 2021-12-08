package com.kxf.seckill.config;

import com.kxf.seckill.pojo.User;

/**
 * @author Kxf
 * @create 2021/12/6,0006
 */
public class UserContext {

    private static ThreadLocal<User> userHolder = new ThreadLocal<>();

    public static void setUser(User user) {
        userHolder.set(user);
    }

    public static User getUser() {
        return userHolder.get();
    }
}
