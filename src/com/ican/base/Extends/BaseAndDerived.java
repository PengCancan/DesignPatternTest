package com.ican.base.Extends;

/**
 * Created by flingcoder
 * Date:4/12/2016
 * Description: tellName();//子类重写了此方法，所以父类初始化执行到此方法时候其实是调用子类对象的方法，此时子类i，j还未初始化
 */
public class BaseAndDerived extends Base{
    private String name = "lisi";
    private int i = 111,j=222;
    private static String n = "nnn";
    public BaseAndDerived(){
        this(1);
        this.i = 1111;
        this.j = 2222;
        tellName();
        printName();
        tell();
    }
    public BaseAndDerived(int a){}
    public static void tell(){
        System.out.println("====");
    }
    static {
        System.out.println("sub ====");
    }
    public void tellName(){
        System.out.println("sub tell name = " + name + "  i= " + i);
    }

    public void printName(){
        System.out.println("sub print name = " + name +"   i= " + j);
    }
    public static void main(String[] args) {
        BaseAndDerived bad = new BaseAndDerived();
//        System.out.println(bad.s);
//        System.out.println(n);
//        System.out.println(new BaseAndDerived().j);
    }
}

class Base{
    private String name = "zhangsan";
    private int i=1,j=2;
    protected String s = "abc";
    public Base(){
        this.i = 11;
        this.j = 22;
        tellName();//子类重写了此方法，所以父类初始化执行到此方法时候其实是调用子类对象的方法，此时子类i，j还未初始化
        printName();
    }

    {
        System.out.println("nonstatic block");
    }

    static{
        System.out.println("static block");
    }
    public void tellName(){
        System.out.println("base tell name = " + name + i);
    }

    public void printName(){
        System.out.println("base print name = " + name + j);
    }
}
class A{
    protected  int a(){
        return 32;
    }
}
class B extends A{
//    public int a(){return 0;}
    protected int a(int a){return 0;}
}

