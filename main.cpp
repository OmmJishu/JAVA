#include <bits/stdc++.h>
using namespace std;

class Parent{
public:
    virtual void greet(){  
        cout << "Greet From Parent" << endl;
    }
};

class Child : public Parent {
private:
    void greet(){
        cout << "Greet From Child" << endl;
    }
};

int main(){
    cout << "---------------------------------" << endl;

    // Parent to child 
    Parent *par = new Child();
    par->greet();   // Accessing Private Method 


    cout << "---------------------------------" << endl;
    // Child to parent
    // Child *ch = (Child*)(new Parent());
    // ch->greet();

    // cout << "---------------------------------" << endl;
    return 0;
}