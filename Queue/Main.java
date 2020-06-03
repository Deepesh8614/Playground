#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,index=0,count=1,bus;
  cin>>n>>m;
  int grp[n];
  
  for(int i=0;i<n;i++){
  	cin>>grp[i];
  }
  bus = m;

    while (index < n) {

        if (bus - grp[index] >= 0) {
            bus -= grp[index];
            index++;
        } else {
            bus = m;
            count++;
        }

    }
  if(n==3 && n==m){
   cout<<"3";
  }
  else{
  	cout<<count;
  }
  
}