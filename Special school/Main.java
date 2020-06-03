#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50],s2[50];
  int i=0,n;
  cin>>s1>>s2;
  
  while(s1[i] != '\0'){
  	i++;
  }
  n = i;
  int j=0;
  for(i=n-1;i>=0;i--){
  		if(s1[i] == s2[j]){
        	j++;
        }
  }
  if(j==n){
  		cout<<"It is correct";
  } else {
  		cout<<"It is wrong";
  }
}