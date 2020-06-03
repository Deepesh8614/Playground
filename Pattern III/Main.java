#include<iostream>
using namespace std;
int main(){
	int n;
  
  	cin>>n;
  	int a = n;
  	for(int i=1;i<=n*2;i++){
      if(i<=n){
    	for(int j = 1;j<=i;j++){
        	if(j==i){
            	cout<<i;
            }
          	else{
            	cout<<i<<"*";
            }
          }
        }
      else{
      	for(int k =1;k<=a;k++){
        	if(k==a){
            	cout<<a;
            }
          	else{
            	cout<<a<<"*";
            }
        }
        a--;
      }
      cout<<"\n";
    }
}