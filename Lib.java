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

    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;                 // A(m,n) = n + 1 se m = 0
        if (n == 0) return ackermann(m - 1, 1); // A(m,n) = A(m-1, 1) se m != 0 e n = 0
        return ackermann(m-1, ackermann(m, n-1)); // A(m,n) = A(m-1, A(m,n-1)) se m != 0 e n != 0
    }

    public static int sumArray (int[] arr) {
        return somatorio(arr, 0);
    }

    private static int somatorio (int[] arr, int i) {
        if (i >= arr.length) return 0;
        return arr[i] + somatorio (arr, i+1);
    }

    public static int multArray (int[] arr) {
        return multiplicatorio(arr, 0);
    }

    private static int multiplicatorio (int[] arr, int i) {
        if (i >= arr.length) return 1;
        return arr[i] * multiplicatorio(arr, i+1);
    }
}