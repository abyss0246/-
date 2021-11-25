package level_3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question_11 {

	public static void main(String[] args) throws IOException {
		
		//문제
		//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

		//입력
		//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

		//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

		//출력
		//X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 정수를 입력받는다.
		//String[] strs = br.readLine().split(" "); //백준에서 자꾸 런타임에러(넘버포맷)이 발생해서 알려준 예시대로 다시 작성한 방법

		
		//int n = Integer.parseInt(strs[0]); // 입력받은 정수 중, 토큰화되어 담긴 첫번째 숫자, 즉 얼만큼의 크기를 가진 배열을 생성할것인지에 대한 정수를 int n에 대입한다.
		//int x = Integer.parseInt(strs[1]); // 마찬가지로 토큰화 된 숫자중 두번째 숫자, 즉 이 정수보다 작은 애들을 찾기위한 기준점의 정수를 int x에 대입한다.
		int n = Integer.parseInt(st.nextToken()); // 백준 런타임에러로 인한 문제점 해결법 이전 내가 적은 코드
		int x = Integer.parseInt(st.nextToken()); // 위와 동일
		
		int[] arr = new int[n]; // 입력받은 n의 값으로 int타입의 배열 arr을 선언하고 n만큼의 크기를 지정해준다.
		
		
		for(int i=0; i<n; i++) { //i는 인덱스값, n의 크기만큼의 배열을 정수로 채워넣는 반복문
			arr[i] = Integer.parseInt(br.readLine());  // 배열의 인덱스값은 반드시 0부터 시작하고 n의 크기만큼 반복하며 정수를 입력받는다.
		}
		br.close();
		
		for(int i=0; i<n; i++) { // 입력받은 정수들이 기준점 x보다 작다면 출력하기위한 반복문
			if(arr[i] < x) { // 위에 반복문에서 배열에 값을 다 넣어줬고 그 배열 인덱스안의 값이 x보다 작다면 if문이 실행된다
				bw.write(arr[i] + " "); // 출력문을 통해 그 조건이 충족한 배열의 값을 출력한다. 그리고 출력문의 예시대로 공백을 추가해 구분해준다.
			}
		}
		bw.flush();
		bw.close();
		
	}

}
