#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int count = 0,n;
  float score = 0.0;
  
  //Calculating the score
  while(count!=3){
  	cin>>n;
    if(n<0){
    	score = score - 1;
      	break;
    }
    else if(n%2 == 0){
    	score = score - 0.5;
    }
    else{
    	score = score + 1;
      	count++;
    }
  }
  
  cout<<score;
}