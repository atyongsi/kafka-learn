package org.example.mock.db.util;

import java.util.Random;

/**
 * Created by atyongsi@163.com on 2020/8/26
 * Description:返回一个[start,end]之间的随机数,包含start,end
 */
public class RandomNum {

    public static int getRandomNum(int start, int end) {

        return start + new Random().nextInt(end - start + 1);
    }

    //这里增加了生成随机数的种子
    public static int getRandomNum(int start, int end, long seed) {

        return start + new Random(seed).nextInt(end - start + 1);
    }

}
