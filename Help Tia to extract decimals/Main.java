#include<iostream>
#include<string>
#include<math.h>
using namespace std;
int main(){
	string num;
	string substr=".";
	cin>>num;
	if (num.find(substr) != string::npos) {
      string str3 = num.substr (num.find('.')+1);
      cout<<"Floating part is : "<<str3;
    }
  else
	cout<<"Floating part is : ";

}