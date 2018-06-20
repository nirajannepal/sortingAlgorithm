public class MergeSort {

    public void mergeSort(int[] mainArray) {
        int [] auxArray = new int[mainArray.length];

        sort(mainArray,auxArray,0,mainArray.length-1);
    }

    private static void sort(int[] mainArray, int[] auxArray, int lo, int hi) {
        if(lo>=hi) return;

        int mid = lo + ((hi-lo)/2);

        sort(mainArray,auxArray,lo,mid);
        sort(mainArray,auxArray,mid+1,hi);
        merge(mainArray,auxArray,lo,mid,hi);
    }

    private static void merge(int[] mainArray, int[] auxArray, int lo, int mid, int hi) {
        for(int m = lo;m<=hi;m++) auxArray[m]=mainArray[m];

        int i = lo, j = mid+1;
        for (int k=lo;k<=hi;k++){
            if(i>mid) mainArray[k]=auxArray[j++];
            else if(j>hi) mainArray[k] = auxArray[i++];
            else if (auxArray[i]<mainArray[j]) mainArray[k] = auxArray[i++];
            else mainArray[k]= auxArray[j++];
        }
    }
}
