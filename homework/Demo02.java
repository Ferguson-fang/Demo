package ferguson.hongyan.demo01;

import java.util.ArrayList;

public class Demo02 {
    //===========================================哥布林0================================================================
    private String master;                                  //成员变量：哥布林0
    private int LV;                                         //成员变量：血量
    private int GJ;                                         //成员变量：攻击力
    private int FY;                                         //成员变量：防御力
    public int getFY() {
        return FY;
    }
    public void setFY(int FY) {
        this.FY = FY;
    }
    public void show(){
        System.out.println("Name:"+master+"\t"+"LifeValue:"+LV);
        System.out.println("Damage:"+GJ+"\t"+"Defense:"+FY);
    }
    public String getMaster() {
        return master;
    }
    public void setMaster(String master) {
        this.master = master;
    }
    public int getLV() {
        return LV;
    }
    public void setLV(int LV) {
        this.LV = LV;
    }
    public int getGJ() {
        return GJ;
    }
    public void setGJ(int GJ) {
        this.GJ = GJ;
    }
    //==========================================哥布林1==================================================================
    private String master1;                                  //成员变量：哥布林1
    private int LV1;                                         //成员变量：血量
    private int GJ1;                                         //成员变量：攻击力
    private int FY1;                                         //成员变量：防御力
    public int getFY1() {
        return FY1;
    }
    public void setFY1(int FY1) {
        this.FY1 = FY1;
    }
    public void show1(){
        System.out.println("Name:"+master1+"\t"+"LifeValue:"+LV1);
        System.out.println("Damage:"+GJ1+"\t"+"Defense:"+FY1);
    }
    public String getMaster1() {
        return master1;
    }
    public void setMaster1(String master1) {
        this.master1 = master1;
    }
    public int getLV1() {
        return LV1;
    }
    public void setLV1(int LV1) {
        this.LV1 = LV1;
    }
    public int getGJ1() {
        return GJ1;
    }
    public void setGJ1(int GJ1) {
        this.GJ1 = GJ1;
    }
    //=================================================分割线==========================================================
    public static void main(String[] args) {
        ArrayList<Integer> goblin = new ArrayList<>();                               //创建成员方法
        for (int i = 0; i < 2; i++) {
            goblin.add(i);
            System.out.print(goblin.get(i));
        }
    }



}


