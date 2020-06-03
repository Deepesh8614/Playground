#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  
  //Entering The Number
  cin>>n;
  int arr[n];
  
  arr[0] = 0;
  arr[1] = 1;
  
  for(int i=2;i<n;i++){
  		arr[i] = arr[i-1] + arr[i-2];
  }
  
  cout<<arr[n-1];
}