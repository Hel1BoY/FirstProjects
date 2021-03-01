import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Palindromed {
    ////// transform String abc --> cba
    public static void mainn(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter string: ");
        String getString = reader.nextLine();
        String transformed = "";
        for(int i = getString.length()-1; i >= 0; i--){
           transformed += getString.charAt(i);
        }
        System.out.println("Transformed string: " + transformed);
    }
//////////check palindrome
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter string: ");
        String getString = reader.nextLine();
        String inversed = "";
        int first = 0;
        for(int i = getString.length()-1 ; i >= 0; i--){
            inversed += getString.charAt(i);
        }
        if(getString.equals(inversed)){
            System.out.println("The string is palindrome!");
        }else{
            System.out.println("The string is not palindrome!");
        }
    }


}