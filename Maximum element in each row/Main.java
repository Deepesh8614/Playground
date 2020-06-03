#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,max,num;
  cin>>n>>m;
  
  for(int i=0;i<n;i++){
    max = 0;
  	for(int j=0;j<m;j++){
    	cin>>num;
      	if(num>max){
        	max = num;
        }
    }
    cout<<max<<endl;
  }
}