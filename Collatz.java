// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	
		int n = Integer.parseInt(args[0]);
		int counter ;
		String vORc = args[1];	
		

		if ( vORc.equals("v") )
		{
			for ( int i = 1; i <= n; i++ ) {
				counter = 1;
				//if ( vORc == "v" ){
				System.out.print(i+" ");
				int num = i;
				do  {
					if ( num % 2 == 0 ) {
						num /=  2;
						}
					else {
						num = num * 3 + 1;
						}
				System.out.print(num+" ");//
				counter ++ ;
				}
				while (num != 1);
				System.out.println("("+counter+")" );}
			System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");
		}
		else
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
 }  
}
