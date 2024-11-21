
public class Cheers {
public static void main(String[] args) {

String s = args[0];
s = s.toUpperCase();
s.length();
for(int i = 0; i< s.length(); i++) {

String letter = "AEFHILMNORSX";  
if (letter.indexOf(s.charAt(i)) == -1) {
        System.out.println("Give me a  " +s.charAt(i)+": "+s.charAt(i)+"!");           
}
else{
        System.out.println("Give me an "+s.charAt(i)+": "+s.charAt(i)+"!"); 
}
}

        System.out.println("What does that spell?");

        
int times = Integer.parseInt(args[1]);

for (int j = 0; j< times; j++){

        System.out.println(s+"!!!");
}

      
        }
}
