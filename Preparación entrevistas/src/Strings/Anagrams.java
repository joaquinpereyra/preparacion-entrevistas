package Strings;

import java.util.Arrays;
import java.util.HashMap;

/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false. */
public class Anagrams {
    public static boolean isAnagram(String a, String b) {
        
        a = a.toUpperCase();
        b = b.toUpperCase();
        if(a.length() != b.length()){return false;}
        HashMap<Character,Integer> countCharsA = new HashMap<>();
        for(int i = 0; i < a.length(); i++)
        {
            char c = a.charAt(i);
            if(countCharsA.get(c) != null)
            {
                int count = countCharsA.get(c);
                count +=1;
                countCharsA.put(c, count);
            }
            else
            {
                countCharsA.put(c,1);
            }
        }
        HashMap<Character,Integer> countCharsB = new HashMap<>();
        for(int i = 0; i < b.length(); i++)
        {
            char c = b.charAt(i);
            if(countCharsB.get(c) != null)
            {
                int count = countCharsB.get(c);
                count +=1;
                countCharsB.put(c, count);
            }
            else
            {
                countCharsB.put(c,1);
            }
        }
        for(Character c: countCharsA.keySet())
        {
            if(countCharsA.get(c) != countCharsB.get(c))
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println( (isAnagram2("madam", "amadm")) ? "Anagrams" : "Not Anagrams" );
        
    }

    public static boolean isAnagram2(String a, String b)
    {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
    }
}
/*Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b); */
