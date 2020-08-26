package org.example.mock.db.util;

import java.util.Random;

/**
 * Created by atyongsi@163.com on 2020/8/26
 * Description:随机生成中文姓名,
 * 代码源于网络 由kingYiFan整理  create2019/05/24
 */

public class RandomName {

    public static String getName() {

        //女生名
        String girlName = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽";
        String girl[] = girlName.split("");
        //男生名
        String boyName = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘";
        String boy[] = boyName.split("");

        //获得姓氏
        String chineseFamilyName = getChineseFamilyName();

        //男孩还是女孩
        int gender = genBoyOrGirl();

        //名字由几部分组成
        int namePartNum = getNamePartNum();

        String name = "";
        if (gender == 0) {
            for (int i = 0; i < namePartNum; i++) {
                name += boy[RandomNum.getRandomNum(0, boy.length - 1)];
            }
        } else {
            for (int i = 0; i < namePartNum; i++) {
                name += girl[RandomNum.getRandomNum(0, girl.length - 1)];
            }
        }

        return chineseFamilyName + name + ":" + gender;
    }

    //随机生成中文姓氏
    public static String getChineseFamilyName() {
        String str = null;
        // 百家姓
        String[] Surname = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许",
                "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "苏", "潘", "葛",
                "范", "彭", "鲁", "韦", "马", "苗", "凤", "方", "俞", "任", "袁", "柳", "鲍", "史", "唐", "费", "岑", "薛", "雷", "贺", "汤", "滕",
                "殷", "罗", "毕", "郝", "邬", "安", "常", "乐", "于", "时", "傅", "卞", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄",
                "和", "穆", "萧", "尹", "姚", "汪", "祁", "毛", "狄", "臧", "计", "伏", "成", "戴", "宋", "茅", "庞", "熊", "纪", "舒", "阮", "蓝",
                "闵", "席", "贾", "娄", "江", "颜", "郭", "林", "徐", "邱", "蔡", "田", "樊", "胡", "霍", "万", "支", "管", "卢", "房", "解", "丁",
                "邓", "叶", "詹", "刘", "洪", "屈", "项", "祝", "董", "梁", "杜", "季", "章", "云", "奚", "郎", "昌", "花", "倪", "邵", "米", "向",
                "司马", "上官", "欧阳", "夏侯", "诸葛", "东方", "尉迟", "公孙", "长孙", "慕容", "西门"};

        int index = RandomNum.getRandomNum(0, Surname.length - 1);
        str = Surname[index]; //获得一个随机的姓氏

        return str;
    }

    //生成男孩还是女孩的名字,0表示男,1表示女
    public static int genBoyOrGirl() {

        int gender = RandomNum.getRandomNum(0, 1);

        return gender;
    }

    //除了姓氏之外,名字由几部分组成,一部分还是两部分
    public static int getNamePartNum() {
        int parts = RandomNum.getRandomNum(1, 2);

        return parts;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            String name = getName();
            System.out.println(name);
        }
    }
}



