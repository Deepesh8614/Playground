#include<iostream>
int main()
{
  // Type your code here
  int size;
  int max;
  
  std::cin>>size;
  int arr[size];
  for(int i=0;i<size;i++){
  		std::cin>>arr[i];
    	if(i == 0 || arr[i] > max){
        	max = arr[i];
        }
  }
  
  std::cout<<max;
}