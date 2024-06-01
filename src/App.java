import java.util.Scanner;

public class App {

    // design a system that takes a system of binary inputs
    // and outputs their logical AND, OR, and XOR results

    public static void main(String[] args) throws Exception {

        String strUserInput;
        String[] arrBinary1;
        String[] arrBinary2;
        String strNumber1 = "";
        String strNumber2 = "";
        String strANDresult;
        String strORresult;
        String strXORresult;
        int length;
        Scanner s = new Scanner(System.in);

        //loops to request user for binary numbers. Passes user entry to a method as an array
        //to check each character to see if it's a 1 or 0
        do {
            System.out.println("Enter first binary number");
            strUserInput = s.nextLine();
            arrBinary1 = strUserInput.split("");
        } while (!BinaryNumberCheck(arrBinary1));


        do {
            System.out.println("Enter second binary number");
            strUserInput = s.nextLine();
            arrBinary2 = strUserInput.split("");
        } while (!BinaryNumberCheck(arrBinary2));

        s.close();


        //find the length of the longest binary number entered and store value
        //if one entry is shorter than the other pad the shorter entry with leading zeros

        //first number longer
        if (arrBinary1.length > arrBinary2.length){
            length = arrBinary1.length;
            String[] temp = arrBinary2;
            arrBinary2 = new String[length];
            int i = temp.length - 1;
            int j = arrBinary2.length - 1;

            //work backwards through each array adding from old to new
            //putting 0's at start of new array

            while (j > -1) {
                while (i > -1) {
                    arrBinary2[j] = temp[i];
                    j--;
                    i--;
                }
            
                arrBinary2[j] = "0";
                j--;
            }
        }

        //second number longer
        if (arrBinary2.length > arrBinary1.length){
            length = arrBinary2.length;
            String[] temp = arrBinary1;
            arrBinary1 = new String[length];
            int i = temp.length - 1;
            int j = arrBinary1.length - 1;

            //work backwards through each array adding from old to new
            //putting 0's at start of new array

            while (j > -1) {
                while (i > -1) {
                    arrBinary1[j] = temp[i];
                    j--;
                    i--;
                }
            
                arrBinary1[j] = "0";
                j--;
            }
        }
        else length = arrBinary1.length;
        

        //take the array of strings and put it into a single string for each number for output
        for (String i : arrBinary1) {
            strNumber1 = strNumber1 + i;
        }

        for (String i : arrBinary2) {
            strNumber2 = strNumber2 + i;
        }

    

        strANDresult = CalcBitAND(arrBinary1, arrBinary2);
        strORresult = CalcBitOR(arrBinary1, arrBinary2);
        strXORresult = CalcBitXOR(arrBinary1,arrBinary2);



 
        //display results of bitwise calculation of the two binary numbers entered
        //format each result with leading zeros to match the length of the longest 
        //number entered
        System.out.println();
        System.out.println(strNumber1);
        System.out.println(strNumber2);
        System.out.println("----------------");
        System.out.println(strANDresult + " AND");
        System.out.println(strORresult + " OR");
        System.out.println(strXORresult + " OR");
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


    public static String CalcBitAND(String[] number1, String[] number2) {

        String result = "";
        
        for (int i = 0; i < number1.length; i++){

            if (number1[i].equals("1") && number2[i].equals("1")){
                result = result + "1";
            }
            else 
                result = result + "0";
        }
        return result;
    }


    public static String CalcBitOR(String[] number1, String[] number2) {

        String result = "";

        for (int i = 0; i < number1.length; i++){

            if (number1[i].equals("0") && number2[i].equals("0")){
                result = result + "0";
            }
            else 
                result = result + "1";
        }

        return result;
    }


    public static String CalcBitXOR(String[] number1, String[] number2) {

        String result = "";

        for (int i = 0; i < number1.length; i++){

            if ((number1[i].equals("1") && number2[i].equals("1")) || (number1[i].equals("0") && number2[i].equals("0"))){
                result = result + "0";
            }
            else 
                result = result + "1";
        }

        return result;
    }
}