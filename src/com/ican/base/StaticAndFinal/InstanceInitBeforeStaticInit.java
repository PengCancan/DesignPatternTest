package com.ican.base.StaticAndFinal;

/**
 * Created by flingcoder
 * Date:4/15/2016
 * Description:静态初始化完成之前可以进行实例初始化。实例初始化先初始化类的成员变量，类的非静态初始化块(若类的非静态初始化块在成员变量初始化之前引用了该成员变量则该成员变量为默认值0)，构造方法。
 * 所以当 static InstanceInitBeforeStaticInit ibs = new InstanceInitBeforeStaticInit();执行的时候，a有值，b无值，因为静态初始化还没完成所以
 * b的值还未初始化，但是实例初始化已经完毕。相当于将实例初始化嵌入到静态初始化之中运行。
 */
public class InstanceInitBeforeStaticInit {
    public static void main(String[] args) {
//        new InstanceInitBeforeStaticInit();
        fun();

    }

    public InstanceInitBeforeStaticInit(){
        System.out.println("constructor is running");
        System.out.println("a= "+a + "," +"b= " + b);
    }
    static InstanceInitBeforeStaticInit ibs = new InstanceInitBeforeStaticInit();
    static{
        System.out.println("static block");
    }
    int a = 11;
    {
        System.out.println(a);
    }
    Object o = new Object();

    {
        fun1();
        System.out.println("nonstatic block " + "b= " + b);
    }
    private static void fun() {

        System.out.println("fun static");
        System.out.println("b= " + b);
    }

    private void fun1(){
        System.out.println(o.toString());
    }
//    int a = 11;
    static int b = 22;
}
