package homework0124;

public class Hwenshu {
	public static void main(String[] args) {
		int i=12321;
		int a=i/10000;
		int b=i%10000/1000;
		int c=i%1000/100;
		int d=i%100/10;
		int e=i%10;
		if(a==e&&b==d) {
			System.out.println("回文数");
			
			}
		else {
			System.out.println("不是回文数");
		}
		}
	}


