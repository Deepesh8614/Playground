#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int size,find,flag=0;
 
  cin>>size;
  
  int arr[size];
  for(int i=0;i<size;i++){
    cin>>arr[i];
  }
  
  cin>>find;
  
  for(int i=0;i<size;i++){
    if(arr[i] == find){
    	cout<<"She passed her exam";
      	flag = 1;
      	break;
    }
  }
  
  if(flag == 0){
  	cout<<"She failed";
  }
}