#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string ch;
  int n;
  
  getline(cin,ch);
  cin>>n;
  
  if(ch.compare("front") == 0){
  		if(n == 1){
        		cout<<"Left Handed";
        }
    	else{
        		cout<<"Right Handed";
        }
  }
  else{
  		if(n == 1){
        		cout<<"Right Handed";
        }
    	else{
        		cout<<"Left Handed";
        }
  }
}