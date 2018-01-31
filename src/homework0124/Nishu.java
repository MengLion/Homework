package homework0124;

public class Nishu {
	public static void main(String[] args) {
		int i=2349;
		int a=i/1000;
		int b=i%1000/100;
		int c=i%100/10;
		int d=i%10;
		System.out.println(a*1000+b*100+c*10+d);
		System.out.println(a+b*10+c*100+d*1000);
	}

}
