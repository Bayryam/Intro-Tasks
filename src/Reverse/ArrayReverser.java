package Reverse;

public class ArrayReverser {
    public static int[] reverseArray(int[] array) {
        if (array == null)
            return null;
        int mid = array.length / 2;
        for (int i = 0; i < mid; i++) {
            swap(array,i, array.length-i-1);
        }
        return array;
    }

    public static void swap(int[] array, int firstIndex, int secondIndex)
    {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
