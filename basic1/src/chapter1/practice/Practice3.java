package chapter1.practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 자르기
		// 사용자로 부터 시작 인덱스와 종료 인덱스를 입력 받고 6,8 기
		// 입력받은 시작 인덱스와 종료 인덱스까지 문자열을 잘라서
		// 자른 문자열을 출력

		// string 기능 substring을 사용하지 않고 char[]을 이용해서 작

		Scanner scanner = new Scanner(System.in);

		int startIndex = 0;
		int endIndex = 0;

		String statment = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 그림은 잘 못 그린 기린 그림이다";

		
		System.out.print("시작인덱스: ");
		startIndex = scanner.nextInt();
		System.out.print("마지막 인덱스: ");
		endIndex = scanner.nextInt();
		scanner.close();
		
		char[] statmentChars = statment.toCharArray();
		char[] resultChars = new char[endIndex - startIndex];// 마지막에서 처음을 빼서 내가 원하는 길이만큼 할당
		
		
		for (int index = 0; index < resultChars.length; index++) {
			resultChars[index] = statmentChars[startIndex+index];
		}

		System.out.println(resultChars);
	}

}
