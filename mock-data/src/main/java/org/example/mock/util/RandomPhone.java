package org.example.mock.util;


/**
 * Created by atyongsi@163.com on 2020/8/27
 * Description:随机生成手机号,这里并没有考虑区号的因素
 * 仅仅是生成11位数字
 */
public class RandomPhone {

    //获取一个随机的手机号码
    public static String getPhone() {
        String first = genFirstPartPhone();
        String second = genSecondPartPhone();
        String third = genThirdPartPhone();

        return first + second + third;
    }

    //随机生成第一部分的电话号码
    public static String genFirstPartPhone() {
        String[] telFirst = ("134,184,187,188,181,156,135,158,136,185,131,178," +
                "150,186,176,138,139,182,152,157,159,189,177,130,151,132,155,133,153,180,137,183")
                .split(",");

        int randomIndex = RandomNum.getRandomNum(0, telFirst.length-1);

        return telFirst[randomIndex];
    }

    //随机生成第二部分的电话号码
    public static String genSecondPartPhone() {
        int secondPartPhone = RandomNum.getRandomNum(1000, 9999);

        String str = String.valueOf(secondPartPhone);

        return str;
    }

    //随机生成第三部分的电话号码
    public static String genThirdPartPhone() {
        int thirdPartPhone = RandomNum.getRandomNum(1000, 9999, 19931129L);
        String str = String.valueOf(thirdPartPhone);

        return str;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            String phone = getPhone();
            System.out.println(phone);
        }
    }
}
