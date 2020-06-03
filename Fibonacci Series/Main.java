#include<iostream>
using namespace std;
int fibonacci(int n){
	int prev = 0;
  	int curr = 1;
  	int next;
  	if(n == 1){
    	return 0;
    }
  	if(n == 2){
    	return 1;
    }
  	for(int i=3;i<=n;i++){
    	next = prev + curr;
      	prev = curr;
      	curr = next;
    }
  	return curr;
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fibonacci(n);
}