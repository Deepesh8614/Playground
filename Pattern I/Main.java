#include<iostream>
using namespace std;
int main(){
	int n,k=4;
  	cin>>n;
  
  	for(int i=1;i<=8;i++){
    	if(i<=4){
        	for(int j=1;j<=i;j++){
            	cout<<n;
            }
          	cout<<"\n";
          	n++;
        }
      	else{
          	n--;
        	for(int j=1;j<=k;j++){
            	cout<<n;
            }
          	cout<<"\n";
          	k--;
        }
    }
}