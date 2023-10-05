package validPalindrome;

public class Palindrome {
        public boolean isPalindrome(String s) {
            // remove non-alphanumeric characters from string:
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            // use two pointers to compare:
            int left = 0;
            int right = s.length()-1;
            while (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                    return false;
                left++;
                right--;
            }
            return true;
        }
    public static void main(String[] args) {
            Palindrome pal = new Palindrome();
            String s = "A man, a plan, a canal: Panama";
            System.out.println(pal.isPalindrome(s));

    }
}

