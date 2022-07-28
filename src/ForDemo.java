
public class ForDemo {
	public static void main(String[] args) {
//		for (int su = 1; su <= 10;  su++) {
//			System.out.print(su + "\t");
//		}

//		for (int su = 10; su > 0;  su--) {
//			System.out.print(su + "\t");
//		}
		
//		for(int i=1; i<=20; i++){
//			if(i%3==0)
//			System.out.print(i+"\t");
//		}		
		
		//20부터 180까지 숫자를 출력하되 7의 배수를 출력 하되 한 줄에 5개씩만 출력하시오.
		int count =0;
		for(int i=20; i<=180; i++) {
			if(i%7==0) {				
				System.out.print(i+"\t");
					count++;
					if(count%5==0)System.out.println();
			}
		}
	}
}
