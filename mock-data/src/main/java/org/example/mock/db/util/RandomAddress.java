package org.example.mock.db.util;

import static org.example.mock.db.util.RandomAdministrativeArea.getAdministrativeArea;

/**
 * Created by atyongsi@163.com on 2020/8/27
 * Description:Have Not Yet
 */
public class RandomAddress {

//    华北（北京、天津、河北、山西、内蒙古）
//
//    东北（辽宁、吉林、黑龙江）
//
//    华东（上海、江苏、浙江、江西、安徽、福建、山东）
//
//    中南（河南、湖北、湖南、广东、广西、海南）
//
//    西南（重庆、四川、贵州、云南、西藏）
//
//    西北（陕西、甘肃、青海、宁夏、新疆）
//
//    港澳台（香港、澳门、台湾）



    public static String getCity() {
        // 获得行政区
        String administrativeArea = getAdministrativeArea();
        switch (administrativeArea){
            case "华北":
        }


        return null;
    }

}
