import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Main {
    static void display() {
        Date date = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);

        String strTime = gc.get(Calendar.HOUR) + " : " + gc.get(Calendar.MINUTE) + " : " + gc.get(Calendar.SECOND);

        String strDate = gc.get(Calendar.DATE) + " - " + (gc.get(Calendar.MONTH) + 1) + " - " + gc.get(Calendar.YEAR);

        String strStatus = strTime + "\t" + strDate;

        System.out.println("\r" + strStatus);
    }

    public static void main(String[] args) {
        for(int i = 1; i<=2; i++){
            System.out.println("\n-----------------------------");
            System.out.println("Start time = ");
            Main.display();
            try{
                Thread.sleep(1000);
                
                System.out.println("\nAfter 1 sec Value of i = " + i);
                Main.display();
                try{
                    Thread.sleep(2000);
                    System.out.println("\nAfter 2 sec Hello");
                    Main.display();
                }
                catch(Exception e){}
            }
            catch(Exception e){}
        }
    }
}
