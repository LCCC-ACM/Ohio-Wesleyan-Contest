import java.util.*;

class B {
    static int n;
    static char[][] grid = new char[1001][1001];
    static boolean[][] wasPaired = new boolean[1001][1001];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int pairs;
    
    static final char GOOD = 'G';
    static final char BAD = 'B';
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseNum = 0;
        n = input.nextInt();
        while (n != 0) {
            caseNum++;
            pairs = 0;
            for (int i = 0; i < n; i++) {
                int r = input.nextInt();
                int c = input.nextInt();
                grid[r][c] = GOOD;
            }
            
            for (int i = 0; i < n; i++) {
                int r = input.nextInt();
                int c = input.nextInt();
                grid[r][c] = BAD;
            }
            
            if (findMatch(0, 0)) {
                System.out.printf("Case %d: Possible\n", caseNum);
            } else {
                System.out.printf("Case %d: Not possible\n", caseNum);
            }
            
            n = input.nextInt();
            clear();
        }
    }
    
    static void clear() {
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                grid[i][j] = ' ';
                wasPaired[i][j] = false;
            }
        }
    }
    
    static boolean canPair(int r, int c, int d) {
        if (r + dy[d] < 0
            || c + dx[d] < 0
            || r + dy[d] > 1000
            || c + dx[d] > 1000) {
            return false;
        }
        
        if (grid[r + dy[d]][c + dx[d]] == BAD
                && !wasPaired[r + dy[d]][c + dx[d]]) {
            return true;
        }
        
        return false;
    }
    
    static boolean findMatch(int rIn, int cIn) {
        if (pairs == n) {
            return true;
        }
        
        for (int r = rIn; r < 1001; r++) {
            for (int c = cIn; c < 1001; c++) {
                if (grid[r][c] == GOOD) {
                    for (int d = 0; d < 4; d++) {
                        if (canPair(r, c, d)) {
                            int badR = r + dy[d];
                            int badC = c + dx[d];
                            wasPaired[badR][badC] = true;
                            pairs++;
                            
                            if (c == 1000) {
                                if (findMatch(r + 1, 0)) return true;
                            } else {
                                if (findMatch(r, c + 1)) return true;
                            }
                            
                            wasPaired[badR][badC] = false;
                            pairs--;
                        }
                    }
                    
                    return false;
                }
            }
            
            cIn = 0;
        }
        
        return true;
    }
}