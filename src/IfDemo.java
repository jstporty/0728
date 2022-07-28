import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
//		int jumsu = 59;
//		if(jumsu >= 60) {  //조건이 참일 경우
//			System.out.println("축하합니다. 합격입니다.");
//		}else {    //조건이 거짓일 경우
//			System.out.println("저도 유감입니다. 다음에 다시 응시해 주세요.");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 어느 계절을 좋아하시나요(spring / summer / fall / winter) ? : ");
		String season = sc.nextLine();
		if(season.equals("spring")) {  //season이 알고 있는 번지의 값이 spring과 일치합니까?
			System.out.println("진달래, 개나리");
		}else if(season.equals("summer")) {  //season이 알고 있는 번지의 값이 summer와 일치합니까?
			System.out.println("장미, 아카시아");
		}else if(season.equals("fall")) {
			System.out.println("코스모스, 백합");
		}else if(season.equals("winter")){
			System.out.println("동백, 매화");
		}else {
			System.out.println("그런 계절은 없습니다.");
		}
		
	}
}