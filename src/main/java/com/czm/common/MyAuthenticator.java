package com.czm.common;

import javax.mail.PasswordAuthentication;

/**
 * Created by wly on 2018/3/7.
 * 登录邮箱的身份验证类
 * 通过 extends Authenticator 抽象类
 * 在子类中覆盖父类中的 getPasswordAuthentication() 方法，就可以实现以不同的方式来进行登录邮箱时的用户身份认证。
 */

public class MyAuthenticator extends javax.mail.Authenticator {
    private String strUser;
    private String strPwd;
    public MyAuthenticator(String user, String password) {
        this.strUser = user;
        this.strPwd = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(strUser, strPwd);
    }
}
