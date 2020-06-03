#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  cin>>age>>time;
  if(time == 13.30f){
  	if(age>13){
      cout<<"$5.00";
    }
    else{
    	cout<<"$2.00";
    }
  }
  else{
  		if(age>13){
      cout<<"$8.00";
    }
    else{
    	cout<<"$4.00";
    }
  }
}