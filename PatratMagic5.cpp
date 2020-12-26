#include <iostream>
using namespace std;
int latura;
int main()
{
    cin >> latura;
    // this is a verified formula to find a magic square's constant assuming you know the side
    latura = latura * (latura * latura + 1) / 2; // latura = latura * (latura+1)/2

    cout << latura;
}
