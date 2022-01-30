#include <iostream>
using namespace std;

int main()
 {
    int no,i;
    bool flag=true;
    cout<<"enter no\n";
    cin>>no;
    
    if(no==0 || no==1)
    {
         flag=false;
    }
    
    else{
            for(int i=2;i<no/2;i++)
    {
        if(no%i==0)
        {
            flag=false;
         //cout<<"is not prime no";
        }
        }
    }
    
    if(flag)
        cout<<"is a prime no";
    else
        cout<<"is not prime no";
        return 0;
}