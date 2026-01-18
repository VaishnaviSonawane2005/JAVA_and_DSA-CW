package StringBuilder_and_strings;

public class Compressed_String {
    public static void main(String[] args) {
        String str = "aaabbbbccdee";
        String ans = "" + str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if(curr == prev){
                count++;
            }
            else{
                if(count > 1) {         // if char appears only one time do not append count ( e.g. abb -> ab2 instead of a1b2 )
                    ans += count;
                }
                count = 1;
                ans += curr;
            }
        }
        ans += count;
        System.out.println(ans);
    }
}
