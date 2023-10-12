package practice;
import java.util.HashMap;
import java.util.*;
public class Roman {
    public static void main(String[] args) {
       
    	Scanner sc=new Scanner(System.in);
     
        System.out.println("enter the roman number ");
        String romanNumeral = sc.next();
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        

        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i > 0 && romanMap.get(romanNumeral.charAt(i)) > romanMap.get(romanNumeral.charAt(i - 1))) {
                result += romanMap.get(romanNumeral.charAt(i)) - 2 * romanMap.get(romanNumeral.charAt(i - 1));
            } else {
                result += romanMap.get(romanNumeral.charAt(i));
            }
        }
        System.out.println("Roman number  " + romanNumeral + " converted to integer: " + result);
    }
}
