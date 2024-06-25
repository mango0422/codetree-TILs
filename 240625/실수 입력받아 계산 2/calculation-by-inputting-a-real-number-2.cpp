#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double a = 0;
    cin >> a;
    cout << fixed << setprecision(2) << a + 1.5 << endl;
    return 0;
}