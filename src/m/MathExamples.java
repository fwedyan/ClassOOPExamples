package m;
import java.util.Random;


public class MathExamples {

	public static void main(String[] args) {
		//System.out.println(Math.abs(-1));
		//System.out.println(Math.floor(-1.6));
		//System.out.println(Math.ceil(-1.6));
		Random r1 = new Random();
		//[10-20]
		for (int i=1; i<=10;i++) {
			System.out.print(10+r1.nextInt(11)+" ");
		}
		//[-12,35]
		//begining of the interval (lower edge) +r.nextInt(intervalLength)
		for (int i=1; i<=10;i++) {
			System.out.print(-12+r1.nextInt(48)+" ");
		}
		
	}

}
