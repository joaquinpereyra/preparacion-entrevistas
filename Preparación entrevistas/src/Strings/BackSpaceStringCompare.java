package Strings;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.
Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 * 
 */
public class BackSpaceStringCompare {

    private static String obtainFilteredString(String str)
    {
        Stack strfiltered = new Stack<String>(); 
        for (char c : str.toCharArray()) {
            if (c != '#') {
                strfiltered.push(""+c);
            } else {
                if(!strfiltered.isEmpty())
                {
                    strfiltered.pop();
                }
            }
        }
        return strfiltered.toString();
    }
    public static boolean BackSpaceStringCompare() {
        String s = "a##c";
        String t = "#a#c";
        String sFiltered = obtainFilteredString(s);
        String tFiltered = obtainFilteredString(t);
        if(sFiltered.length() != tFiltered.length())
        {
            return false;
        }
        else
        {
            return sFiltered.equals(tFiltered);
        }
        

    }

    public static boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (S.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(backspaceCompare("a##c","#a#c")); // O(N+M) S(1)
        System.out.println(BackSpaceStringCompare());// O(N+M)  S(N+M)
    }

}
