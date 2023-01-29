public class CyclicPatternQuestions {

    public static void main(String[] args) {

    }
 //   We are given an unsorted array containing ‘n+1’ numbers taken from the range 1
 //   to ‘n’. The array has only one duplicate but it can be repeated multiple times.
  //  Find that duplicate number without using any extra space. You are, however,
   // allowed to modify the input array.
    private static int findNumber(int[] nums) {

        int i = 0;
        while(i < nums.length) {
            if(nums[i] != i+1) {
                if(nums[i] != nums[nums[i] - 1]) {
                    swap(nums, i , nums[i] - 1);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    private static void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
