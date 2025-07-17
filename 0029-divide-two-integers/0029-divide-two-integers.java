class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if (divisor == 1) {
            return dividend;
        }
        
        if (divisor == -1) {
            return -dividend;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        int quotient = 0;

        while (a >= b) {
            int x = 0;
            while (a >= (b << (x + 1))) {
                x++;
            }
            a -= (b << x);
            quotient += (1 << x);
        }
        
        return negative ? -quotient : quotient;
    }
}
