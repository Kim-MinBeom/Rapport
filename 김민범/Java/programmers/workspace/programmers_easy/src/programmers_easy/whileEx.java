package programmers_easy;

import java.util.Scanner;

public class whileEx {
	public static void  main(String[] args) {
		
		int i = 0;
		
		while(i<10)
		{
			System.out.println(i);
			i += 1;
		}
		
		i = 1;
		
		int total = 0;
		
		while(i<=100)
		{
			total += i;
			i++;
		}
		
		System.out.println(total);
		
		// do while

		int value = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			// �ݺ��� �����
			value = scan.nextInt();
			System.out.println("�Է¹��� �� :  " + value);
		} while(value != 10);
		
		System.out.println("�ݺ� ����");
		
	}
}
