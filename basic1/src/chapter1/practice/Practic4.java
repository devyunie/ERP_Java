package chapter1.practice;

import java.util.Scanner;

public class Practic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//모두 대문자로 만들기
		//사용자로부터 문자열 statment를 입력받고
		//입력 받은 문자열을 영어라면 모두 대문자로 변경하여
		//문자배열에 저장한 후 출력 //32
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String statment = scanner.nextLine();
		
		char[] statmentCahrs = statment.toCharArray();
		
		for(int index = 0; index < statmentCahrs.length ; index++) {
			char charater =statmentCahrs[index];
			boolean lowerEnglinsh = charater >= 97 && charater <= 122;
			if(!lowerEnglinsh) continue;
			
			
			statmentCahrs[index] = (char)(charater-32);
		}
		System.out.println(statmentCahrs);
	}

}
