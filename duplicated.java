import java.util.Arrays;

public class duplicated {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 4, 3, 5};
        boolean hasDuplicates = containsDuplicates(a);
        System.out.println("Contains duplicates: " + hasDuplicates);
    }

    public static boolean containsDuplicates(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}






