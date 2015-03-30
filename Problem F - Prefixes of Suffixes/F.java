import java.util.*;

class F {
    static String word;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        word = input.next();
        int caseNum = 0;
        while (!word.equals("end")) {
            caseNum++;
            int result = 0;
            for (int i = 0; i < word.length(); i++) {
                result += findPrefix(i);
            }
            
            System.out.printf("Case %d: %d\n", caseNum, result);
            word = input.next();
        }
    }
    
    static int findPrefix(int index) {
        int count = 0;
        int wordIndex = 0;
        for (int i = index; i < word.length(); i++) {
            if (word.charAt(wordIndex++) == word.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        
        return count;
    }
}