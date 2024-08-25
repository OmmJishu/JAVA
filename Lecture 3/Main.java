import java.util.*;

class Info{
    int a = 10;
    static int b = 15;

    void show1(){
        System.out.println("Show1() is not Static");
    }

    static void show2(){
        System.out.println("Show2() is Static");
    }
}

public class Main{
    public static void main(String []args){
        System.out.println(Info.b);
        Info.show2();

        Info obj = new Info();
        System.out.println(obj.a);

        obj.show1();
    }
}