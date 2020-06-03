#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  float i,a,d,ta;
  cin>>p>>r>>t;
  
  i = (p*r*t)/100;
  a = p + i;
  d = i * 0.02;
  ta = a - d;
  
  cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<ta;
  
}