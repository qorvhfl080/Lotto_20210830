package code;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

//		입력한 6개의 숫자를 저장할 배열
		int[] inputNumbers = new int[6];

//		6개의 숫자에 Scanner를 이용해서 숫자 입력
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < inputNumbers.length; i++) {

			while (true) {
				System.out.print((i + 1) + "번째 숫자 입력 : ");
				int num = sc.nextInt();
				
				boolean isRangeOk = 1 <= num && num <= 45;
				boolean isDuplOk = true;
				for (int input : inputNumbers) {
					if (num == input) {
						isDuplOk = false;
						
						break;
					}
				}
				
				if (isRangeOk && isDuplOk) {
					inputNumbers[i] = num;
					
					break;
				} else {
					if (!isRangeOk)
						System.out.println("범위가 맞지 않습니다");
					else if (!isDuplOk)
						System.out.println("중복입니다.");
					else 
						System.out.println("숫자를 입력하세요");
					System.out.println("다시 입력해주세요 : ");
				}
				
			}

		}
		sc.close();
		
		int[] winNumbers = new int[6];
		for (int i = 0; i < winNumbers.length; i++) {
			
//			1 ~ 45
			int randomNum = (int)(Math.random() * 45) + 1;
			boolean isDulOk = true;
			
			for (int winNum : winNumbers) {
				if (randomNum == winNum) {
					isDulOk = false;
					
					break;
				}
			}
			
			if (isDulOk) {
				winNumbers[i] = randomNum;
				
				break;
			}
		}
		
		for (int i = 0; i < winNumbers.length; i++) {
			for (int j = 0; j < winNumbers.length - 1; j++) {
				if (winNumbers[j] > winNumbers[j + 1]) {
					int t = winNumbers[j];
					winNumbers[j] = winNumbers[j + 1];
					winNumbers[j + 1] = t;
				}
			}
		}
		
		for (int winNum : winNumbers) {
			
			System.out.print(winNum + " ");
		}
		System.out.println();
		
		int correctNumCount = 0;
		
		for (int myNum : inputNumbers) {
			
			for (int winNum : winNumbers) {
				
				if (myNum == winNum) {
					correctNumCount++;
				}	
			}
		}
		
		switch (correctNumCount) {
		case 6:
			System.out.println("1등 - 10억원");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 4:
			System.out.println("3등 - 2백만원");
			break;
		case 3:
			System.out.println("4등 - 5만원");
			break;
		case 2:
			System.out.println("5등 - 5천원");
			break;
		default:
			System.out.println("낙첨입니다.");
			break;
		}
		
	}
	
}
