#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp,sum=0;
  
  //Entering the number
  cin>>n;
  temp = n;
  
  //Calculating The Sum of the digits
  while(temp > 0){
  		int r = temp % 10;
    	sum = sum + r;
    	temp = temp / 10;
  }
  
  //Checking For Harshad Number
  int h = n % sum;
  
  if(h == 0){
  	cout<<"Harshad Number";
  }
  else{
  	cout<<"Not Harshad Number";
  }
}