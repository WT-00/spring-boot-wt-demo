package com.wt.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor encryptor=new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username=encryptor.encrypt("root");
        String password=encryptor.encrypt("123456");
        System.out.println(username);
        System.out.println(password);
        //2w+EPUjZJFr5VJNoG9O6Pw==----UsqTYxDy6Fs32gcRIQII3A==
        //6d6D6Teyfc3fCwV0DpU0hA==----R1o1o3jlxDWjqE6fHCfMVA==
    }
}
