#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,count=0,a;
  
  cin>>n;
  
  while(sum<n){
    cin>>a;
    sum = sum + a;
    count++;
  }
  
  cout<<"The number of turns is "<<count;
  
}