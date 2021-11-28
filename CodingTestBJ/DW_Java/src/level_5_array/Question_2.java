package level_5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//문제
		//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

		//예를 들어, 서로 다른 9개의 자연수

		//3, 29, 38, 12, 57, 74, 40, 85, 61

		//이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

		//입력
		//첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

		//출력
		//첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9]; //배열의 크기는 문제에서 정해줬다
		int max = 0; // 최댓값을 구할 max 선언
		int count = 0; // 몇번째 값인지를 구할 count 선언
		int index = 0; // 몇번째 값인지를 넣을 index 선언
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine()); // 배열크기만큼 반복하며 배열안에 정수를 입력받는다.
		}
		
		for(int n : arr) { // 입력받은 배열안의 정수들을 모두 int n에 하나씩 넣어가며 반복
			count++; // 카운트 1씩 증가
			if(n>max) { // 만약 arr에서 n에 넣어진 값이 max(최초값은 0)보다 크다면
				max = n; // max에 n의 값을 대입한다
				index = count; // count의 값을 index에 넣는다. for each문은 arr의 크기만큼 모든 값을 n에 다 넣을때까지 멈추지 않아서
							   // 최댓값이 구해진 순간의 인덱스값을 파악하기 위해 index에 count값을 집어넣어주는것.
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		
	}

}
