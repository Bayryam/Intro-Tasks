package GCD;

public class ClassB
{
    public static int findLeastCommonMultiple(int firstNumber,int secondNumber)
    {
        if (firstNumber == 0 && secondNumber == 0)
            return 0;
        return (firstNumber * secondNumber) / ClassA.findGCD(firstNumber,secondNumber);
    }
}
