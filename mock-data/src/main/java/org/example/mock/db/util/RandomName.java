package org.example.mock.db.util;

import java.util.Random;

/**
 * Created by atyongsi@163.com on 2020/8/26
 * Description:随机生成中文姓名,
 * 代码源于网络 由kingYiFan整理  create2019/05/24
 */

public class RandomName {

    public static String getChineseFamilyName() {
        String str = null;
        Random random = new Random();
        /* 百家姓 */
        String[] Surname = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许",
                "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "苏", "潘", "葛",
                "范", "彭", "鲁", "韦", "马", "苗", "凤", "方", "俞", "任", "袁", "柳", "鲍", "史", "唐", "费", "岑", "薛", "雷", "贺", "汤", "滕",
                "殷", "罗", "毕", "郝", "邬", "安", "常", "乐", "于", "时", "傅", "卞", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄",
                "和", "穆", "萧", "尹", "姚", "汪", "祁", "毛", "狄", "臧", "计", "伏", "成", "戴", "宋", "茅", "庞", "熊", "纪", "舒", "司马",
                "上官", "欧阳", "夏侯", "诸葛", "闻人", "东方", "尉迟", "濮阳", "淳于", "单于", "公孙", "轩辕", "令狐", "钟离", "宇文", "长孙",
                "慕容", "司徒", "司空", "南门", "呼延", "百里", "东郭", "西门", "南宫", "独孤", "季", "章", "云", "奚", "郎", "昌", "花",
                "倪", "邵", "米", "屈", "项", "祝", "董", "梁", "杜", "阮", "蓝", "闵", "席", "贾", "娄", "江", "颜", "郭", "林",
                "徐", "邱", "蔡", "田", "樊", "胡", "霍", "万", "支", "管", "卢", "房", "解", "丁", "邓", "叶", "詹", "刘", "洪"};

        int index = random.nextInt(Surname.length - 1);
        str = Surname[index]; //获得一个随机的姓氏

        return str;
    }

    //女生名
    private static String girlName = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽";
    //男生名
    private static String boyName = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘";

    /**
     * 生成中文名称
     *
     * @return
     */
    public static String getChineseName() {
        /**
         * 生成姓名的男还是女。
         */
        String name_sex = "";

//        int index = RandomNum.getRandomNum(0, surname.length() - 1);
        int index = 1;
//        String first = surname.substring(index, index + 1);
        String first = "";
        int sex = RandomNum.getRandomNum(0, 1);
        String str = boyName;
        int length = boyName.length();
        if (sex == 0) {
            str = girlName;
            length = girlName.length();
            name_sex = "女";
        } else {
            name_sex = "男";
        }
        index = RandomNum.getRandomNum(0, length - 1);
        String second = str.substring(index, index + 1);
        int hasThird = RandomNum.getRandomNum(0, 1);
        String third = "";
        if (hasThird == 1) {
            index = RandomNum.getRandomNum(0, length - 1);
            third = str.substring(index, index + 1);
        }
        return name_sex + ":" + first + second + third;
    }

    public static String getName() {
        //获得姓氏
        String chineseFamilyName = getChineseFamilyName();

        // 第一步:男孩还是女孩,0表示男,1表示女
        int gender = RandomNum.getRandomNum(0, 1);
        if (gender == 0) {

        }


        //第二步:名字由几段组成.除了姓氏,正常由1段或2段组成
        int num = RandomNum.getRandomNum(1, 2);


        return null;
    }



    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
//            String chineseName = getChineseName();
//            System.out.println(chineseName);
            System.out.print(RandomNum.getRandomNum(0, 10) + " ");
        }


    }
}



