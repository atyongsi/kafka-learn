package org.example.mock.db.util;

/**
 * Created by atyongsi@163.com on 2020/8/27
 * Description:获得行政区
 */
public class RandomAdministrativeArea {

    //华北区,东北区,华东区,中南区,西南区,西北区,港澳台
    public static String getAdministrativeArea() {
        String[] administrativeArea = {"华北", "东北", "华东", "中南", "西南", "西北", "港澳台"};

        int index = RandomNum.getRandomNum(0, administrativeArea.length - 1);

        return administrativeArea[index];
    }


}
