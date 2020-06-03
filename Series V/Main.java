#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=11;
  
  cin>>n;
  
  for(int i=1;i<=n;i++){
  	cout<<s*s<<" ";
    s = s+4;
  }
}