public class Lib {
    public static int multiply (int a, int b) {
        if (b <= 0) return 0;
        return a + multiply (a, b - 1);
    }

    // ta certo isso?
    public static int sum (int a, int b) {
        int first = singleSum(0, a);
        int second = singleSum(0, b);
        return first + second;
    }

    private static int singleSum (int n, int limit) {
        if (limit <= 0) return n;
        n++; limit--;
        return singleSum(n, limit);
    }

    public static float fractionalSum (float n) {
        if (n <= 0) return 0;
        return (1/n) + fractionalSum(n-1);
    }

    public static String invertString (String s) {
        if (s.length() <= 0) return "";
        return s.charAt(s.length() - 1) + (invertString(s.substring(0, s.length()-1)));
    }

    public static int weirdSequence (int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return 2 * (weirdSequence(n-1)+3) * weirdSequence(n-2);
    }

    public static int ackermann(int n, int m) {
        return 0;
    }
}