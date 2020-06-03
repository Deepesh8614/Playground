#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float f;
  
  cin>>n>>f;
  
  if(n==2){
  	cout<<f+f*0.5;
	}
  else if(n==3){
  	cout<<f*2;
  }
  else{
  	cout<<"Number of items is more";
  }
}