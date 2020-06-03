#include<iostream>
using namespace std;
int arrayFormat(int arr[], int n){
	int even=0,odd=0;
  	for(int i=0;i<n;i++){
    	int r = arr[i] % 2;
      	if(r == 0){
        	even++;
          	if(odd>0){
            	return 3;
            }
        }
      	else{
        	odd++;
          	if(even>0){
            	return 3;
            }
        }
    }
  
  	if(even == n){
    	return 1;
    }
  	return 2;
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array \n";
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array \n";
  for(int i=0;i<n;i++){
  	cin>>arr[i];
  }
  int val = arrayFormat(arr,n);
  if(val == 1){
  		cout<<"The array is Even";
  }
  else if(val == 2){
  		cout<<"The array is Odd";
  }
  else{
  		cout<<"The array is Mixed";
  }
}