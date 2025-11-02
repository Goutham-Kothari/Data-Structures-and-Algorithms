public class FindSubstr {
    public static void findSubstr(String str, String ans, int i) {
        // Basecase
        if (i == str.length()) {
            System.err.println(ans);
            return;
        }
        // Recursion
        // yes choice
        findSubstr(str, ans+str.charAt(i), i+1);
        // no choice
        findSubstr(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubstr(str, "", 0);
    }
}
