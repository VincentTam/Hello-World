#include <stdio.h>
#include <iostream>
using namespace std;

int main(void)
{
	string user_name;
	cout << "Enter your name: ";
	getline (cin,user_name);
	cout << "Hello world, " << user_name << "!" << endl;
	return 0;
}
// vim:sw=4: 
