#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string str;
  getline(cin,str);
  for(auto i=str.end()-1; i>=str.begin();i--){
  	cout<<*i;
  }
}