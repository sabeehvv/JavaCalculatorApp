package swingCalculator;

public class Functions {
	int num1,num2,Result,selection;
	
	void Addition(){
		Result=num1+num2;
	}
	
	void Substraction() {
		Result=num1-num2;
	}
	
	void Multiplication() {
		Result=num1*num2;
	}
	
	void Division() {
		Result=num1%num2;
	}
	void Display(){
		System.out.println(Result);
	}

}
