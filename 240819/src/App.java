import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = lengthOfLIS(nums);
        System.out.println(result);
    }

    public static int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
       
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > list.get(list.size()-1)) {
                list.add(nums[i]);
            } else {

                int left = 0;
                int right = list.size();
                int target = nums[i];

                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                
                list.set(left, nums[i]);
            }
        }
        return list.size();
    }
}
