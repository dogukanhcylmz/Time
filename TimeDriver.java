import java.util.Scanner;

public class TimeDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int hours = scan.nextInt();
		int minutes = scan.nextInt();
		int seconds = scan.nextInt();
		Time t1 = new Time(hours, minutes, seconds);

		hours = scan.nextInt();
		minutes = scan.nextInt();
		seconds = scan.nextInt();
		Time t2 = new Time(hours, minutes, seconds);

		Time t3 = new Time();

		t3 = t1.add(t2);

		System.out.println("t1 " + t1);
		System.out.println("t2 " + t2);
		System.out.println("t3 " + t3);
		
		if(t1.compareTo(t2)<0)
			System.out.println("t1 is lesser than t2");
		else if(t1.compareTo(t2)>0)
			System.out.println("t1 is greater than t2");
		else 
			System.out.println("t1 is equal to t2");
		
		
		
		
		

		scan.close();
	}

}
