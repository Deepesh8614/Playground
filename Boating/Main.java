#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,a,c;
  int tw;
  cin>>w>>a>>c;
  
  tw = (75*a)+(30*c);
  
  if(tw<=w){
  	cout<<"Boat is stable";
  }
  else{
  	cout<<"Boat will drow";
  }
}