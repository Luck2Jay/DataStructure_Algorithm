
public class Factorial {

	public static int facByRep(int n) { // 반복을 이용
		int fac = 1;
		for(int i = n ; i>0;i--) {
			fac *= i;
		}
		return fac;
	}
	
	public static int facByRecurs(int n) { // 재귀 이용
		if(n==1) {
			return 1;
		}else
			return n*facByRecurs(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Use Repeat 6! : " + facByRep(6));
		System.out.println("Use Recursive 6! : " + facByRecurs(6));
	}

}
