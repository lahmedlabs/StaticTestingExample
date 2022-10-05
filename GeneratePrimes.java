package primeGenerator;

public class GeneratePrimes {
    /**
    * @param MaxValue
    * 소수를 찾아낼 최대값 0이상 100 이하의 값이 입력될 수 있다
    * @exception IllegalArgumentException
     * 0 미만 100 초과의 maxValue 입력
     * */
    public static int minValue = 2;
    private int[] result = new int [0];
    private int previousRequest = 0;

    public int[] generatePrimes (int MaxValue) {
        if (previousRequest == MaxValue)
            return result;
        previousRequest = MaxValue;

        if (MaxValue > minValue) {
            int s = MaxValue + 1;
            boolean f[] = new boolean[s];
            int i, j, k;
            short z;

            for (i = 0; i < s; i++)
                f[i] = true;
            f[0] = f[1] = false;

            for (i = 1; i < Math.sqrt (s) + 1; i++) {
                if (f[i]) {
                    for (j =2 * i; j<s; j+=i)
                        f[j] = false;
                }
            }

            z = (short) (s + 1);
            int count = 0;
            for (i = 0; i < Math.sqrt (s) + 1; i++) {
                    if (f[i])
                        count++;
            }

            int[] primes = new int[count];
            for (i = 0, j = 0; i < Math.sqrt(s) + 1; i++) {
                if (f[i])
                    primes[j++] = i;
            }
            f = null;
            result = primes;
            return result;
        } else if (MaxValue == minValue) {
            result = new int [0];
            return result;
        } else {
            result = new int [0];
            return result;
        }
    }

    @Override
    public boolean equals (Object obj) {
        if (obj instanceof GeneratePrimes) {
                GeneratePrimes instance = (GeneratePrimes) obj;
                return minValue == instance.minValue
                    && result.equals (instance.result)
                    && previousRequest == instance.previousRequest;
        }
        return false;
    }
}