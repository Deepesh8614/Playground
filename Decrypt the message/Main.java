#include<iostream>
using namespace std;
int main(){
	int en,n,sum = 0;;
  	
 	cin>>en>>n;
  
  	for(int i=1;i<en+n;i++){
    	int rem = (en+n)%i;
      	if(rem ==0){
        	sum = sum + i;
        }
    }
  	
  	if(sum == en+n){
    	cout<<"They can read the message";
    }
  	else{
    	cout<<"They can't read the message";
    }
}