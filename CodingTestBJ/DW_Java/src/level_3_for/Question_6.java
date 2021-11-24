package level_3_for;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Question_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
		//입력
		//첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
		
		//출력
		//첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n; i>=1; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	//5번 문제 증감식의 감소식 문제라 풀이는 따로 X

}