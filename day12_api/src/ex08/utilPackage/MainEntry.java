package ex08.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); //system이 갖고 있는 날짜 얻어옴
		//java.util.GregorianCalendar[time=1681345650060,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=103,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=27,SECOND=30,MILLISECOND=60,ZONE_OFFSET=32400000,DST_OFFSET=0]
		System.out.print(c.get(Calendar.YEAR)+"년 "); // 원하는 것만 뽑아오기
		System.out.print(c.get(Calendar.MONTH)+1+"월 "); // 월은 0부터 시작 (나머진 1부터 시작)
		System.out.print(c.get(Calendar.DATE)+"일");
 
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
			System.out.println("현재시간은 " + h + " : " + m + " " + s);
//		System.out.println(c);
			
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			
			c2.set(2018,12,20, 0,0);
			
			if(c1.after(c2)) {
				System.out.println("현재 시간은 2018년 1월 1일 이후 입니다");
			}else if ( c1.before(c2)) {
				System.out.println("현재 시간은 2018년 1월 1일 이전 입니다");
	
			}if(c1.equals(c2)) {
				System.out.println("현재 시간은 2018년 1월 1일 입니다");

			}
	}

}
