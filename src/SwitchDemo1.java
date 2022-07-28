import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신은 어느 계절을 좋아하시나요(spring/ summer/ fall / winter)?:");
		String season = sc.nextLine();
		String flowers = (season.equals("spring")) ? "진달래,개나리"
				: (season.equals("summer")) ? "장미,아카시아"
						: (season.equals("fall")) ? "코스모스, 백합" : (season.equals("winter")) ? "동백,매화" : "그런 계절은 없습니다";
		System.out.println(flowers);

		if (season.equals("spring")) {
			System.out.println("진달래,개나리");
		} else if (season.equals("summer")) {
			System.out.println("장미,아카시아");
		} else if (season.equals("fall")) {
			System.out.println("코스모스,백합"); // 년도와 월을 입력받아 마지막날을 출력하라
		} else if (season.equals("winter"))
			System.out.println("동백,매화");

		switch (season)
		{
		case "spring":
			System.out.println("진달래,개나리");
			break;
		case "summer":
			System.out.println("장미,아카시아");
			break;
		case "fall":
			System.out.println("코스모스,백합");
			break;

		case "winter":
			System.out.println("동백,매화");
			break;

		default:
			System.out.println("그런 계절은 없습니다");
		}
	}
}
