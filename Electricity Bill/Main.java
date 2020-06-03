#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  
  cin>>n;
  
  if(n<=200){
  	 m = 0.5 * n;
  }
  else if(n<=400){
  	 m = (0.65*n) + 100;
  }
  else if(n<=600){
  	 m = (0.80 * n) + 200;
  }
  else {
  	m = (1.25 * n) + 425;
  }
  cout<<"Rs."<<m;
}