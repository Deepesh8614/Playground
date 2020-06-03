#include<iostream>
#include <iomanip> 
using namespace std;
int main()
{
  //Type your code here.
  int tb,t,r,b;
  int to;
  float cr,rr,o;
  cin>>tb>>t>>r>>b;

  to = tb/6;
  cout<<to<<endl;
  cout<<std::fixed;
  cout<<std::setprecision(1);
  o = (b/6) + ((b%6)*0.1);
  cout<<o<<endl;
  
  cr = (float)r/o;
  cout<<cr<<endl;
  
  rr = (float)t/to;
  cout<<rr<<endl;
  
  if(cr>=rr){
  	cout<<"Eligible to Win";
  }
  else{
  	cout<<"Not Eligible to Win";
  }
  
}