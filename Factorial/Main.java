#include<iostream>
using namespace std;
int factorial(int n){
	if(n==1){
    	return 1;
    }
  	return n * factorial(n-1);
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int fact = factorial(n);
  cout<<"The factorial of "<<n<<" is "<<fact;
}