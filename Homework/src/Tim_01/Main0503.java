package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main0503 {
	static int [] arr, amm;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());		
		StringTokenizer stn = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringTokenizer stm = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		for ( int i = 0; i < n; i++ ) {
			arr[i] = Integer.parseInt(stn.nextToken());
		}
		Arrays.sort(arr);
		
		amm = new int[m];
		for(int i=0; i< m; i++) {
			amm[i] = Integer.parseInt(stm.nextToken());
		}
		
		for(int i=0; i<m; i++) {
			System.out.println(findNum(amm[i], 0, n-1));
		}
	}
	
	private static int findNum(int num, int start, int end) {
		int answer = 0;
		int mid;
		while(start <= end) {
			mid = (start + end) / 2;
			if(arr[mid] > num) {
				end = mid - 1;
			} else if(arr[mid] < num) {
				start = mid + 1;
			} else {
				answer = 1;
				break;
			}
		}
		return answer;


		}
	}

