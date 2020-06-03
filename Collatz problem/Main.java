#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=0;
  
  //Entering The Number
  cin>>n;
  
  cout<<n<<endl;
  //Printing The Sequence
  	while(n!=1){
    	if(n%2 == 0){
        	n = n/2;
        }
      else{
      	n = 3*n+1;
      }
      cout<<n<<endl;
      i++;
    }
  	cout<<i;
}