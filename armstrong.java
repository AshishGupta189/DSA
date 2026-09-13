class Solution {

    public boolean isArmstrong(int n) {

        int sum = 0;
        int original = n;

        int size = (int) Math.floor(Math.log10(n)) + 1;

        while (n > 0) {
            int digit = n % 10;

            sum += (int) Math.pow(digit, size);

            n /= 10;
        }

        return sum == original;
    }
}