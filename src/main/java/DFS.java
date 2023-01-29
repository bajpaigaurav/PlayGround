import javax.lang.model.util.AbstractAnnotationValueVisitor6;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class DFS {


    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        System.out.println(n_changes(new int[] {5,4,1,2,6,5}, new int[] {2}));
    }
    static int solve(int n, int t, int[][] task){
        PriorityQueue<Integer> pQueue= new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(task,Comparator.comparingInt(o->o[0]));
        int pQueueSum=0;
        int max=0;
        for(int i=0;i<n;i++){
            int totalTime =t;
            int distance = 2*task[i][0];
            int remainingTime=totalTime-distance;
            int currEffort=task[i][1];
            if(remainingTime<0){
                break;
            }
            while(pQueueSum>remainingTime){
                pQueueSum-=pQueue.poll();
            }
            if(pQueue.isEmpty()&&remainingTime>currEffort){
                pQueue.add(currEffort);
                pQueueSum+=currEffort;
            }
            else if(pQueueSum+currEffort<=remainingTime){
                pQueue.add(currEffort);
                pQueueSum+=currEffort;
            }
            else{
                Integer currMax=pQueue.peek();
                if(currMax != null && currMax>currEffort){
                    pQueue.poll();
                    pQueue.add(currEffort);
                    pQueueSum=pQueueSum-currMax+currEffort;
                }
            }
            max=Math.max(max,pQueue.size());
        }
        return max;
    }
    static int solveA(int n, int t, int[][] task){

        Arrays.sort(task,Comparator.comparingInt(i->i[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int sum = 0;
        int max = 0;


        for(int i = 0; i< n; i++){
            int tt = t;
            int d = 2 * task[i][0];
            int remainingTime = tt-d;
            int currE = task[i][1];

            if(remainingTime < 0) {
                break;
            }

            while(sum > remainingTime) {
                sum = pq.poll();
            }

            if(pq.isEmpty() && remainingTime > currE) {
                pq.add(currE);
                sum += currE;
            } else if(sum+currE <= remainingTime) {
                pq.add(currE);
                sum+=currE;
            } else {
                Integer maxNow = pq.peek();
                if(maxNow != null && maxNow > currE) {
                    pq.poll();
                    pq.add(currE);
                    sum = sum - maxNow + currE;
                }
            }
            max = Math.max(max, pq.size());
        }



        return max;
    }



    static int n_changes (int[] A, int[] B) {
        int sum_A = Arrays.stream(A).sum();
        int sum_B = Arrays.stream(B).sum();

        if (sum_A == sum_B)
        {
            return 0;
        }

        int[] temp = null;
        int sum_temp = 0;
        if (sum_A < sum_B) {
            temp = A;
            A = B;
            B = temp;
            temp = null;
            sum_temp = sum_A;
            sum_A = sum_B;
            sum_B = sum_temp;
        }

        Arrays.sort(B);
        A =  Arrays.stream(A).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        //std::sort (A.begin(), A.end(), std::greater<int>());
        //std::sort (B.begin(), B.end());
        int nA = A.length;
        int nB = B.length;

        int count = 0;
        int iA = 0;
        int iB = 0;
        int candidate_A, candidate_B;
        while (sum_A > sum_B) {
            if (iA < nA) candidate_A = A[iA]; else candidate_A = 1;
            if (iB < nB) candidate_B = B[iB]; else candidate_B = 6;
            if ((candidate_A == 1) && (candidate_B == 6))  break;
            count ++;
            if ((candidate_A -1) > (6 - candidate_B)) {
                iA++;
                sum_A += (1 - candidate_A);
            } else {
                iB++;
                sum_B += (6 - candidate_B);
            }
        }
        if (sum_A > sum_B) count = -1;
        return count;
    }


//    Automation tool, Excel sheet,
//    migration data,
//    read data from spread sheets
//    client - 15 column numbers random
//    int max 4 digit, return column name
//            28 -> AA -> %26-> 1 -> /26 -> 1 -> A
//            53 -> BA -> %26-> 1 -> /26 -> 2 -> B
//            9999 ->                /26 -> 384 -> 384 % 26 ->
//    returnColumnName(int column) {
//        char[] arr ={'A','B',..};
//
////        int columnEnds = column % 26; // how column ends
////        int tempCalc = (column / 26);
////        int columnStarts = tempCalc > 26 ?  tempCalc % 26 : tempCalc;
//        String cname = "";
//        while(column > 0) {
//        cname = arr[column % 26] + cname;
//        column = (column / 26) % 26;
//        }
//
//    }

















}

//
