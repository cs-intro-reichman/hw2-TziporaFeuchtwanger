public class TimeCalc {
    public static void main(String[] args) {  
        int h = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int m = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));   
        //System.out.println("hours:"+h);                           //sanity check
        int addMin = Integer.parseInt(args[1]);
    
        int addH = addMin / 60;
        addMin = addMin % 60;
       
        m += addMin;                                               //adds to itself
        if (m >= 60){
            m -= 60;
            h ++;                                                    // plus 1
        }

        h += addH;
        h %= 24;                                                       // %himself
        if (h < 10){
             System.out.print("0");
        }
        System.out.print(h+":"); 

        if (m < 10){
            System.out.print("0");
        }
        System.out.print(m);

        
        
        //% java TimeCalc1 09:30 1475
        
    }
}
