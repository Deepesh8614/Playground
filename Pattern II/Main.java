#include<iostream>
using namespace std;
int main(){
	int n,r=1;
  
  	cin>>n;
  	cout<<"1\n";
  	for(int i=2;i<=n;i++){
    	if(i%2==0){
        	r = r+i+1;
          	for(int j=1;j<=i;j++){
              	if(j<i)
            		cout<<r-j<<"*";
              	else
                  	cout<<r-j<<endl;
            }
        }
      	else{
        	for(int j=1;j<=i;j++){
              	if(j<i)
            		cout<<r++<<"*";
              	else
                  	cout<<r<<endl;
            }
        }
    }
}