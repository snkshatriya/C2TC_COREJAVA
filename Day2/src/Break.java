public class Break {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		{
			if(i<5)
//				break;//will break the current iteration and all the upcoming iterations
			continue;
			System.out.println(i);
		}

	}

}