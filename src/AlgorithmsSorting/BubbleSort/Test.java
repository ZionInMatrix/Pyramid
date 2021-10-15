package AlgorithmsSorting.BubbleSort;

public class Test {
    public static void main(String[] args) {

        int[] intArray = {12, 1, -20, -12, 30, 4};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int j : intArray) {
            System.out.println(j);

        }
    }

    public static void swap(int[] intArray, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
