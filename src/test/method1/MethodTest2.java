package test.method1;

public class MethodTest2 {

	static void add(int n1, int n2) {
		int sum = n1 + n2;
		System.out.printf("%d + %d = %d\n",n1,n2,sum);
	}
	
	
	public static void main(String[] args) {
		add(2000,1000);
		add(1234,5678);
	}

}
