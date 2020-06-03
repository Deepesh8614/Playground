#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,num;
  cin>>n>>m;
  int mat[m];
  
  for(int i=0;i<m;i++){
  	mat[i] = 0;
  }
  
  for(int i=0;i<n;i++){
  	for(int j=0;j<m;j++){
      	cin>>num;
    	if(mat[j] < num){
        	mat[j] = num;
        }
    }
  }
  
 for(int i=0;i<m;i++){
 	cout<<mat[i]<<endl;
 }

}