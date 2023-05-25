package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main0524 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine().toUpperCase();
		int[] cnt = new int[26]; // 알파벳이 중복되는 횟수를 담는 배열

		int maxcnt = 0; // 최대값의 개수 
		for ( int i = 0; i < str.length(); i++ ) {
			int idx = str.charAt(i) - 'A';
			cnt[idx]++;
			
			maxcnt = Math.max(maxcnt, cnt[idx]);
		}
		// 알파벳의 인덱스에 중복되는 개수가 추가됨.
		// Mississipi 입력 -> [0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0]

		int alpcnt = 0; //
		for ( int i = 0; i < cnt.length; i++ ) {
			if ( maxcnt == cnt[i] ) alpcnt++;
			}

		if ( alpcnt >= 2 ) System.out.println("?");
		else {
			for (int i = 0; i < cnt.length; i++ ) {
				if ( maxcnt == cnt[i] ) System.out.println( (char)(i + 'A') );
			}
		}
	}
}



/*
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        HashMap<String, Integer> map = new HashMap();
        String[] strs = str.split("");
        int max = 0;
        for (String s : strs) {
            if(map.containsKey(s)) {
                map.put(s, map.get(s) +1);
            }
            else {
                map.put(s, 1);
            }
            max = Math.max(max, map.get(s));
        }

        int maxCnt = 0;
        for (String s : map.keySet()) {
            if (max == map.get(s)) {
                maxCnt++;
            }
        }

        if (maxCnt >= 2) {
            System.out.println("?");
        }
        else {
            for (String s: map.keySet()) {
                if (max == map.get(s)) {
                    System.out.println(s);
                    break;
                }
            }
        }




        int[] cntArr = new int[26];
        // [0,      0,      0,0,0,0,..]
        // [A의 갯수, B의 갯수, ....]
        int max = 0;
        for (int i=0; i<str.length(); i++) {
            int index = str.charAt(i) - 'A';
            cntArr[index]++;
            max = Math.max(max, cntArr[index]);
        }

        // 가장큰값이 하나인가 여러개인가
        int maxCnt = 0; //max 랑같은 cnt값을 갖는 알파벳의 갯수
        for (int i=0; i<26; i++) {
            if (cntArr[i] == max) {
                maxCnt++;
            }
        }
        // Max
        if (maxCnt >= 2) {
            System.out.println("?");
        }
        else {
            for (int i=0; i<26; i++) {
                if (max == cntArr[i]) {
                    System.out.println((char)());
                }
            }
        }
        
        // 한번만 하는법
        // max: 가장 많이 등장하는 알파벳의 횟수
        // maxChar:  max와 동일한 횟수로 등장하는 알파벳  초깃값을 0으로설정
        // max와 cntArr[i](i번째 알파벳이 등장하는 횟수)가 같으면 maxChar을 확인
        // maxChar이 0이라면 아직 max와 동일하게 등장하는 알파벳이 없으므로 maxChar을 ('A' + i)로 설정
        // maxChar가 0이 아니라면 (초깃값이 아니라면) 이전에 이미 max와 등장횟수가 같은 알파벳이 있었다는 것이므로 max와 동일하게 등장하는 알파벳을 여러개이다.
        // 따라서 '?'를 출력
        char maxChar = 0;
        for (int i=0; i<26; i++) {
            if (max == cntArr[i]) {
                if (maxChar != 0) {
                    System.out.println("?");
                    return;
                }
                maxChar = (char)('A' + i);
            }
        }
        System.out.println(maxChar);
    }
}
*/
