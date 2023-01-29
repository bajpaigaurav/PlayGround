import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
       List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        System.out.println(subsets.size());
        for ( int ele: arr) {
            int size = subsets.size();
            for( int i = 0 ; i < size; i++) {
                List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
                currentSubset.add(ele);
                subsets.add(currentSubset);
            }
        }
        System.out.println(Arrays.asList(subsets));
    }
}
