package SummingLargeNumbers;

public class LargeNumbersClass {
    public static String sumNumbers(String firstNumber, String secondNumber) {

        if (firstNumber == null || secondNumber == null)
            return null;
        StringBuilder result = new StringBuilder();

        int firstNumberIter = firstNumber.length() - 1;
        int secondNumberIter = secondNumber.length() - 1;

        int oneInMind = 0;
        while (firstNumberIter >= 0 && secondNumberIter >= 0)
        {
         int res = getDigitFromChar(firstNumber.charAt(firstNumberIter))
                 + getDigitFromChar(secondNumber.charAt(secondNumberIter))+oneInMind;
         oneInMind = res/10;
         result.append(res%10);

         firstNumberIter--;
         secondNumberIter--;
        }

        while(firstNumberIter>=0)
        {
            int res = getDigitFromChar(firstNumber.charAt(firstNumberIter)) +oneInMind;
            oneInMind = res/10;
            result.append(res%10);
            firstNumberIter--;
        }
        while(secondNumberIter>=0)
        {
            int res = getDigitFromChar(secondNumber.charAt(secondNumberIter)) +oneInMind;
            oneInMind = res/10;
            result.append(res%10);
            secondNumberIter--;
        }

        if (oneInMind == 1)
            result.append(1);

        return result.reverse().toString();
    }

    public static int getDigitFromChar(char symbol) {
        return symbol - '0';
    }
}
