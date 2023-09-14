package ArrayProcessing;

public class ArrayProcessor {
    public static int getMinElementIndex(int[] array) {
        if (array == null)
            return -1;
        int arrLength = array.length;
        int minElement = Integer.MAX_VALUE;
        int minElementIndex = -1;
        for (int i = 0; i < arrLength; i++) {
            if (array[i] < minElement) {
                minElementIndex = i;
                minElement = array[i];
            }
        }
        return minElementIndex;
    }

    public static int getSum(int[] array) {
        if (array == null)
            return 0;

        int arrLength = array.length;
        int sum = 0;

        for (int i = 0; i < arrLength; i++)
            sum += array[i];

        return sum;

    }

    public static String convertToString(int[] array) {
        if (array == null)
            return "[ ]";

        int arrLength = array.length;
        StringBuilder result = new StringBuilder();
        result.append("[ ");

        for (int i = 0; i < arrLength; i++) {
            result.append(array[i]);
            result.append(' ');
        }
        result.append(']');
        return result.toString();


    }
}
