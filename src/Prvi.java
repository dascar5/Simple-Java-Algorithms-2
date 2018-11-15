import java.util.Scanner;
public class Prvi {

public static void main (String[]args){
	int a, br=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Unesite 5 cijelih brojeva: ");
	
	for(int i=0; i<5; i++){
		a=s.nextInt();
		if(a>=10 && a<=99)
			br++;
	}
	System.out.println("Ukupno je " +br+ " dvocifrenih brojeva");
}
}