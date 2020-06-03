#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s;
  
  cin>>n;
  for(int i=1;i<=n;i++){
  	s = i*i;
    if(i%2 == 0){
    	s = s-2;
    }
    else{
    	s = s-1;
    }
    cout<<s<<" ";
  }
}