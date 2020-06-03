#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  
  for(int i=0;i<s.length();i++){
  		char ch = s.at(i);
    	if(isalpha(ch)){
        	cout<<ch;
        }
  }
}