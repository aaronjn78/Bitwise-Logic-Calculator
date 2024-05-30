import java.util.Scanner;

public class App {

    // design a system that takes a system of binary inputs
    // and outputs their logical AND, OR, and XOR results

    public static void main(String[] args) throws Exception {

        String userInput;
        String[] binary1;
        String[] binary2;
        String number1 = "";
        String number2 = "";
        Integer ANDresult;
        Integer ORresult;
        Integer XORresult;
        Scanner s = new Scanner(System.in);

        //loops to request user for binary numbers. Passes user entry to a method as an array
        //to check each character to see if it's a 1 or 0
        do {
            System.out.println("Enter first binary number");
            userInput = s.nextLine();
            binary1 = userInput.split("");
        } while (!BinaryNumberCheck(binary1));


        do {
            System.out.println("Enter second binary number");
            userInput = s.nextLine();
            binary2 = userInput.split("");
        } while (!BinaryNumberCheck(binary2));

        s.close();


        //take the array of strings and put it into a single string for each number.
        //probably a more efficient way to process user input, checking for validity and then
        //converting to numeric value for calculation but unsure what it is right now
        for (String i : binary1) {
            number1 = number1 + i;
        }

        for (String i : binary2) {
            number2 = number2 + i;
        }

        ANDresult = CalcBitAND(number1, number2);
        ORresult = CalcBitOR(number1, number2);
        XORresult = CalcBitXOR(number1,number2);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println("----------------");
        System.out.println(ANDresult + " AND");
        System.out.println(ORresult + " OR");
        System.out.println(XORresult + " XOR");


    }

    public static Boolean BinaryNumberCheck(String[] input) {

        boolean valid = false;
        for (String x : input) {

            if ((x.equals("1")) || (x.equals("0"))) {
                valid = true;
            } else {
                valid = false;
                System.out.println("The value entered is not a valid binary number.");
                return valid;
            }
        }
        return valid;
    }

    public static Integer CalcBitAND(String number1, String number2) {

        int binary1  = Integer.parseInt(number1);
        int binary2 = Integer.parseInt(number2);
        int result;

        result = binary1 & binary2;

        return result;

    }

    public static Integer CalcBitOR(String number1, String number2) {

        int binary1  = Integer.parseInt(number1);
        int binary2 = Integer.parseInt(number2);
        int result;

        result = binary1|binary2;

        return result;

    }

    public static Integer CalcBitXOR(String number1, String number2) {

        int binary1  = Integer.parseInt(number1);
        int binary2 = Integer.parseInt(number2);
        int result;

        result = binary1 ^ binary2;

        return result;

    }
}