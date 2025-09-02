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
    public static void main(String[] args) {
        String s = "abcax";
        System.out.println(remove_A_Occurrence(s, 0));
        System.out.println(remove_A_using_substring(s));

    }
}
