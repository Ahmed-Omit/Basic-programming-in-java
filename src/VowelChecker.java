import java.util.*;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = s.next().charAt(0);

        switch (Character.toLowerCase(ch))
        {
            case 'a':
                //System.out.print(ch + " is  a vowel.");
                //break;
            case 'e':
                //System.out.println(ch + " is  a vowel.");
                //break;
            case 'i':
                //System.out.println(ch +" is a vowel");
               // break;
            case 'o':
                //System.out.println( ch + " is a Vowel");
                //break;
            case 'u':
               // System.out.print( ch +"is a Vowel");
                //break;
                System.out.println(ch + " is  a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
                break;
        }
    }
}
