package programmers_easy;

public class SwitchEx {
	public static void  main(String[] args) {
		
		// switch, case, default, break
		
		int value = 2;
		
		switch(value)
		{
			case 1 : 
				System.out.println("1");
				break;
			case 2 : 
				System.out.println("2");
				break;
			case 3 : 
				System.out.println("3");
				break;
			default : 
				System.out.println("그 외 다른 숫자");
		}
		
		int value_2 = 2;
		
		switch(value_2)
		{
			case 1 : 
				System.out.println("1");
			case 2 : 
				System.out.println("2");
			case 3 : 
				System.out.println("3");
			default : 
				System.out.println("그 외 다른 숫자");
		}
		
		// 문자는 jdk 7이상부터 가능함
		String str = "A";
		switch(str)
		{
			case "A" : 
				System.out.println("1");
				break;
			case "B" : 
				System.out.println("2");
				break;
			case "C" : 
				System.out.println("3");
				break;
			default : 
				System.out.println("그 외 다른 숫자");
		}
		
		//month에는 현재 월이 들어 있습니다.
	    int month = 10;
	    String season = "";
	    
	    //다음과 같이 case문을 한번에 사용하면 더 짧게 코드를 짤 수 있습니다.
	    switch(month){
	      case 1:
	      case 2:
	      case 12:
	        season = "겨울";
	        break;
	      case 3:
	      case 4:
	      case 5:
	        season = "봄";
	        break;
	      case 6:
	      case 7:
	      case 8:
	        season = "여름";
	        break;
	      case 9:
	      case 10:
	      case 11:
	        season = "가을";
	        break;        
	        
	    }

	    System.out.println("지금은 "+ month +"월이고, "+ season +"입니다.");
	}
}
