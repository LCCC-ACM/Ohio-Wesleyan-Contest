import java.util.*;

class C {
    
    static int n;
    static int m;
    static int p;
    static int s;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        s = input.nextInt();
        n = input.nextInt();
        p = input.nextInt();
        m = input.nextInt();
        
        int caseNum = 0;
        
        while (s != 0) {
            double rem = ((double) s) / n;
            int count = (n * p) / 100;
            caseNum++;
            int result = 1;
            
            if (n == 0) {
                result = 0;
                System.out.printf("Case %d: %d\n", caseNum, result);
                
                s = input.nextInt();
                if (s == 0) break;
                n = input.nextInt();
                p = input.nextInt();
                m = input.nextInt();
                
                continue;
            }
            
            while (haveSolution(rem, count)
                   && rem > 0
                   && count > 0) {
                rem = rem / count;
                count = (count * p) / 100;
                result ++;
            }
            
            System.out.printf("Case %d: %d\n", caseNum, result);
            
            s = input.nextInt();
            if (s == 0) break;
            n = input.nextInt();
            p = input.nextInt();
            m = input.nextInt();
        }
    }
    
    static boolean haveSolution(double rem, int count) {
        return (rem / count) >= m;
    }
}