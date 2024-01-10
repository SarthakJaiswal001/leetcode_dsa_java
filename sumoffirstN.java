// Problem statement
// You are given an integer ‘n’.



// Your task is determining the sum of the first ‘n’ natural numbers and returning it.
public class Solution {
    public static long sumFirstN(long n) {
        // Write your code here.
        long sum=0;
        for(long i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
//for recursive solution
public class Solution {
    public static long sumFirstN(long n) {
        // Write your code here.
      if(n<=1){
return 1;
      }  
      else{
          return n+sumFirstN(n-1);
      }
      
    }
}
