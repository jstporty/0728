
public class 성적관리프로그램 {
	public static void main(String[] args) {
		Student jimin = new Student();
		jimin.hakbun = "2022001";
		jimin.name = "한지민";
		jimin.kor = 100;
		jimin.eng = 89;
		jimin.mat = 78;

		jimin.tot = jimin.kor + jimin.eng + jimin.mat;
		jimin.avg = jimin.tot / 3.0;
		jimin.grade=(jimin.avg>=90&&jimin.avg<=100)?'A':
			(jimin.avg>=90)?'B':
				(jimin.avg>=70)?'C':
					(jimin.avg>=60)?'D':'F';

		if (jimin.avg>=90&&jimin.avg<=100) {
		}else if(jimin.avg>=80) {
			jimin.grade='B';
		}else if(jimin.avg>=70) {
			jimin.grade='c';
		}else if(jimin.avg>=60) {
			jimin.grade='d';
		}else{
			jimin.grade='F';
		}
		
		

		switch ((int)(jimin.avg/10)) {
		case 10:
		case 9:
			jimin.grade=('A');
			break;
		case 8:
			jimin.grade=('B');
			break;
		case 7:
			jimin.grade=('C');
			break;
		case 6:
			jimin.grade=('D');
			break;
		default:
			jimin.grade=('F');
		}
		System.out.println(jimin.grade);
	}
}
