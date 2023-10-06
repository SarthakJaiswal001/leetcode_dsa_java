import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        
 int result = 0;
    for (int num : nums) {
        result ^= num;
    }
    return result;
        }
    //this is xor and most optimized solution
}