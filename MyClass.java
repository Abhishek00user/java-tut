import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    // Constructor
    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    // Getters
    public int getPlayerId() { return playerId; }
    public String getPlayerName() { return playerName; }
    public int getRuns() { return runs; }
    public String getPlayerType() { return playerType; }
    public String getMatchType() { return matchType; }
}

public class MyClass {

    // Method 1 we have to find player with lowest runs for given playerType. if no such player return 0
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int min = Integer.MAX_VALUE;
        boolean found = false;

        for(Player p : players) {
            // for ignoring case sensitivity we use equalsIgnoreCase() otherwise if we would have use equals()
            if(p.getPlayerType().equalsIgnoreCase(playerType)) {
                found = true;
                if(p.getRuns() < min) {
                    min = p.getRuns();
                }
            }
        }

        return found ? min : 0;
    }

    // Method 2
    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        // List will be of player type
        List<Player> list = new ArrayList<>();  // using list because we can have multiple players with same matchType

        for(Player p : players) {
            if(p.getMatchType().equalsIgnoreCase(matchType)) {
                list.add(p);
            }
        }

        if(list.size() == 0) return null;

        // Sort descending by playerId
        Collections.sort(list, (a, b) -> b.getPlayerId() - a.getPlayerId());  // for ascending we a.getPlayerId() - b.getPlayerId()

        return list.toArray(new Player[0]);  // converting to array and returning
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[4];

        for(int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // 🔥 important

            String name = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();  // 🔥 important

            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            players[i] = new Player(id, name, runs, playerType, matchType);  // creating array of player objects
        }

        String searchPlayerType = sc.nextLine();
        String searchMatchType = sc.nextLine();

        // Method 1 call
        int result1 = findPlayerWithLowestRuns(players, searchPlayerType);

        if(result1 > 0) {
            System.out.println(result1);
        } else {
            System.out.println("No such player");
        }

        // Method 2 call
        Player[] result2 = findPlayerByMatchType(players, searchMatchType);

        if(result2 != null) {
            for(Player p : result2) {
                System.out.println(p.getPlayerId());
            }
        } else {
            System.out.println("No Player with given matchType");
        }

        sc.close();
    }
}