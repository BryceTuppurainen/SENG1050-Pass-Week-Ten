import java.util.Scanner;

public class ConvertIntoMorseCode {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        
        System.out.print("Type a message $ ");
        String english = con.nextLine().toLowerCase();
        String morse = "";

        String[] englishCharacters = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] morseCharacters = {".- ", "-... ", "-.-.","-.. ",". ","..-. ","--. ",".... ",".. ",".--- ","-.- ",".-.. ","-- ","-. ","--- ",".--. ","--.- ",".-. ","... ","- ","..- ","...- ",".-- ","-..- ","-.-- ","--.. "};

        for (int iter = 0; iter < english.length(); iter++) {
            int cI = getIndex(englishCharacters, english.substring(iter, iter+1));
            if (cI == -1) morse += english.substring(iter, iter+1);
            else {
                morse += morseCharacters[cI];
            } 
        }

        System.out.println(morse);

        con.close();
    }

    public static int getIndex(String[] arr, String target) {
        for (int iter = 0; iter < arr.length; iter++) {
            if (arr[iter].equals(target)) return iter;
        }
        return -1;
    }
}