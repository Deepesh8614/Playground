#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,m=0,f=0;
  int *arr;
  cin>>n;
  
  arr = (int *)malloc(sizeof(int)*n);
  
  for(int i=0;i<n;i++){
  	cin>>arr[i];
    if(arr[i] % 2 == 0){
    	f++;
    }
    else{
    	m++;
    }
  }
  
  cout<<m<<"\n"<<f;
  
  return 0;
}