#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  	int n,m;
  	cin>>n>>m;
  	int mat1[n][m];
  	int mat2[n][m];
  
  	for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            std::cin>>mat1[i][j];
        }
    }
  
  	for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            std::cin>>mat2[i][j];
        }
    }
  
  	for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            std::cout<<mat1[i][j]+mat2[i][j]<<" ";
        }
      	std::cout<<"\n";
    }
}