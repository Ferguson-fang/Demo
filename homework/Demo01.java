package ferguson.hongyan.demo01;

import jdk.dynalink.beans.StaticClass;

/*
import java.util.Scanner;
import java.util.Random;

public class Demo01 {
    public static void juZhen() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请为对称矩阵输入行列数");
        int num1 = sc.nextInt();
        int[][] array1= new int[num1][num1];
        int[][] array2= new int[num1][num1];
        System.out.println("随机对称矩阵A：");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = r.nextInt(10);
                if(i == 1 && j == 0)
                    System.out.print("\n");
                System.out.print(array1[i][j] +"\t");
            }

        }
        System.out.println();
        System.out.println("随机对称矩阵B：");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = r.nextInt(10);
                if(i == 1 && j == 0)
                    System.out.print("\n");
                System.out.print(array2[i][j] +"\t");
            }

        }
        System.out.println();
        System.out.println("相乘后的矩阵");
        int[][] C = new int[num1][num1];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = array1[i][j] * array2[i][j];
                if(i==1 && j ==0)
                    System.out.println();
                System.out.print(C[i][j] +"\t");
            }
        }




    }
}

//import jdk.swing.interop.SwingInterOpUtils;
*/

import java.util.Random;


class Demo01 {
    Random r = new Random();
    private String hero;
    private int lifeValue;
    private int damage;
    private int defense;

    public void tell() {
        System.out.println("Name:" + getHero() +"\t"+ "Life Value:" + getLifeValue());
        System.out.println("Damage:" + getDamage() +"\t"+ "Defense:" + getDefense());
    }

    public Demo01(){

    }

    public Demo01(String hero,int lifeValue,int damage,int defense){
        this.hero = hero;
        this.lifeValue = lifeValue;
        this.damage = damage;
        this.defense = defense;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}













