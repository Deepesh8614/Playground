#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int vowel=0,consonant=0,space=0,digit=0,symbol=0;
  for(int i=0; i<s.length() ; i++){
  		char x = s.at(i);
    	if(x == ' '){
        	space++;
        }
    	else if(isalpha(x)){
        	if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            	vowel++;
            }
          	else{
            	consonant++;
            }
        }
        else if(isdigit(x)){
        	digit++;
        } 
        else {
        	symbol++;
        }
  }

	cout<<"Vowels:"<<vowel<<endl;	
	cout<<"Consonants:"<<consonant<<endl;
	cout<<"White Spaces:"<<space<<endl;
	cout<<"Digits:"<<digit<<endl;
	cout<<"Symbols:"<<symbol<<endl;

}