#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char s1[30] ;
  char s2[30] ;
  
  cin>>s1>>s2;

  if(strcmp(s1,s2) == 0){
  		cout<<"It is correct";
  } else {
  		cout<<"It is wrong";
  }
}