class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int cnt1=0;
        int cnt2=0;
        int elem1=Integer.MIN_VALUE;
        int elem2=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(cnt1==0 && elem2!=nums[i]){
                cnt1=1;
                elem1=nums[i];
            }
            else if(cnt2==0 && elem1!=nums[i]){
                cnt2=1;
                elem2=nums[i];
            }
            else if(elem1==nums[i]){
                cnt1++;
            }
            else if(elem2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ls=new ArrayList<>();
        
        int times=(int)(n/3)+1;
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==elem1){cnt1++;}
            if(nums[i]==elem2){cnt2++;}
        }
        if(cnt1>=times){ls.add(elem1);}
        if(cnt2>=times){ls.add(elem2);}
        return ls;
//        int n = nums.length; //size of the array

//         int cnt1 = 0, cnt2 = 0; // counts
//         int el1 = Integer.MIN_VALUE; // element 1
//         int el2 = Integer.MIN_VALUE; // element 2

//         // applying the Extended Boyer Moore's Voting Algorithm:
//         for (int i = 0; i < n; i++) {
//             if (cnt1 == 0 && el2 != nums[i]) {
//                 cnt1 = 1;
//                 el1 = nums[i];
//             } else if (cnt2 == 0 && el1 != nums[i]) {
//                 cnt2 = 1;
//                 el2 = nums[i];
//             } else if (nums[i] == el1) cnt1++;
//             else if (nums[i] == el2) cnt2++;
//             else {
//                 cnt1--; cnt2--;
//             }
//         }

//         List<Integer> ls = new ArrayList<>(); // list of answers

//         // Manually check if the stored elements in
//         // el1 and el2 are the majority elements:
//         cnt1 = 0; cnt2 = 0;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] == el1) cnt1++;
//             if (nums[i] == el2) cnt2++;
//         }

//         int mini = (int)(n / 3) + 1;
//         if (cnt1 >= mini) ls.add(el1);
//         if (cnt2 >= mini) ls.add(el2);

//         // Uncomment the following line
//         // if it is told to sort the answer array:
//         //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

//         return ls; 
    }
}