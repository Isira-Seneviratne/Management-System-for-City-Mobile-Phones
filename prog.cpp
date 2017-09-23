#include <iostream>

using namespace std;

class Class
{
private:
	int a, b;

public:
	Class(int c, int d)
	{
		a = c, b = d;
	}
	
	Class(int c)
	{
		a = c, b = 100;
	}
	
	Class()
	{
		a = 100, b = 100;
	}
	
	int add()
	{
		return a+b;
	}
};

int main()
{
	Class c(3, 3), d(10), *e = new Class(4, 99), f;
	cout << c.add() << endl << d.add() << endl << e->add() << endl << f.add() << endl;
	delete e;
}
