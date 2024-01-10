// You are given an integer ‘n’.



// Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.



// Example:
// Input: ‘n’ = 5

// Output: 1 2 3 4 5

// Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 5
// Sample Output 1 :
// 1 2 3 4 5
// Explanation Of Sample Input 1:
// The array contains all integers from 1 to 5 in ascending order.
public class Solution {
    public static int[] printNos(int x) {
        int[] arr=new int[x];
        // Write Your Code Here
        for(int i=0;i<x;i++){
arr[i]=i+1;
        }
        return arr;
    }
}
