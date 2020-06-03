#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,max,pos,num;
  cin>>n>>m;
  int row[n] ;
  int col[m] ;
  
  for(int i=0;i<n;i++){
  	row[i] = 0;
  }
  for(int i=0;i<m;i++){
  	col[i] = 0;
  }
  
  for(int i=0;i<n;i++){
  	for(int j=0;j<m;j++){
      	cin>>num;
    	row[i] += num;
      	col[j] += num;
    }
  }
  
  max = row[0];
  pos = 1;
  cout<<"Sum of rows is ";
  for(int i=0;i<n;i++){
  	if(max < row[i]){
    	max = row[i];
      	pos = i+1;
    }
    cout<<row[i]<<" ";
  }
  cout<<"\nRow "<<pos<<" has maximum sum";
  
  max = col[0];
  pos = 1;
  cout<<"\nSum of columns is ";
  for(int i=0;i<m;i++){
  	if(max < col[i]){
    	max = col[i];
      	pos = i+1;
    }
    cout<<col[i]<<" ";
  }
  cout<<"\nColumn "<<pos<<" has maximum sum";
}