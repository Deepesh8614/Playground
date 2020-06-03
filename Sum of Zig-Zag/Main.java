#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,sum=0,num;
  cin>>n>>m;
  
  for(int i=0;i<n;i++){
  	for(int j=0;j<m;j++){
    	cin>>num;
      	if(i==0 || i==n-1 || i+j == n-1){
        	sum += num;
        }
    }
  }
  
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}