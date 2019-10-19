package com.jh.java;

/**
 * 这是文本注释
 */
public class HelloWorld {

    public static void main(String[] args){
        //region Description
        System.out.println("helloworld!!");
        String a = "accc";
        String b = "accc";
        System.out.println(a.equals(b));
        //endregion
        System.out.println(a==b);
    }

    public void sort() {
        //这是单行注释

        /*
        这是多行注释
         */
        String a = "accc";
        String b = "accc";
        System.out.println(a.equals(b));
        System.out.println(a == b);


    }

}
