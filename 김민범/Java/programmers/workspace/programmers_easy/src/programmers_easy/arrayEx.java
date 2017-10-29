package programmers_easy;

public class arrayEx {

	public static void  main(String[] args) {
		
		int[] array1 = new int[100];
		
		array1[0] = 50;
		array1[10] = 100;
		
		for(int i = 0; i < array1.length; i++)
		{
			array1[i] = i+1;
			System.out.println(array1[i]);
		}
		
		int sum = 0;
		
		for(int i = 0; i < array1.length; i++)
		{	
			sum += array1[i];
		}
		
		System.out.println(sum);
	}
}
