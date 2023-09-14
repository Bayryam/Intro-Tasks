package CenterOfGravity;

public class ArrayManipulator
{
    public static int findLeftSum(int[] array, int index)
    {
        int sum = 0;
        for (int i = 0;i<index;i++)
            sum+=array[i];

        return sum;
    }

    public static int findRightSum(int[] array, int index)
    {
        int sum = 0;
        for (int i = index+1;i<array.length;i++)
            sum+=array[i];

        return sum;
    }

    public static int findCenterOfGravity(int[] array)
    {
        if (array == null || array.length == 0)
            return -1;
        int currentMinDiff = Integer.MAX_VALUE;
        int centerOfGravity = 0;
        for (int i = 0; i<array.length;i++)
        {
            int diff = Math.abs(findLeftSum(array,i) - findRightSum(array,i));
            if (currentMinDiff > diff){
                currentMinDiff = diff;
                centerOfGravity = i;
            }
        }
        return centerOfGravity;
    }

}
