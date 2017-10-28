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
				System.out.println("�� �� �ٸ� ����");
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
				System.out.println("�� �� �ٸ� ����");
		}
		
		// ���ڴ� jdk 7�̻���� ������
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
				System.out.println("�� �� �ٸ� ����");
		}
		
		//month���� ���� ���� ��� �ֽ��ϴ�.
	    int month = 10;
	    String season = "";
	    
	    //������ ���� case���� �ѹ��� ����ϸ� �� ª�� �ڵ带 © �� �ֽ��ϴ�.
	    switch(month){
	      case 1:
	      case 2:
	      case 12:
	        season = "�ܿ�";
	        break;
	      case 3:
	      case 4:
	      case 5:
	        season = "��";
	        break;
	      case 6:
	      case 7:
	      case 8:
	        season = "����";
	        break;
	      case 9:
	      case 10:
	      case 11:
	        season = "����";
	        break;        
	        
	    }

	    System.out.println("������ "+ month +"���̰�, "+ season +"�Դϴ�.");
	}
}
