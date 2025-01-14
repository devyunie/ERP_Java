package chapter3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Package3 {

	public static void main(String[] args) {
		//Ramdom 클래스 : 난수를 생성하는 클래스
		Random random = new Random();
		System.out.println(random.nextInt());
		//범위 제약
		System.out.println
		(random.nextInt(3));// 0~2까지 난수 생성
		System.out.println(random.nextInt(3)+1); //1-3까지 생성
		
		//seed 지정
		random = new Random(1);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(45));
		
		//UUID : 고유한 식별자를 만들기 위해 사용하는 랜덤한 문자열
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		
		//Date 클래스 : 날짜를 다루는 메서드
		//Date의 클래스의 대부분 메서드는 java1.1부터 사용안하는걸 권장
		
		Date dateNow = new Date();
		System.out.println(dateNow);
		System.out.println(dateNow.getDate());
//		LocalDateTime클래스 : java8부터 date를 대체
//		LocalDate 클래스, LocalTime 클래스 LocalDateTime 클래스 
		
		LocalDateTime now = LocalDateTime.now();
		
		//특정 날짜 및 시간의 인스턴스 생성
		LocalDateTime date1 = LocalDateTime.of(2024, 7 ,9,9,30,0);
		System.out.println(date1);
		//특정 날짜 및 시간의 요소
		//getXXX();
		int month = now.getMonthValue();
		System.out.println(month);
		
		int day = now.getDayOfMonth();
		System.out.println(day);
		
		//특정 날짜 및 시간의 요소 변
		//withXXX():
		//인스턴스가 직접 변경되지 않고 변경한 값을 반환
		now = now.withYear(2025).withHour(21);
		System.out.println(now);
		//날짜 및 시간 계산
		//특정요소에 값을 더하거나 빼기
		//plusXXX();, minus();
		//인스턴스가 직접 변경되지 않고 변경된 값을 반환
		now = now.plusDays(20).minusHours(22);
		System.out.println(now);
		
		//LocalDateTime을 Date로 변경
		//Date 클래스의 from 메서드를 이용
		Date localToDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(localToDate);
		
		//Date를 LocalDateTime으로 변
		//Date 인스턴스의 toInstant, toLocalDateTime();
		
		LocalDateTime dateToLocal = 
				localToDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(dateToLocal);
		
//		Date를 String으로 변경
		//SimpleDateFormat 클래스를 사용하여 지정한 포멧의 문자열로 변경 가능
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
////		/String  stringDate = SimpleDateFormat.format(dateNow);
//		System.out.println(stringDate);
		
		//y: 연 M:월 d 일 a 오전오후 H시간(24시간) h(12시간)
		
		//오전 10:23 2024-07-07
		SimpleDateFormat computerFormat = new SimpleDateFormat("a hh:mm yyyy-MM-dd");
		String computerDate = computerFormat.format(dateNow);
		System.out.println(computerDate);
		
		//LocalDateTime을 String으로 변경
		
		computerDate = now.format(DateTimeFormatter.ofPattern("a hh:mm yyyy-MM-dd"));
		System.out.println(computerDate);
		
		
		
		
		
	}

}
