// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {

    public static String sumNumbers(String firstNumber, String secondNumber) {

        StringBuilder result = new StringBuilder();
        //int biggerLength = Math.max(firstNumber.length(), secondNumber.length());

        int firstNumberIter = firstNumber.length() - 1;
        int secondNumberIter = secondNumber.length() - 1;

        int oneInMind = 0;
        while (firstNumberIter >= 0 && secondNumberIter >= 0) {
            int res = getDigitFromChar(firstNumber.charAt(firstNumberIter))
                    + getDigitFromChar(secondNumber.charAt(secondNumberIter)) + oneInMind;
            oneInMind = res / 10;
            result.append(res % 10);

            firstNumberIter--;
            secondNumberIter--;
        }

        while (firstNumberIter >= 0) {
            int res = getDigitFromChar(firstNumber.charAt(firstNumberIter)) + oneInMind;
            oneInMind = res / 10;
            result.append(res % 10);
            firstNumberIter--;
        }
        while (secondNumberIter >= 0) {
            int res = getDigitFromChar(secondNumber.charAt(secondNumberIter)) + oneInMind;
            oneInMind = res / 10;
            result.append(res % 10);
            secondNumberIter--;
        }

        if (oneInMind == 1)
            result.append(1);

        return result.reverse().toString();
    }



    public static int getDigitFromChar(char symbol) {
        return symbol - '0';
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("999", "2342342334"));

    }
}