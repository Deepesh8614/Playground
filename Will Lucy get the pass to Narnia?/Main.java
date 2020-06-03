#include<iostream>
using namespace std;
int main(){
	int a,b,n;
  	char ch;
  	
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu\n";
  cout<<"1.Addition\n";
  cout<<"2.Subtraction\n";
  cout<<"3.Multiplication\n";
  cout<<"4.Division\n";
  cout<<"5.Remainder\n";
  cin>>ch;
  
  switch(ch){
    case '1':
      n = a+b;
      cout<<n;
    break;
    case '2':
      n = a-b;
      cout<<n;
    break;
    case '3':
      n = a*b;
      cout<<n;
    break;
    case '4':
      n = a/b;
      cout<<n;
    break;
    case '5':
      n = a%b;
      cout<<n;
    break;
    default:
      cout<<"Invalid operation";
  }
}