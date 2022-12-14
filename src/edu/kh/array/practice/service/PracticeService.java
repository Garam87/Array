package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
	
		int[] arr = new int[9];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.printf("\n짝수 번째 인덱스 합: %d", sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i ;
			System.out.print(arr[i] + " ");
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.printf("\n홀수 번째 인덱스 합: %d", sum);

	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + " ");
		}
		
	}
	
	public void practice4() {
		int[] input = new int[5];
		
		for(int i = 0; i < input.length; i++) {
			System.out.print("입력 " + i + ": ");
			input[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int search = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i < input.length; i++) {
			if(search == input[i]) {
				System.out.println("인덱스 : " + i);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		char[] arr = new char[input.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		int count = 0;
		String index = "";
		System.out.print("문자 : ");
		char input2 = sc.nextLine().charAt(0);
		for(int i = 0; i < arr.length; i++) {
			if(input2 == arr[i]) {
				index += i + " ";
				count++;
			}
		}
		System.out.println(input + "에 i가 존재하는 위치(인덱스): " + index);
		if(count > 0) {
			System.out.println("i 개수 : " + count);
		} else {
			System.out.println("일치하는 문자가 없습니다.");
		}
	}
	
	public void practice6() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
			
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7() {
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		char[] arr = new char[input.length()];
		for(int i = 0; i < arr.length; i++) {
			if(i >= 8) {
				arr[i] = '*';
				System.out.print(arr[i]);
			} else {
				arr[i] = input.charAt(i);
				System.out.print(arr[i]);
			}
				
		}
	}
	
	public void practice8() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		if(input < 3 || input % 2 == 0) {
			System.out.println("다시 입력하세요.");
		} else {
			int[] arr = new int[input];
			for(int i = 0; i < arr.length; i++) {
				if(i > arr.length / 2) {
					arr[i] = arr.length - i;
					System.out.print(arr[i] + " ");
				} else {
					arr[i] = i + 1;
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
		
	public void practice9() {
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice10() {
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		int max = 1;
		int min = 10;
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("\n최대값 : " + max);
		System.out.print("\n최소값 : " + min);
	}

	public void practice11() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
			
	}
		
	public void practice12() {
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			int lotto = (int)(Math.random() * 45 + 1);
			arr[i] = lotto;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void practice13() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		int count = 0;

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			
			boolean flag = true;
		
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i])
					flag = false;
			}
			
			if (flag) {
				if (i == 0)
					System.out.print(arr[i]);
				else
					System.out.print(", " + arr[i]);
	                
				count++;
			}
		}

		System.out.println("\n문자 개수 : " + count);
		
				
		
	}
	
	public void practice14() {

		System.out.print("배열의 크기를 입력하세요 : ");
		String[] arr = new String[sc.nextInt()];
		sc.nextLine();
		
		int index = 0;
		
		while (true) {
			for (int i = index; i < arr.length; i++) {
				System.out.print(i + 1 + "번째 문자열 : ");
				arr[i] = sc.nextLine();
			}
			
			index = arr.length;

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char plus = sc.next().charAt(0);

			if (plus == 'Y' || plus == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				String[] arr2 = new String[arr.length + sc.nextInt()];
				sc.nextLine();
				
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;
				
			} else if (plus == 'N' || plus == 'n') {
				System.out.println(Arrays.toString(arr));
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

		}
	}
}
