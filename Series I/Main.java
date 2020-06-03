#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n;
  	float r = 0.5;
  	cin>>n;
  	
  	cout<<r<<" ";
  
  	for(int i=0;i<n-1;i++){
    	r = r + pow(3,i);
      	cout<<r<<" ";
    }
  
}