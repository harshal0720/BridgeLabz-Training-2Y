class PalindromeChecker {
    private String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        System.out.println(text + " is Palindrome? " + isPalindrome());
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        p1.displayResult();
        PalindromeChecker p2 = new PalindromeChecker("hello");
        p2.displayResult();
    }
}
