package constructs.conditional;

public class vowel_or_consonant {
    public static void main(String[] args) {
        char input_character = 'b';

        switch (input_character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(input_character + " is a vowel.");
                break;
            
            default:
                int ascii_val = (int) input_character;

                if ((ascii_val >= 65 && ascii_val <= 90) || (ascii_val >= 97 && ascii_val <= 122)) {
                    System.out.println(input_character + " is a consonant");
                } else {
                    System.out.println(input_character + " is not an alphabet.");
                }
        }
    }
}
