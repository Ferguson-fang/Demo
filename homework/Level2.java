package ferguson.hongyan.demo01;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//import static ferguson.hongyan.demo01.Demo01.juZhen;
 public class Level2{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        Demo01 CJH =new Demo01();
        System.out.println("===================================================");
        System.out.println("Hero show up!");                               //英雄登场
        System.out.println("Please input the name of the player：");       //请玩家输入英雄名称
        System.out.println("===================================================");
        String name = sc.next();
        CJH.setHero(name);
        System.out.println("Please input the life value of the player:");  //请玩家输入英雄的生命值
        int LV = sc.nextInt();
        CJH.setLifeValue(LV);
        int GJ = r.nextInt(100)+50;                                  //随机生成英雄攻击力，range：（10-20）
        CJH.setDamage(GJ);
        int FY = r.nextInt(10)+15;                                     //随机生成英雄的防御力，range：（0-10）
        CJH.setDefense(FY);
        CJH.tell();                                                        //调用方法显示英雄信息
        System.out.println("===================================================");
        Demo02 gbl =  new Demo02();
        Demo02 gbl1 =  new Demo02();

//=================================================================================================================
        System.out.println("Master show up!");
        gbl.setMaster("Goblin0");
        int LV0 = 200;
        System.out.println("Goblin0'Life Value is："+LV0);                //哥布林0的生命值
        gbl.setLV(LV0);
        int GJ0 = r.nextInt(50)+50;                                 //随机生成哥布林0的攻击力 range(10-20)
        gbl.setGJ(GJ0);
        int FY0 = r.nextInt(10)+15;                                    //随机生成哥布林0的防御力 range(0-10)
        gbl.setFY(FY0);
        gbl.show();                                                        //调用方法输出哥布林0的信息
        System.out.println("====================================================");
        gbl1.setMaster1("Goblin1");
        int LV1 = 250;
        System.out.println("Goblin1'Life Value is："+LV1);                //哥布林0的生命值
        gbl1.setLV1(LV1);
        int GJ1 = r.nextInt(75)+75;                                 //随机生成哥布林1的攻击力 range(10-20)
        gbl1.setGJ1(GJ1);
        int FY1 = r.nextInt(20)+15;                                    //随机生成哥布林1的防御力 range(0-10)
        gbl1.setFY1(FY1);
        gbl1.show1();                                                        //调用方法输出哥布林1的信息
        System.out.println("====================================================");
//==================================================================================================================
        while((LV > 0 && LV0 > 0)||(LV >0 && LV1>0)){                          //战斗开始
            //int realGJ = GJ - FY0;                                             //英雄的真实伤害
            //int realGJ0 = GJ0 - FY;                                            //哥布林0的真实伤害
            //int realGJ1 = GJ1 - FY;                                            //哥布林1的真实伤害
            //LV -= realGJ0;                                                     //英雄受到伤害
            //LV0 -= realGJ;                                                     //哥布林0受到伤害
            //LV1 -= realGJ;                                                     //哥布林1受到的伤害
            System.out.println("There are 2 goblins there you have to fight with");
            System.out.println("Choose goblin 0 or goblin 1 to Attack");
            System.out.println("Input your choose:");
            int choice = sc.nextInt();
            switch (choice){
                case(0):
                {
                    int realGJ = GJ - FY0;                                             //英雄的真实伤害
                    int realGJ0 = GJ0 - FY;                                            //哥布林0的真实伤害
                    LV -= realGJ0;                                                     //英雄受到伤害
                    LV0 -= realGJ;                                                     //哥布林0受到伤害
                    break;
                }
                case(1):
                {
                    int realGJ1 = GJ1 -FY;                                             //哥布林1的真实伤害
                    int realGJ = GJ - FY1;                                             //哥布林2的真实伤害
                    LV -= realGJ1;                                                     //英雄受到的伤害
                    LV1 -= realGJ;                                                     //哥布林1受到的伤害
                    break;
                }
            }
            if(LV<=0){
                System.out.println("====================================================");
                System.out.println("Round");
                System.out.println("The rest life value of goblin0 is"+LV0);        //哥布林0剩余血量
                System.out.println("The rest life value of goblin0 is"+LV1);        //哥布林1剩余血量
                System.out.println("The rest life value of "+name+" is"+0);         //英雄血量扣完，英雄失败
                System.out.println(name+" die,game over");
                System.out.println("====================================================");
                break;
            }

            else if(LV0<=0 && LV1<=0){
                System.out.println("====================================================");
                System.out.println("Round");
                System.out.println("The rest life value of goblin0 is"+0);          //哥布林0剩余血量
                System.out.println("The rest life value of goblin1 is"+0);          //哥布林1剩余血量
                System.out.println("The rest life value of "+name+" is"+LV);        //英雄剩余血量
                System.out.println("goblins all die," + name +"win the game!");     //哥布林都被击败，英雄胜利
                System.out.println("====================================================");
                break;
            }
            else if(LV0<=0 && LV1>0){
                System.out.println("====================================================");
                System.out.println("Round");
                System.out.println("The rest life value of goblin0 is"+0);
                System.out.println("The rest life value of goblin1 is"+LV1);
                System.out.println("The rest life value of "+name+" is"+LV);
                System.out.println("====================================================");
            }
            else if(LV0>0 && LV1<=0){
                System.out.println("====================================================");
                System.out.println("Round");
                System.out.println("The rest life value of goblin0 is"+LV0);
                System.out.println("The rest life value of goblin1 is"+0);
                System.out.println("The rest life value of "+name+" is"+LV);
                System.out.println("====================================================");
            }




            System.out.println("====================================================");
            System.out.println("Round");
            System.out.println("The rest life value of goblin0 is"+LV0);
            System.out.println("The rest life value of goblin1 is"+LV1);
            System.out.println("The rest life value of "+name+" is"+LV);
            System.out.println("====================================================");


        }
    }
}











