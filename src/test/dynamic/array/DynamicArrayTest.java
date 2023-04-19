package test.dynamic.array;

public class DynamicArrayTest {
// 중간고사에 이런 동적배열문제 자주 나옴 
	public static void main(String[] args) {
		int[] num = {3,1,5};
		int[][] arr = new int[3][];
		int cat = 0;
//		입력
		for (int i = 0; i < arr.length; i++) {// arr.length는 행의 갯수가 됨 즉 3
			arr[i] = new int[num[i]]; // arr배열에 i행에 들어갈 열의 크기를 지정 // i+1을 num으로 바꾸어서 규칙성없는 크기의 동적배열을 사용할 수 있다.
			for (int j = 0; j < arr[i].length; j++) { // arr배열에 i행의 크기만큼 반복 
				arr[i][j] = ++cat; // cat 를 0으로 초기화했고 1부터 출력할 거라 ++cat로 한것
				// 큰프로젝트를 하면 입력과 출력을 구분해야 관리가 편리함 
			}
		}
		
//		출력
		for (int i = 0; i < arr.length; i++) {// arr.length는 행의 갯수가 됨 즉 3
			for (int j = 0; j < arr[i].length; j++) { // arr배열에 i행의 크기만큼 반복 
				System.out.print(arr[i][j] + "\t"); 
			}
			System.out.println();
		}
		//System.out.println(arr[5][4]);// 예로 발생하는 에러가 런타임에러
		
	}

}
