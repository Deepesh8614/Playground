#include<iostream>
using namespace std;
int main(){
	int n,r=11;
  		
  	cin>>n;
  	for(int i=1;i<=n;i++){
    	cout<<r*r<<" ";
      	r = r+4;
    }
}