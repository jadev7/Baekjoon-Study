package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Exam15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		for(int i=0;i<testCase;i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
	         
			 bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()))+"\n");
			 bw.flush();
		}
	}
}
