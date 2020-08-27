package org.example.mock.util;

/**
 * Created by atyongsi@163.com on 2020/8/27
 * Description:Have Not Yet
 */
public class RandomEmail {

    //生成邮箱,前缀+后缀
    public static String getEmail() {
        String prefix = emailPrefix();
        String suffix = emailSuffix();

        return prefix + suffix;
    }


    //随机生成邮箱前缀[6到12位]
    public static String emailPrefix() {
        String str = "";
        String[] base = ("qw0er2ty4ui5op7lk9jh1gf3ds8az6xc4vb7nm9").split("");
        int prefixLen = RandomNum.getRandomNum(6, 12);
        for (int i = 0; i < prefixLen; i++) {
            int index = RandomNum.getRandomNum(0, base.length-1);
            str += base[index];
        }
        return str;
    }


    //随机生成邮箱后缀
    public static String emailSuffix() {
        String[] email_suffix = ("@gmail.com,@126.com,@yandex.ru,@yahoo.com,@sina.com,@msn.com,@163.net," +
                "@hongkong.com,@hotmail.com,@sohu.com,@ask.com,@live.com,@qq.com,@163.com,@mail.com")
                .split(",");

        int index = RandomNum.getRandomNum(0, email_suffix.length-1);

        return email_suffix[index];
    }

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            String emailPrefix = emailPrefix();
            String suffix = emailSuffix();
            String email = getEmail();
            System.out.println(email);

        }
    }


}
