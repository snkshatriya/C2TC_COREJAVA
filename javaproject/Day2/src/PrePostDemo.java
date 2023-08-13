public class PrePostDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=10;
		int d,e;
		a++;
		d=(c++)+a+(b--);
		System.out.println(d);
		e=(++a)+b+(a--);
		System.out.println(e);
	}

}
