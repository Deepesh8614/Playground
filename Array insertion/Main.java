#include<iostream>
using namespace std;
void insertX(int n, int arr[],int x, int pos) 
    { 
        int i; 
        int newarr[n + 1]; 
        for (i = 0; i < n + 1; i++) { 
            if (i < pos - 1) 
                newarr[i] = arr[i]; 
            else if (i == pos - 1) 
                newarr[i] = x; 
            else
                newarr[i] = arr[i - 1]; 
        } 
        
  		cout<<"Array after insertion is \n";
  		for(int i=0;i<n+1;i++){
        	cout<<newarr[i]<<endl;
        }
    } 
int main()
{
  //Type your code here.
  int n,val,loc;
  
  // Size Of The Array
  cout<<"Enter the number of elements in the array \n";
  cin>>n;
  
  //Declaring The Array
  int arr[n];
  
  //Entering The Elements of Array
  cout<<"Enter the elements in the array \n";
  for(int i=0; i<n ; i++){
  	cin>>arr[i];
  }
  
  //Entering the value
  cout<<"Enter the location where you wish to insert an element \n";
  cin>>loc;
  
  if(loc<n){
  //Entering The value at place
  cout<<"Enter the value to insert \n";
  cin>>val;
  
  insertX(n,arr,val,loc); 
  }
  else
    cout<<"Invalid Input";
  
}