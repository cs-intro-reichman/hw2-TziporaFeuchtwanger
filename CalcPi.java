public class CalcPi {
public static void main(String [] args) { 
	 
int t = Integer.parseInt(args[0]);
double frac;
double sum = 0;

for (int i = 1; i <= t*2; i += 2 )	{
	frac = (double) 1/i;

	if ((i + 1) % 4 == 0)  { sum -= (double)frac; }
	else				   { sum += (double)frac; }
}

System.out.println("pi according to Java: "+Math.PI);
System.out.println("pi, approximated:     "+(double)sum*4); 
 }
}