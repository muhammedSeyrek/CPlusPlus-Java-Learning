#include<iostream>
using namespace std;
int main(){
	int number;
	cout << "Enter a number = ";
	cin >> number;
	if(number >= 0)
		cout << "Number is a positive = " << number;
	else
		cout << "Number is a negative = " << number;
	return 0;
}
