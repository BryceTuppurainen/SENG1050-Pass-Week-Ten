import java.util.Scanner;
import java.lang.Math;

public class GenerateChecksum {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);

        System.out.print("Input a hex number $ ");
        String hexIn = con.nextLine().toUpperCase();

        System.out.print("Checksum for "+hexIn+" is equal to (DEC) "+(256 - hexToDec(hexIn)));
        
        con.close();
    }

    private static String decToHex(int decVal) {
        String dec = String.valueOf(decVal);
        int output = 0;
        for (int iter = 0; iter < dec.length(); iter++) {
            switch (dec.charAt(dec.length()-1-iter)) {
                case '1':
                    output += 1 * Math.pow(16, iter);
                    break;
                case '2':
                    output += 2 * Math.pow(16, iter);
                    break;
                case '3':
                    output += 3 * Math.pow(16, iter);
                    break;
                case '4':
                    output += 4 * Math.pow(16, iter);
                    break;
                case '5':
                    output += 5 * Math.pow(16, iter);
                    break;
                case '6':
                    output += 6 * Math.pow(16, iter);
                    break;
                case '7':
                    output += 7 * Math.pow(16, iter);
                    break;
                case '8':
                    output += 8 * Math.pow(16, iter);
                    break;
                case '9':
                    output += 9 * Math.pow(16, iter);
                    break;
                case 'A':
                    output += 10 * Math.pow(16, iter);
                    break;
                case 'B':
                    output += 11 * Math.pow(16, iter);
                    break;
                case 'C':
                    output += 12 * Math.pow(16, iter);
                    break;
                case 'D':
                    output += 13 * Math.pow(16, iter);
                    break;
                case 'E':
                    output += 14 * Math.pow(16, iter);
                    break;
                case 'F':
                    output += 15 * Math.pow(16, iter);
                    break;
                default:
                    break;
            }
        }
        return output;
    }

    private static int hexToDec(String hex) {
        int output = 0;
        for (int iter = 0; iter < hex.length(); iter++) {
            switch (hex.charAt(hex.length()-1-iter)) {
                case '1':
                    output += 1 * Math.pow(16, iter);
                    break;
                case '2':
                    output += 2 * Math.pow(16, iter);
                    break;
                case '3':
                    output += 3 * Math.pow(16, iter);
                    break;
                case '4':
                    output += 4 * Math.pow(16, iter);
                    break;
                case '5':
                    output += 5 * Math.pow(16, iter);
                    break;
                case '6':
                    output += 6 * Math.pow(16, iter);
                    break;
                case '7':
                    output += 7 * Math.pow(16, iter);
                    break;
                case '8':
                    output += 8 * Math.pow(16, iter);
                    break;
                case '9':
                    output += 9 * Math.pow(16, iter);
                    break;
                case 'A':
                    output += 10 * Math.pow(16, iter);
                    break;
                case 'B':
                    output += 11 * Math.pow(16, iter);
                    break;
                case 'C':
                    output += 12 * Math.pow(16, iter);
                    break;
                case 'D':
                    output += 13 * Math.pow(16, iter);
                    break;
                case 'E':
                    output += 14 * Math.pow(16, iter);
                    break;
                case 'F':
                    output += 15 * Math.pow(16, iter);
                    break;
                default:
                    break;
            }
        }
        return output;
    }
}