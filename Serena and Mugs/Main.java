#include<iostream>
using namespace std;
int printresult(int *p,int sum,int m){
	if(sum > m){
    	return 0;
    }
  	return 1;
}
int main()
{
  //Type your code here.
  int n,m,sum=0;
  cin>>n>>m;
  int arr[n];
  
  for(int i=0;i<n;i++){
  	cin>>arr[i];
    sum = sum + arr[i];
  }
  
  if(printresult(arr,sum,m)){
  	cout<<"YES";
  } else {
  	cout<<"NO";
  }
  
  
}