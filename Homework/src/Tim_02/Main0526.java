package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1546
public class Main0526 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Double[] score = new Double[N];
		Double highscore = 0.0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i <  N ; i++ ) {
			score[i] = Double.parseDouble(st.nextToken());
			highscore = Math.max(highscore, score[i]);
		}
		Double sum = 0.0;
		Double avg = 0.0;
		for (int i = 0; i < N; i++ ) {
			sum += score[i]/highscore*100.0;
		}
		avg = sum/N;
		System.out.println(avg);
	}
}
