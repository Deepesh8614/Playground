#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum1=0,sum2=0;
  cin>>n;
  int mat[n][n];
  for(int i=0;i<n;i++){
  	for(int j=0;j<n;j++){
    	cin>>mat[i][j];
      	
      	if(i==j){
        	sum1 += mat[i][j];
        }
      	if(i+j == n-1){
        	sum2 += mat[i][j];
        }
    }
  }
  
  if(sum1 == sum2){
  	cout<<"Yes";
  }
  else{
  	cout<<"No";
  }
  
}