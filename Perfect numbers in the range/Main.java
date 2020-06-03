#include<iostream>
using namespace std;
int main(){
	int a,b,sum = 0;;
  	
 	cin>>a>>b;
    for(int j =a;j<b;j++){
      sum =0;
      for(int i=1;i<j;i++){
          int rem = (j)%i;
          if(rem ==0){
              sum = sum + i;
          }
      }
      if(sum == j){
          cout<<j<<" ";
      }
    }
}