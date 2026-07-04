#include <iostream>
using namespace std;

int main() {
    int r,c;
    cin>>r;
    cin>>c;
    bool last = true;
    
    for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    cout<<"#";
                }
                cout<<""<<endl;
            }else{
                for(int j=0;j<c;j++){
                    if((j==0 && last==false) || (j==c-1 && last==true)){
                        cout<<"#";
                        
                    }else{
                        cout<<".";
                    }
                }
                last = !last;
                cout<<""<<endl;
            }   
        }

    return 0;
}