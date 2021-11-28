package level_5_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//문제
		//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

		//입력
		//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

		//출력
		//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//배열의 크기를 정해줄 n을 입력받고 배열 크기만큼 배열안에 정수를 입력받고 공백으로 구분지어줄 스트링 토크나이저 선언
		
		
		int[] arr = new int[n];
		//배열 선언
		int min = 1000000;
		int max = -1000000;
		//예제의 min은 최대값보다 무조건 작아야하기 때문에 min에는 예제의 최대값을
		//max에는 최소값보다 무조건 커야하기때문에 max에는 예제의 최소값을 넣어준다.
		//비교를 위해서..
		
		for(int i=0; i<arr.length; i++) {//i는 인덱스값, 반복수는 배열의 크기만큼
			arr[i] = Integer.parseInt(st.nextToken()); //스트링토크나이저에 br.readline으로 담아둔 배열안의 정수를 nextToken()으로 불러와서 배열에 넣는다
			if(arr[i]>max) { // arr[i], 즉 처음은 arr[0]의 크기가 max보다 크다면, ex) -100만보다 arr[i]의 크기가 크다면 max에 배열의 정수를 대입한다.
				max = arr[i]; // arr[0]의 크기가 3이였다면 이제 max는 3이된다. 계속 반복하여 입력받은 정수값이 커지면 max는 값이 더 커진다.
			}
			if(arr[i]<min) { // 마찬가지, 100만보다 arr[i]의 크기가 작다면 최소값을 넣겠다는 조건문
				min = arr[i];// arr[0]의 크기가 3이였다면, min은 이제 3이된다. 계속 반복하여 입력받은 정수값이 작아지면 min의 값은 더 작아진다.
			}
		}
		bw.write(min + " " + max); // 반복문을 끝마친 min과 max의 값을 출력
		bw.flush();
		bw.close();
		br.close();
	}

}
