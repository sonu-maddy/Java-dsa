package sonu.com.stringAndstringBuilderAndBuffer;

public class LargesOddNumberInString {


        public static void main(String[] args) {
            String num = "3442";
            System.out.println(largestOddNumber(num));
        }
        public static String largestOddNumber(String num) {
            for (int i = num.length() - 1; i >= 0; i--) {
                if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                    return num.substring(0, i + 1);
                }
            }

            return "";
        }

}
