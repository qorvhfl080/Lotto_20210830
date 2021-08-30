package code;

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
			
			while (true) {
				
				boolean isDulOk = true;
				
				if (isDulOk) {
					
					break;
				}
				
			}
			
		}

	}

}
