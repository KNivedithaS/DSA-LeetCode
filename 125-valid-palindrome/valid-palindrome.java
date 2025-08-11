class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z')||(ch[i] >= 'A' && ch[i] <= 'Z')||(ch[i] >= '0' && ch[i] <= '9')) {
                str.append(Character.toLowerCase(ch[i]));
            }
        }

        String n = str.toString();
        String rev = str.reverse().toString();

        return n.equals(rev);
    }
}
