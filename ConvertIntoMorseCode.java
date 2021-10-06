import java.util.Scanner;

public class ConvertIntoMorseCode {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type a message $ ");
        String message_in_english = console.nextLine().toLowerCase();
        String message_in_morse_code = "";
        for (int iter = 0; iter < message_in_english.length(); iter++) {
            switch (message_in_english.charAt(iter)) {
                case 'a':
                    message_in_morse_code += ".- ";
                    break;
                case 'b':
                    message_in_morse_code += "-... ";
                    break;
                case 'c':
                    message_in_morse_code += "-.-. ";
                    break;
                case 'd':
                    message_in_morse_code += "-.. ";
                    break;
                case 'e':
                    message_in_morse_code += ". ";
                    break;
                default:
                    message_in_morse_code += message_in_english.charAt(iter);
                    break;
            }
        }
        System.out.println(message_in_morse_code);
        console.close();
    }
}