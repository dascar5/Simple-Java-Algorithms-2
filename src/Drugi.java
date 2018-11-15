import java.util.Scanner;
public class Drugi {

	public static void main(String[]args){
		int a, sum=0, br=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Unesite broj: ");
		a=s.nextInt();
		while(a !=0){
			if(a%3==0 && a%5!=0){
				sum+=a;
				br++;
			}
			System.out.println("Unesite broj: ");
			a=s.nextInt();
		}
		float AS= sum/br;
		System.out.println("Aritmeticka sredina je: " +AS);
	}
}


