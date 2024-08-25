import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

class CurrentDateTimeDemo1 {
    public void display() {
        Date date = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);

        String strTime = gc.get(Calendar.HOUR) + " : " + gc.get(Calendar.MINUTE) + " : " + gc.get(Calendar.SECOND);

        String strDate = gc.get(Calendar.DATE) + " - " + (gc.get(Calendar.MONTH) + 1) + " - " + gc.get(Calendar.YEAR);

        String strStatus = strTime + "\t" + strDate;

        System.out.println("\r" + strStatus);
    }
}

public class TestShow01 {
    public static void main(String[] args) throws Exception{
        CurrentDateTimeDemo1 obj = new CurrentDateTimeDemo1();

        while(true){
            obj.display();
            Thread.sleep(1000);
        }
    }
}