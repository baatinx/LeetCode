// You are given an interger I. You need to print the absolute value of the interger I.
// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

int absolute(int I);

int main() {
    int T;    // number of testcases
    cin >> T; // input number of testcases
    while (T--) {
        int I;
        cin >> I;
        cout << absolute(I) << endl; // print the output
    }
    return 0;
}// } Driver Code Ends


// User function Template for C++

// Should return absolute value of I
// You need to complete this function
int absolute(int I) {
    // Your code here
    if (I >= 0)
        return I;
    else
        return (~I + 1);
}
