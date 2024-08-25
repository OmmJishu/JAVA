// Learn Inter thread communication

class ShowDigits extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}

class ShowChars implements Runnable{    
    public void run(){
        char ch = 'A';     
        while(ch <='J'){
            System.out.println(ch);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            ch++;
        }
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("Main thread startted");

        ShowDigits obj = new ShowDigits();
        obj.start();

        ShowChars obj1 = new ShowChars();
        Thread t = new Thread(obj1);
        t.start();

        System.out.println("Program ended");
    }
}