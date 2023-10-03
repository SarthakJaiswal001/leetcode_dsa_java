class Solution{
public int secondLargestElement(int[] arr){
int largest=arr[0];
int secondLargest=INT_MIN;
for(int i=0;i<n;i++){
if(arr[i]>largest){
secondLargest=largest;
largest=arr[i];
}
else if(arr[i]<largest && arr[i] > secondLargest){
secondLargest=arr[i];
}
}
return secondLargest;
}
}
