
/**
 * Write a description of class CodingBatArrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodingBatArrays
{
    public boolean unlucky1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 13) {
                return true;
            }
        }
        return false;
    }

    public int[] swapEnds(int[] nums) {
        if (nums.length >= 2) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        return nums;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public int[] withoutTen(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                count++;
            }
        }

        int[] result = new int[count];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                result[k] = nums[i];
                k++;
            }
        }
        return result;
    }
}
