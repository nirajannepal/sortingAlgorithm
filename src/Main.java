public class Main {

    public static void main(String[] args) {

        int[] mainArray = {2, 7, 1, 6, 8, 5, 3, 4};
        printArray(mainArray);
        System.out.println();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        //mergeSort.mergeSort(mainArray);
        // quickSort.sort(mainArray);
        printArray(mainArray);

    }

    private static void printArray(int[] sample) {
        for (int i = 0; i < sample.length; i++) {
            System.out.print(sample[i]);
        }
    }

}
