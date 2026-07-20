public class CodingBatArrays {
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }

        return true;
    }

    public int[] maxEnd3(int[] nums) {
        int[] changed = nums;
        if (nums[0] > nums[2]) {
            changed[1] = nums[0];
            changed[2] = nums[0];
        } else {
            changed[1] = nums[2];
            changed[0] = nums[2];
        }
    
        return changed;
    }

    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
    
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            if (num == 2) {
                sum += 2;
            }
        }
        
        return sum == 8;
    }

    public int[] tenRun(int[] nums) {
        int curr = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) { 
                curr = nums[i];
            }
            
            if (curr != -1) {
                nums[i] = curr;
            }
        }
    
        return nums;
    }
}

/*
No output but all of the test cases pass on the CodingBat platform.
*/
