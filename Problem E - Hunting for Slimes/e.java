import java.util.*;

public class e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int caseNum = 1;
        
        while (true) {
            int n = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            
            if (n == 0) break;
            
            int mostX = 1;
            int currentN = x - 1;
            while (currentN > 0) {
                currentN -= n;
                mostX++;
            }
            int mostY = 1;
            currentN = y - 1;
            while (currentN > 0) {
                currentN -= n;
                mostY++;
            }
            int mostZ = 1;
            currentN = z - 1;
            while (currentN > 0) {
                currentN -= n;
                mostZ++;
            }
            
            int leastX = 0;
            currentN = x;
            while (currentN > 0) {
                currentN -= n;
                leastX++;
            }
            int leastY = 0;
            currentN = y;
            while (currentN > 0) {
                currentN -= n;
                leastY++;
            }
            int leastZ = 0;
            currentN = z;
            while (currentN > 0) {
                currentN -= n;
                leastZ++;
            }
            
            System.out.printf("Case %d: Min %d, Max %d\n", caseNum++, leastX*leastY*leastZ, mostX*mostY*mostZ);
        }
    }
}