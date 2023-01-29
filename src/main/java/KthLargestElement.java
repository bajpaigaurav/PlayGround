import java.util.PriorityQueue;

public class KthLargestElement {

     static int kthLargest(int[] arr, int k) {
        // sorting in decreasing order
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1,n2) -> n1-n2);

        for(int i = 0; i < k ; i++) {
            minHeap.add(arr[i]);
        }

        for(int i = k ; i < arr.length; i++) {
            if(minHeap.peek() < arr[i]) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }



        return minHeap.peek();
    }
}
