#include <iostream>
int main() 
{
	// Type your code here
  	int n,flag=0,rev=0;
  	
  	std::cin>>n;
  
  	while(n>0){
    	int rem = n % 10;
      	rev = rem + (rev*10);
      	n = n / 10;
    }
  	std::cout<<rev;
	return 0;
}