
public class Normal04 {
    public static void main(String[] args) {
        int[] nums = {11, 36, 83, 26};
        int sum = 0;
        for (int num: nums) {
            sum+=num;
        }
        int [] results = new int[5];
        results[0] = sum;
        for (int i=0;i<nums.length;i++) {
            results[i+1] = nums[i];
        }
        for (int i=0;i<results.length;i++) {
            System.out.println(results[i]);
        }

    }
}
