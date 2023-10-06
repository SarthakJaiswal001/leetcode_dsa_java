// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]=(nums[i]*(-1));
            }
        }
     int maxi=nums[0];
        for(int i=1;i<n;i++){
             maxi = Math.max(maxi, nums[i]);
        }
       
        int[] hash=new int[maxi + 1];
        
        for(int i=0; i<n ;i++){
            if(nums[i]>=0){
               hash[nums[i]]++ ;  
            }
           
        }
        for(int i=0;i<n;i++){
            if(hash[nums[i]]==1){
                return nums[i];
            }
        }
        
        return -1;
        }
    
}
