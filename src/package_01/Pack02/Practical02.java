class Chintu{
    int num;
    Chintu(){
        int i = 60*60*24*30;
        num = i;
        System.out.println("Default Constructor : num = " + num);
    }

    Chintu(int x){
        num = x;
        System.out.println("Parametrized Constructor : num = " + num);
    }
}

public class Practical02{
    public static void main(String []args){
        Chintu obj1 = new Chintu();
        Chintu obj2 = new Chintu();
        Chintu obj3 = new Chintu(20);

        new Chintu(44);
        Chintu obj4;
    }
}