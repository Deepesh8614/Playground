#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float sum = 0.0;
  
  //Entering the number of chalks
  cin>>n;
  
  for(int i=1;i<=n;i++){
  		sum = sum + (1/sqrt(n));
  }
  
  n = n + (int)sum;
  
  cout<<n+1;
}