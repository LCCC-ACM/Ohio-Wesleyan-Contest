import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int caseNum = 1;
        while (true) {
            int numOfTombstones = input.nextInt();
            List<Kingdom> kingdoms = new ArrayList<Kingdom>();
            List<King> kings = new ArrayList<King>();
            
            if (numOfTombstones == 0) {
                break;
            }
            
            for (int i = 0; i < numOfTombstones; i++) {
                King king = new King();
                king.startDate = input.nextInt();
                king.endDate = input.nextInt();
                kings.add(king);
            }
            
            King[] kingsArray = kings.toArray(new King[]{});
            Arrays.sort(kingsArray);
            
            kings = Arrays.asList(kingsArray);
            
            for (int i = 0; i < kings.size(); i++) {
                boolean hasBeenAdded = false;
                for (Kingdom kingdom : kingdoms) {
                    if (canAddToKingdom(kings.get(i), kingdom)) {
                        kingdom.kings.add(kings.get(i));
                        hasBeenAdded = true;
                        break;
                    }
                }
                if (!hasBeenAdded) {
                    Kingdom newKingdom = new Kingdom();
                    newKingdom.kings.add(kings.get(i));
                    kingdoms.add(newKingdom);
                }
            }
            System.out.printf("Case %d: %d\n", caseNum++, kingdoms.size());
        }
    }
    
    private static boolean canAddToKingdom(King king, Kingdom kingdom) {
        for (King kingInKingdom : kingdom.kings) {
            if (king.startDate <= kingInKingdom.endDate
                && king.endDate >= kingInKingdom.startDate) {
                return false;
            }
        }
        return true;
    }
}

class King implements Comparable {
    public int startDate;
    public int endDate;
    public int length() {
        return endDate - startDate;
    }
    
    @Override
    public int compareTo(Object o) {
        King otherKing = (King) o;
        return -(this.length() - otherKing.length());
    }
}

class Kingdom {
    public List<King> kings = new ArrayList<King>();
}