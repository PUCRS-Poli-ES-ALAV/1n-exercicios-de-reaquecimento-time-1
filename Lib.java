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

    
}