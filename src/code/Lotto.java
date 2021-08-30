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
				
				if (isRangeOk && isDuplOk) {
					
					break;
				} else {
					System.out.println("잘못된 숫자입니다. 다시 입력해주세요");
				}
				
			}

		}

		sc.close();

	}

}
