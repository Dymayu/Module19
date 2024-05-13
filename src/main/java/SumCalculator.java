public class SumCalculator {

    public int sum(int n) {

        int result = 0;
        if (n != 0) {
            for (int i = 0; i <= n; i++) {
                result += i;
            }
        }else {
            throw new IllegalArgumentException("Zero is unexpected argument! Please try again");
        }

        return result;
    }
}
