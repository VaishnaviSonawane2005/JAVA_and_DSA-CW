package Recursion;

public class Recursion7 {

    // Remove all occurrences of 'a' from string s = "abcax"
    static String remove_A_Occurrence(String s, int idx){
        if(idx == s.length()) return "";
        String smallAns = remove_A_Occurrence(s, idx+1);
        char curr = s.charAt(idx);
        if(curr != 'a'){
            return curr + smallAns;
        }else{
            return smallAns;
        }
    }

    static String remove_A_using_substring(String s){
        if(s.length() == 0) return "";
        String smallAns = remove_A_using_substring(s.substring(1));
        char curr = s.charAt(0);
        if(curr != 'a'){
            return curr + smallAns;
        }else{
            return smallAns;
        }
    }

    static String reverse_String(String s, int idx){
        if(idx == s.length()) return "";
        String SmallAns = reverse_String(s, idx+1);
        return SmallAns + s.charAt(idx);
    }

    static String reverse_usingSubstring(String s){
        if(s.isEmpty()) return "";           // if(s.length() == 0) return "";
        String SmallAns = reverse_usingSubstring(s.substring(1));
        return SmallAns + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "abcax";
        System.out.println(remove_A_Occurrence(s, 0));
        System.out.println(remove_A_using_substring(s));
        System.out.println("Reversed String is: "+ reverse_String(s, 0));
        System.out.println("Reversed String using substring method is: "+ reverse_usingSubstring(s));
    }
}
