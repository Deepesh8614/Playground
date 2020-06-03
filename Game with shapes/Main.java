#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rad,side;
  
  cin>>rad>>side;
  
  if(2*rad <= side){
  	cout<<"circle can be inside a square";
  }
  else{
  	cout<<"circle cannot be inside a square";
  }
}