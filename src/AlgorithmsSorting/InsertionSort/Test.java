package AlgorithmsSorting.InsertionSort;

public class Test {
    public static void main(String[] args) {

        int[] intArray = {12, 1, -20, -12, 30, 4};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int j : intArray) {
            System.out.println(j);
        }

    }

}
