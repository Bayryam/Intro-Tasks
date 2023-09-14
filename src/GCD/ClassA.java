package GCD;

public class ClassA
{
    public static int findGCD(int firstNumber, int secondNumber)
    {
        if (firstNumber == 0)
            return secondNumber;
        while(secondNumber != 0)
        {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
}
