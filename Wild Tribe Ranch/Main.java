#include<iostream>
using namespace std;
int main(){
	int max, w;
  	cin>>max>>w;
  	if(max>w){
    	cout<<"Yes, you can enter.";
    }
  	else if(max==w){
    	cout<<"Yes, you can enter. Kindly use a rope.";
    }
 	else{
    	cout<<"Sorry, you can't enter";
    }
}