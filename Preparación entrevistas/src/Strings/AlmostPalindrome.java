package Strings;

//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
public class AlmostPalindrome {

    public static boolean isAlmostPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return validSubPalindrome(s,left+1,right) || validSubPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;

    }

    public static boolean validSubPalindrome(String s, int left, int right)
    {
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAlmostPalindrome("enveorysiwkzbfngqeijeynzlfuivzsbjgwrpgcawikmvsbtmxhokubhrahzpougclcfzmmwklgxfyeovygfjwdygkevohzujhztzxyfpfajlvublakbkcwfrboxrzawwmfbnxaojiwjfiwmfsjumqitxneuagjkcasiffnbidfsmfeszbjyqwlenvrepixswlsqkablzataibfoxtooerdikycftzemaoesyjjngvczuhycyydufiedzhqslekqcvcriyqpghpazmxubtekiirixiiaaumscgoxcnolmsglnxfkpzaiiwbbymaukjofbuqcluysnworqxoxabmtbnounhwfzpicimbyiuotiklhyhavdkupsgvcywzlnorvpttfoiqzrwdnbtzwbxsowcasrpifzcgtfqvxxattcgcfogpmdymzpkmeyrxodixqbvjvvbrsftcffzimetikzgmzuadutalxkuzurnnqvrkjgxxkxigmojmrzotafxhpxffblrwwqzcgqqajncmnppucaasqcwlmaxjnwmwvhlrfqbshbnaampcnrrzbiincadsicvwivbelacwqpvkkrvkukunweffgcwieiiqvuxtzbccikemybtlpnckceqdnyghfuwkkaigprxzbgqvbhwibbzabpkpnbkimowbbbfcipdnwbjuockoxshafnbaflqsulpivltcatubkgfrbryzkeixiyjrmxjkivhvozucocpcshoxpajzeftxmbtbufyzyosvrjsodktjwclrhsyywyqiywojcbazcfozhyuyqudptkdtjqfsgcdhzghnlcfroubmpclsdcuuaeazlpgoanunnxrsvbnqzfdgoasxljsnxmpqhsegatrvfwgncdzdgvibicjbhnprihrvxfakdegoexfhvnxqhhpnjmcvbatrllupsyijamavydakqknftfsjorrtgkykbkmgcrerwwgzolbxdtcpthkx"));
    }



    /*
    public boolean validPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                String sLeft = s.substring(start, end);
                String sRight = s.substring(start + 1, end + 1);
                return validSubPalindrome(sLeft) || validSubPalindrome(sRight);
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean validSubPalindrome(String s)
    {
        int left = 0;
        int right = s.length()-1;
        if(right+1 <= 1) {return true;
        }
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
    



     */
}
