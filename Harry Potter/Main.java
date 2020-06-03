#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,b;
  // Entering the number
  std::cin>>n;
  
  a = n/1000;
  b = n%10;
  
  std::cout<<a+b;
}