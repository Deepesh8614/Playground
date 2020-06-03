#include<iostream>
using namespace std;
void print(int a){
  if(a == 1){
  	cout<<"Arun Gupta";
  }
  else{
  	cout<<"Mani Iyer";
  }
}
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int sticks = n+m;
	print(sticks%2);
}