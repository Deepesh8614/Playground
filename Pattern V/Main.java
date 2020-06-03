#include<iostream>
using namespace std;
int main(){
	int n;
  	int a,b;
  
  	cin>>n;
  	a = 1;
  	b = n*(n+1);
  	
  	for(int i =1;i<=n;i++){
    	for(int j=1;j<=2*(i-1);j++){
        	cout<<"-";
        }
      	for(int j =1;j<=n-i+1;j++){
        	cout<<a<<"*";
          	a++;
        }
      	for(int j =1;j<=n-i;j++){
        	cout<<b-n+i+j-1<<"*";
        }
      	cout<<b;
      	b = b-n+i-1;
      	cout<<"\n";
    }
}