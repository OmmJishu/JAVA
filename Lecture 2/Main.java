import java.util.*;

class Data1{
    int a = 5;
    static int b = 7;
}

class Data2{
    static int b = 15;
}

public class Main{
    public static void main(String []args){
        System.out.println(Data1.b);
        Data1 obj = new Data1();
        System.out.println(obj.a);

        System.out.println(Data2.b);
    }
}