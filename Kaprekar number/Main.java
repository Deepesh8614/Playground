#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp,s,count=0,sum=0;
  
  //Entering the number
  cin>>n;
  
  s = (int)pow(n,2);
  temp = s;

  while(temp > 0){
  	temp = temp /10;
    count++;
  }
  
  if(count%2==0){
  		count = count/2;
  }
  else{
  		count = (count/2) + 1;
  }
  
  temp = (int)pow(10,count);
  sum = (s/temp) + (s%temp);
  
  if(sum == n){
  		cout<<"Kaprekar Number";
  }
  else{
  		cout<<"Not a Kaprekar Number";
  }
}