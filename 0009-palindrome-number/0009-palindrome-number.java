class Solution {
    public boolean isPalindrome(int x) {
      if(x<0){
          return false;
      }  
        int sum=0;
        int temp=x;
        int r=0;
        while(temp>0){
            r=temp%10;
            sum=(sum*10)+r;
            temp=temp/10;
        }
        if(sum == x){
            return true;
        }
        else{
            return false;
        }
    }
}