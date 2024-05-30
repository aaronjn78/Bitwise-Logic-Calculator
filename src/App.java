import java.util.Scanner;
import java.lang.NumberFormatException;

public class App {

    // design a system that takes a system of binary inputs
    // and outputs their logical AND, OR, and XOR results

    public static void main(String[] args) throws Exception {

        String userInput;
        String[] binary1;
        String[] binary2;
        String ANDresult;
        String ORresult;
        String XORresult;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first binary number");
        userInput = s.nextLine();
        binary1 = userInput.split("");
        

        if (BinaryNumberCheck(binary1)) {
            System.out.println("valid number");
            } else {
        System.out.println("invalid number");
        }
       
    }

    public static Boolean BinaryNumberCheck(String[] input) {

        boolean valid = false;
        for (String x : input) {

            if ((x.equals("1")) || (x.equals("0")))
            {      
                valid = true;
            } else {
                valid = false;
                return valid;
            }
        }

        return valid;
        
    }


}
