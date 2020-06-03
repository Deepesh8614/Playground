#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,num,max=0;
  cin>>n>>m;
  
  for(int i=0;i<n;i++){
  	for(int j=0;j<m;j++){
      	cin>>num;
    	if(num > max){
        	max = num;
        }
    }
  }
  
  cout<<"The maximum element is "<<max;
  
}