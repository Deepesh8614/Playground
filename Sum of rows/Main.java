#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,sum,num;
  cin>>n>>m;
  
  for(int i=0;i<n;i++){
    sum = 0;
  	for(int j=0;j<m;j++){
    	cin>>num;
      	sum += num;
    }
    cout<<sum<<endl;
  }
}