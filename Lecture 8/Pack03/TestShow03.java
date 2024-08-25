/*

In a Program there iss a Main thread and it generates
multiple child thread (Branch thread)

As many as we create multiple thread it generates multiple 
stacks from which programs runs eg : main stack, thread1 stack, etc

  |    |     |    |
  |    |     |    |
  |    |     |    |
  |____|     |____|
thread1      thread2

  Start keyword is only in JAVA that load parallel to main


*/

public class TestShow03 {
    public static void main(String[] args) throws Exception{
        int count = 1;

        while(count <= 10){
            System.out.println("count = "+ count);
            Thread.sleep(1000);
            count++;
        }

        char ch = 'A';
        while(ch <='J') {
            System.out.println("alphabet = " + ch);
            Thread.sleep(1000);
            ch++;
        }
        System.out.println("Program over...");
    }
}