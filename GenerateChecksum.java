import java.util.Scanner;
import java.lang.Math;

public class GenerateChecksum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String hex = "";
        while (hex.length() == 0 || hex.length()%2 == 1) {
            System.out.print("Input a hex number (even): ");
            hex = console.nextLine();
            if (hex.length()%2 == 1) System.out.println("ERROR - The value was not even, please enter another value...");
        }

        System.out.println("Decimal conversion: "+hexToDec(hex));

        console.close();
    }

    private static String decToHex(int val) {
        return "";
    }

    private static int hexToDec(String val) {
        int output = 0;
        for (int iter = 0 ; iter < val.length(); iter++) {
            System.out.println(val.charAt(iter));
            switch (val.charAt(iter)) {
                case '0':
                    break;
                case '1':
                    output += Math.pow(16, iter);
                    break;
                case '2':
                    output += 2 * Math.pow(16, iter);
                    break;
                case '3':
                    output += 3 * Math.pow(16, iter);
                    break;
                default:
                    break;
            }
            System.out.println(output);
        }
        return output;
    }
}