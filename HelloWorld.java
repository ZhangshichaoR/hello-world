/**
 * Created by teamo on 2016/8/31.
 */
public class HelloWorld {
    public static void main(String[] args){
        new HelloWorld();
        System.out.println("main");
    }
    public  void  method1(){
    System.out.println("非静态");}
    public  static void  method2(){
        System.out.println("静态");}
    public HelloWorld(){
        method1();
        method2();

    }
}
