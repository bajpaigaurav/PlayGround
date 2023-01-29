import java.util.Arrays;
import java.util.Comparator;

public class LeetCode {

    public static void main(String[] args) {
        int[][] twoDim = { {1, 2}, {3, 7}, {8, 9}, {4, 2}, {5, 3} };
        mergeIntervals(twoDim);
    }

    private static int[][] mergeIntervals(int[][] intervals) {

        Arrays.sort(intervals,0,intervals.length,
                Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(intervals));

        for(int i = 1; i < intervals.length ; i++) {
            if(intervals[i-1][1] > intervals[i][0]) {

            }
        }

        return intervals;
    }
}
