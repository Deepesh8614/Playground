#include<iostream>
using namespace std;
int digitSum(int n){
  	int sum =0 ;
	while(n!=0){
    	int r = n%10;
      	sum = sum + r;
      	n = n /10;
      	if(n == 0 & sum/10 != 0){
        	n = sum ;
          	sum = 0;
        }
    }
  return sum;
}
int main(){
	int n;
  	cin>>n;
  	cout<<digitSum(n);
}