package test.exception;

import java.util.Scanner;

public class ArithmeticTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* 분자입력:");
		int n1 = s.nextInt();
		System.out.print("* 분모입력:");
		int n2 = s.nextInt();
		
		// double result = (double)n1 / n2; //정상적인 방법
		// System.out.printf("%d ÷ %d = %.2f\n",n1,n2,result);
		try {		
		System.out.printf("%d ÷ %d = %.2f\n",n1,n2,n1/n2);
		} catch(ArithmeticException e) {
			System.out.println("정수는 0으로 나누면 안됩니다.");
			System.out.print("* 분모입력:");
			n2 = s.nextInt();
			System.out.printf("%d ÷ %d = %d\n",n1,n2,n1/n2);
		} finally {
			System.out.println("프로그램 종료~");
		}
		s.close();
	}

}
