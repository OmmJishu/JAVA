import javax.swing.JOptionPane;

public class Main {
    void calc(int a, int b) throws Exception{
        System.out.println("Calculation Started");

        int res = a/b;
        System.out.println("Calculation completed Successfully");
        System.err.println("Result = " + res);
    }

    public static void main(String[] args) {
        System.out.println("Program Started");
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num1 : "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num2 : "));
        
        System.out.println("All Input Data Received");
        System.out.println("Calculation Started");

        Main obj = new Main();

        try{
            obj.calc(num1, num2);
        }
        catch(Exception e){
            System.out.println("Error Occured! Contact Admin.");
        }

        System.out.println("Program Reached to End");
    }
}
