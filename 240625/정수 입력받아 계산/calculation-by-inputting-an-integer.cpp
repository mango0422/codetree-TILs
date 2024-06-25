#include <iostream>
using namespace std;

int main() {
    int a = 0;
    // cout << "Enter number in the range of 1 <= a <= 100" << endl;
    cin >> a;
    while(a < 1 || a > 100){
        // cout << "Enter number again! a is in the range of 1 <= a <= 100" << endl;
        cin >> a;
    }
    cout << a * 2 + 3 << endl;
    return 0;
}