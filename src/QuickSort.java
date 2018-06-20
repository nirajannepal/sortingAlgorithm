public class QuickSort {
    public void sort(int[] mainArray) {
        int pivot = mainArray.length-1;
        sort(mainArray,0,pivot);
    }

    private void sort(int[] mainArray, int lo, int hi) {
        if(hi<=lo) return;
        int mid = partition(mainArray,0,hi);
        sort(mainArray,lo,mid-1);
        sort(mainArray,mid+1,hi);
    }

    private int partition(int[] mainArray, int start, int pivot) {
        int j = start;
        for(int i = start; i<=pivot-1;i++ ){
            if(mainArray[i]<=mainArray[pivot]){
                swap(mainArray,i,j);
                j++;
            }
        }
        swap(mainArray,j,pivot);
        return j;
    }

    private void swap(int[] mainArray, int i, int j) {
        int a = mainArray[i];
        mainArray[i]=mainArray[j];
        mainArray[j]=a;
    }
}
