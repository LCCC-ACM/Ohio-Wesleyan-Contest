import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String num, den;
        int caseNum = 1;
        while (true) {
            num = input.next();
            den = input.next();
            
            if (num.equals("0") && den.equals("0")) break;
            
            double result = (double) Integer.valueOf(num) / (double) Integer.valueOf(den);
            
            int smallestMatch = 10;
            
            int i = 0;
            for (char n : num.toCharArray()) {
                int j = 0;
                for (char d : den.toCharArray()) {
                    StringBuilder numSB = new StringBuilder(num);
                    StringBuilder denSB = new StringBuilder(den);
                    if (n == d) {
                        numSB.deleteCharAt(i);
                        denSB.deleteCharAt(j);
                        
                        double newResult = (double) Integer.valueOf(numSB.toString()) / (double) Integer.valueOf(denSB.toString());
                        
                        if (newResult == result) {
                            if (smallestMatch > (n - '0')) {
                                smallestMatch = (n- '0');
                            }
                        }
                    }
                    j++;
                }
                i++;
            }
            
            if (smallestMatch == 10) {
                System.out.printf("Case %d: Not possible\n", caseNum++);
            } else {
                System.out.printf("Case %d: %d\n", caseNum++, smallestMatch);
            }
        }
    }
}