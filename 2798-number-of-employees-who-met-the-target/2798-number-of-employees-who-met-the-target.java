class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        int meettarget=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i] >= target){
              meettarget=meettarget +1;  
            }
        }
        return meettarget;
        
    }
}