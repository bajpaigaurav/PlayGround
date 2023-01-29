
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hellow world");
        //System.out.println(isCircular("GGGGL"));
        //System.out.println(KthLargestElement.kthLargest(new int[]{1,5,12,2,11,5},3));
        //System.out.println(maxEvents(new int[]{1,3,5},new int[]{2,2,2})); // returning 3
        //System.out.println(maxEvents(new int[]{1,3,3,5,7},new int[]{2,2,1,2,1})); // returning 5
//        System.out.println(isArraySmooth(new int [] {7,2,2,5,10,7}));
//        System.out.println(isArraySmooth(new int [] {1,3,4,6,8}));
        //System.out.println(Arrays.toString(doubleTheNextEle(new int [] {2,2,0,4,0,8})));
//        ArrayList<String> a = new ArrayList<String>() ;

//        System.out.println(a.get(0));
//
//        int[] as = new int[100];
//        System.out.println(ClassLayout.);
//        a.add("Gaurav");
//        a.add("Bajpai");
//        System.out.println(nthSpecialNumber(5));
//        System.out.println(nthSpecialNumber(1));
//        System.out.println(nthSpecialNumber(2));
        // System.out.println(nthSpecialNumber(12));
//        System.out.println(KDistinctVowel("artyebui",2));
//        System.out.println(Arrays.toString(maxSubArraySum(new int[] {-1,2,1,3,-2}, 5)));
        //System.out.println(hariWasForced(1,2,3));
        //linkedHashma("gaurav");
       // System.out.println(solve(4,1, new int[] {4, 3, 1, 2, 5}));

        System.out.println(majority(5,new int[] {1,2,3,5,1}));

    }

    private static int solve(int N, int K, int heights[])
    {
        // code here
        int whoCanView = N;
        for(int i = 0 ; i < N ; i++) {
            int current = heights[i];
            for(int j = i+1; j < i+K && j <= N ; j++){
                if(current >= heights[j]) {
                    continue;
                } else {
                    whoCanView--;
                    //System.out.println("Breaking!");
                    break;

                }
            }
        }

        return whoCanView;
    }

    static void linkedHashma(String a){
        Map<Character, Integer> f = new LinkedHashMap<>();

        for( int i = 0; i < a.length(); i++) {
            if(f.get(a.charAt(i)) != null) {
                f.put(a.charAt(i), f.get(a.charAt(i)) + 1);
            } else {
                f.put(a.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> e : f.entrySet()) {
            System.out.println(e);
        }

    }


    static int hariWasForced(int x, int y, int p) {
        for(int i = 1; i <= p; i++) {
            if(i%2 == 0) {
                y*=2;
            } else {
                x*=2;
            }
        }
        return Math.max(y,x)/Math.min(y,x);
    }
    static int[] maxSubArraySum(int[] num, int len) {
        int[] ans = new int[len];
        for(int i = 1; i <= len; i++) {

            int windowStart = 0;
            int windowEnd = 0;
            int maxSoFar = 0;
            int windowSum = 0;
            int windowSize = i;
            while(windowEnd < len) {
                windowSum += num[windowEnd];

                if(windowEnd >= i-1 && windowStart < len) {
                    maxSoFar = Math.max(maxSoFar, windowSum);
                    windowSum -= num[windowStart];
                    windowStart++;
                }
                windowEnd++;
            }
            ans[i-1] = maxSoFar;

        }

        return ans;
    }


    static boolean isVowel(char x) {
        return (x == 'a' || x == 'e' || x == 'i' ||
                x == 'o' || x == 'u' || x == 'A' ||
                x == 'E' || x == 'I' || x == 'O' ||
                x == 'U');
    }

    static int KDistinctVowel(String s, int k) {
        int n = s.length();
        int[] c = new int[128];
        int result = -1;
        for (int i = 0, j = -1; i < n; ++i) {
            char x = s.charAt(i);
            if (isVowel(x)) {
                if (++c[x] == 1) {
                    --k;
                }
            }
            while (k < 0) {

                x = s.charAt(++j);
                if (isVowel(x)) {

                    if (--c[x] == 0) {
                        ++k;
                    }
                }
            }
            if (k == 0) {
                result = Math.max(result, i - j);
            }
        }
        return result;
    }
    private static int nthSpecialNumber(int n) {
        int[] special = {0,1,2,3,4,5};
        int factor = n/6;
        if(factor > 0) {
            return n%6 != 0 ? 10*factor+special[n%6 - 1] : 10*factor+special[n%6];
        } else {
            return special[n-1];
        }
    }

    private static boolean isArraySmooth(int[] arr){
        if(arr.length % 2 == 0) {
            return arr[0] == arr[arr.length-1] && arr[0] == (arr[(arr.length-1) / 2]+arr[(arr.length / 2)]);
        } else {
            return arr[0] == arr[arr.length -1] && arr[0] == arr[arr.length/2];
        }
    }

//    private static int[] doubleTheNextEle(int[] arr) {
//
//        for(int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] == arr[i+1]) {
//                arr[i]+=arr[i+1];
//                arr[i+1] = 0;
//            }
//        }
//        Arrays.sort(arr,Collections.reverseOrder() );
//        return arr;
//    }
    
    private static boolean isCircular(String input) {
        int x = 0, y = 0;
        int direction = 0;



        for(char i : input.toCharArray()) {

            if(i == 'L') {
                direction = (direction + 1) % 4;
            } else if ( i == 'R') {
                direction = (direction - 1) % 4;
            }

            // for movement
            if(i == 'G' && direction == 0) {
                x++;
            } else if(i == 'G' && direction == 1) {
                x--;
            } else if(i == 'G' && direction == 2) {
                y++;
            } else if(i == 'G' && direction == 3) {
                y--;
            }
        }

        return x==0&&y==0;
    }

    private static void minimumSwap(int[] nums) {

     // TODO


    }

    private static int maxEvents(int[] events, int[] durations) {
        int[][] startAndEndArray = new int[events.length][1];
        int res = 0;
        for(int i =0 ; i < events.length; i++) {
            startAndEndArray[i] = new int[] {events[i],events[i]+durations[i]};
        }
//        for(int[] a : startAndEndArray) {
//            System.out.println(a[0]+"-"+a[1]);
//        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Arrays.sort(startAndEndArray, (a, b) -> Integer.compare(a[0], b[0]));
      
        return res;
    }

    private static int majority(int input1, int[] input2) {

        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < input1; i++) {
            int count = 0;
            for (int j = 0; j < input1; j++) {
                if (input2[i] == input2[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount > input1 / 2)
            return (input2[index]);

        else
            return -1;

    }


}
