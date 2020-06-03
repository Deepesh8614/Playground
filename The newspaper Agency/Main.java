#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y,cost,sell,profit;
  
  cin>>w>>x>>y;
  
  cost = w*y+100;
  sell = w*x;
  profit = sell - cost;
  
  cout<<profit;
}