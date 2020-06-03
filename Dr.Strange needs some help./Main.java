#include<iostream>
using namespace std;
int powerNum(int,int);
int main(){
	int n,m,req,gen;
  	cin>>n>>m>>req;
	gen = powerNum(n,m);
  	if(gen >= req){
    	cout<<"Doctor, you can proceed with your experiment.";
    }
  	else{
    	cout<<"Sorry Doctor! You need more bacteria.";
    }
}
int powerNum(int n,int m){
  	int gen = 1;
  	for(int i=1;i<=m;i++){
    	gen *= n;
    }
  	return gen;
}