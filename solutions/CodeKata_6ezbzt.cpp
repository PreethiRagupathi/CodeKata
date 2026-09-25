#include<iostream>;
#include<cmath>
using namespace std;
int main()
{
    string str;
    getline(cin,str);
    int mid=str.length()/2;
    if(str.length()%2!=0){
        mid=ceil(mid);
        str[mid]='*';
        cout<<str;
    }
    else{
        str[mid]='*';
        str[mid-1]='*';
        cout<<str;
    }
    
cin local
ceil local
cout local
cabs keyword
cabsf keyword
cabsl keyword
cacos keyword
cacosf keyword
cacosh keyword