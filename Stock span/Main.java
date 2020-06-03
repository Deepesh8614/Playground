#include<iostream>
using namespace std;
void stockSpan(int n, int *a){
	int val = 0;
  	cout<<"1\n";
  	for(int i=1;i<n;i++){
    	if(*(a+i) <= *(a+i-1)){
        	cout<<"1\n";
        }
      	else{
          	val = val + 2;
        	cout<<val<<endl;
        }
    }
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  
  int arr[n];
  for(int i=0;i<n;i++){
  	cin>>arr[i];
  }
  
  stockSpan(n,arr);
}