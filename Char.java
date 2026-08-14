class Solution {
    public void findchar(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }
}

public class Char {
    public static void main(String[] args) {
        Solution o = new Solution();
        String s = "hello";
        o.findchar(s);
    }
}