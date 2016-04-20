package com.ican.base.ClassLoaderTest;

/**
 * Created by flingcoder
 * Date:4/15/2016
 * Description:
 * System.out.println(SubClass.i);//使用子类访问父类中的静态成员变量的时候，只会触发父类的初始化，子类不会初始化。
 */
public class NotInit
{
    public static void main(String[] args)
    {
//        System.out.println(SubClass.i);//使用子类访问父类中的静态成员变量的时候，只会触发父类的初始化，子类不会初始化。
        System.out.println(SubClass.a);
//        new SubClass();
    }
}
class SSClass
{
    static int i = 9;
    static
    {
        System.out.println("SSClass");
    }
}
class SuperClass extends SSClass
{
    static
    {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;

    public SuperClass()
    {
        System.out.println("init SuperClass");
    }
}
class SubClass extends SuperClass
{
    static
    {
        System.out.println("SubClass init");
    }

    static int a = 11;

    public SubClass()
    {
        System.out.println("init SubClass");
    }
}
