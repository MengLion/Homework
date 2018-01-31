package homework0124;

public class sanweishu {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		for(a=1;a<=4;a++) {
			for(b=1;b<=4;b++) {
				for(c=1;c<=4;c++) {
					if(a!=b&&a!=c&&b!=c) {
						System.out.println(a*100+b*10+c);
					}
					
				}
			}
		}
	}

}
