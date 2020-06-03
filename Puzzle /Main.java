#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  	int r,c;
  
  	cin>>r>>c;
  	
  	int mat[r][c];
  	for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
        	cin>>mat[i][j];
        }
    }
  
  	for(int j=0;j<c;j++){
    	for(int i=0;i<r;i++){
        	cout<<mat[i][j]<<" ";
        }
      	cout<<"\n";
    }
  
}