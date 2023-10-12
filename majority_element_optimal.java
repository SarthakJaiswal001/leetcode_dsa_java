//we are using moores voting algorithm in this
int n=arr.length;
int element;
int count=0;
for(int i=0;i<n;i++){
  if(count==0){
    element=arr[i];
    count=1;
  }
  else if(arr[i] == element){
    count++;
  }
  else{
    count--;
  }
}
int count1=0;
for(int i=0;i<n;i++){
  if(arr[i] == element){
    count1++;
  }}
if(count1 > (n/2)){
  return element;
}
return -1
