package ex02.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException {
//		URL url = new URL("https://www.google.com/search?q=giraffe&sxsrf=APwXEdckKyUlvIy-w3NQT3OQwfWVPcv7mQ:1682313823861&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjuwPyu48H-AhWbZ94KHZ1PB2cQ_AUoAXoECAMQAw&biw=851&bih=428&dpr=1.5"); //
		URL url = new URL("https://search.naver.com/search.naver?where=image&sm=tab_jum&query=koala");
		//		https://www.google.com/
		//		search?
		//		q=giraff // 속성 = 값&속성 = 값2&속성 = 값3...
		//		&sxsrf=APwXEdckKyUlvIy-w3NQT3OQwfWVPcv7mQ:1682313823861
		//		&source=lnms
		//		&tbm=isch&sa=X
		//		&ved=2ahUKEwjuwPyu48H-AhWbZ94KHZ1PB2cQ_AUoAXoECAMQAw&biw=851
		//		&bih=428&dpr=1.5


// URL이 갖고 있는 함수를 사용
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트와 프로토콜 : " + url.getAuthority());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질의 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
		System.out.println("참조 : " + url.getRef());
	}

}
