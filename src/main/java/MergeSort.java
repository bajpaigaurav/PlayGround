import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {2,1,3,10,5,6};
        int[] sortedList = mergeSort(arr,0,5);
        System.out.println(Arrays.toString(sortedList));
    }

    private static int[] mergeSort(int[] arr, int start, int end) {
        if(start >= end) {
            return null;
        }
        int mid = (start + end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        return merge(arr, start, end);
    }

    private static int[] merge(int[] arr, int start, int end) {
        List<Integer> sortedList = new ArrayList<>();
        int i = start;
        int mid = (start + end)/2;
        int j = mid+1;

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                sortedList.add(arr[i]);
                i++;
            } else {
                sortedList.add(arr[j]);
                j++;
            }
        }

        while( i <= mid) {
            sortedList.add(arr[i]);
            i++;
        }

        while(j <= end) {
            sortedList.add(arr[j]);
            j++;
        }
        int k = 0;
        for (int idx = start ; idx <= end ; idx++) {
            arr[idx] = sortedList.get(k);
            k++;
        }
        return arr;
    }
}
