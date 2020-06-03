#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,d2,c1,c2;
  
  cin>>d1>>c1>>d2>>c2;
  
  d1 = d1+d2;
  c1 = c1+c2;
  
  if(c1>100){
  	d1 = d1 + (c1/100);
    c1 = c1 % 100;
  }
  cout<<d1<<"\n"<<c1;
}