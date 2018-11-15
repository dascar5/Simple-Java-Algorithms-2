import java.util.Scanner;
public class Treci {

	   public static void main(String args[])
	   {
	      int n, obrni = 0;
	         
	      System.out.println("Unesi broj za obrcanje");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	         
	      while(n != 0)
	      {
	          obrni = obrni * 10;
	          obrni = obrni + n%10;
	          n = n/10;
	      }
	       
	      System.out.println("Obrnuti broj od unosa je " + obrni);
	   }
	}
/*profesor
	public static void main(String[]args){
		int N, N1=0, cif;
		Scanner s=new Scanner(System.in);
				
		System.out.println("Unesite broj: ");
		N=s.nextInt();
		
		while(N!=0){
			cif=N%10;
			N1=N1*10+cif;
			N/=10;
		}
		System.out.println("Obrnuti redosled je " +N1);
		}
	}
*/