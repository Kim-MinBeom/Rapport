package programmers_easy;

public class arrayEx2 {

	public static void  main(String[] args) {
		
		int[][]array2 = new int[3][4];
		array2[0][0] = 10;
		
		int[][]array3 = new int[3][];
		array3[0] = new int[1];
		array3[0][0] = 10;
		array3[1] = new int[2];
		array3[2] = new int[3];
		
		int[][] array4 = {{1},{1,2},{1,2,3}};
		
		System.out.println(array4[0][0]);
		System.out.println(array4[2][2]);
		
	}
}
