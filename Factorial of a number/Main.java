#include<iostream>
int main(){
  // Type your code here
  int n,fac=1;
  
  //Entering The Range
  std::cin>>n;
  
  for(int i=2;i<=n;i++){
  		fac = fac * i;
  }
  
  std::cout<<fac;
  
}