import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];

            if (map.containsKey(requiredNumber)) {
                return new int[]{map.get(requiredNumber), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}