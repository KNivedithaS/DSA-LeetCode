class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {

            int digit = columnNumber % 26;

            if (digit == 0) {
                digit = 26;
                columnNumber -= 26;
            }

            char ch = (char) ('A' - 1 + digit);
            sb.insert(0, ch);

            columnNumber /= 26;
        }

        return sb.toString();
    }
}