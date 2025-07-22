public class DecodeWays {
    static int countWays(String digits)
    {
        int n = digits.length();

        if (n == 0 || digits.charAt(0) == '0') {
            return 0;
        }

        int prev1 = 1, prev2 = 0;

        for (int i = 1; i <= n; ++i) {

            int current = 0;

//            one-digit
            if (digits.charAt(i - 1) != '0') {
                current += prev1;
            }

//            two-digit
            if (i > 1) {
                int twoDigit
                        = (digits.charAt(i - 2) - '0') * 10 + (digits.charAt(i - 1) - '0');
                if (twoDigit >= 10 && twoDigit <= 26) {
                    current += prev2;
                }
            }

            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args)
    {
        String digits = "12"; // AB(1 2), L(12)
        String digits1 = "226"; //  "226" ->  "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
        System.out.println(countWays(digits));
        System.out.println(countWays(digits1));
    }
}

//122 -> (1,22) (12,2) (1,2,2)
