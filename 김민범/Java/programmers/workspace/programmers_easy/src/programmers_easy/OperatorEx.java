package programmers_easy;

public class OperatorEx {

	public static void  main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		System.out.println(!b1);
		System.out.println(b1 ^ b2);
		System.out.println(b1 ^ b3);
		
		int score = 69;
		if(score <= 100 && score >= 70)
		{
			System.out.println("����");
		} else
		{
			System.out.println("����");
		}
	}
}
