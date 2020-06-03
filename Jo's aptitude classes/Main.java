#include <bits/stdc++.h> 
using namespace std; 
  
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 

int findGCD(int arr[], int n) 
{ 
    int result = arr[0]; 
    for (int i = 1; i < n; i++) 
    { 
        result = gcd(arr[i], result); 
  
        if(result == 1) 
        { 
           return 1; 
        } 
    } 
    return result; 
} 
  
int main() 
{ 
    int arr[3],ans;
  	cin>>arr[0]>>arr[1]>>arr[2];
 	cin>>ans;
   int	result = findGCD(arr, 3);
  	if(result == ans){
    	cout<<"Answer is correct.";
    }
  	else{
    	cout<<"Answer is wrong.";
    }
    return 0; 
} 