#include <iostream>
#include<string>
int main()
{
char str[100], rev[100];     
int n=0;    
//Your code goes here
 std::cin.getline(str,100);
	while(str[n] !='\0'){
    	n++;
    }
  for(int i=n-1;i>=0;i--){
  	std::cout<<str[i];
  }
}