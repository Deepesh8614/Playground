#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f1,f2,f3;
  int a1,a2,a3;
  int s1,s2,s3;
  int fa,aa,sa;
  cin>>f1>>f2>>f3;  
  cin>>s1>>s2>>s3;
  cin>>a1>>a2>>a3;
  
  fa = f1 - ((f1*f2)/100) + f3;  
  aa = a1 - ((a1*a2)/100) + a3;
  sa = s1 - ((s1*s2)/100) + s3;
  
  cout<<"In Flipkart Rs."<<fa<<endl;
  cout<<"In Snapdeal Rs."<<sa<<endl;
  cout<<"In Amazon Rs."<<aa<<endl;
  
  if(fa<=aa && fa<=sa){
  	cout<<"He will prefer Flipkart";
  }
  else if(aa<sa){
  	cout<<"He will prefer Amazon";
  }
  else{
  	cout<<"He will prefer Snapdeal";
  }

}