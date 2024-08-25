import java.util.*;

class Code{
    int num;
    void show(){
        System.out.println("Value of Num = " + num);
    }
}

public class Main{
    public static void main(String []args){
        Code ptr1 = new Code();
        Code ptr2;
        ptr2 = ptr1;
        ptr1.num = 50;
        ptr2.num++;

        System.out.println("value = " + ptr1.num);

        System.out.println("------------------------");
        
        Code ptr3 = new Code();

        ptr3.show();
        ptr3.num = 35;
        ptr3.show();

        System.out.println("************************");
        
        ptr1.show();
    }
}