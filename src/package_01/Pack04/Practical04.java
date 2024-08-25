// Exception Handling 
// 5 Keywords :  try,   catch,    finally,    throw,    throws

/*
Exception Handling  done in three Stages

Stage 1 : Predict the code that may create problem at runtime
Stage 2 : Put the code in try block
Stage 3 : Supply the alternate catch block
*/ 


import javax.swing.JOptionPane;

public class Practical04 {

    public static void main(String[] args) {
        System.out.println("Program Started");

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num1 : "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num2 : "));
        
        System.out.println("All Input Data Received");
        System.out.println("Calculation Started");

        try{
            int res = num1/num2;
            System.out.println("Calculation Completed Successfully");
            System.out.println("Result = " + res);
            return;
        }
        catch(Exception e){
            System.out.println("Some Exception. Contact Admin." + e.getMessage());
            // return; // It will terminate the main() method
        }
        finally{ // This Block Always Runs ALWAYS
            System.out.println("This is finally block.");
        }

        System.out.println("Program Completed till end Successfully");
    }
}