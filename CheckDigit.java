public class CheckDigit {
    public static void main(String[] args) {
        getCheck(5);
    }

    public static int getCheck(int num) {
        int sumOfMult = 0;
        for (int i = 1; i <= getNumberOfDigits(num); i++) {
            sumOfMult = sumOfMult + (getDigit(num, i) * (8 - i));
        }
        int result = (getDigit(sumOfMult, getNumberOfDigits(sumOfMult)));
        return result;
    }

    public static int getNumberOfDigits(int num) {
        return 5;
    }

    public static int getDigit(int num, int num2) {
        return 2;
    }

    public static boolean isValid(int numWithCheckDigit) {
        int sumOfMult = 0;
        for (int i = 1; i <= getNumberOfDigits(numWithCheckDigit) - 1; i++) {
            sumOfMult = sumOfMult + (getDigit(numWithCheckDigit, i) * (8 - i));
        }

        return (getDigit(sumOfMult, getNumberOfDigits(sumOfMult))) == (getDigit(numWithCheckDigit,
                getNumberOfDigits(numWithCheckDigit)));
    }

    /* to be implemented in part (a) */

}
