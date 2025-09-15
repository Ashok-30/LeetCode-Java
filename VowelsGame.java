import java.util.*;

class VowelsGame {
    private static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
    private final Map<String, Boolean> memo = new HashMap<>();

    public boolean doesAliceWin(String s) {

        return canWin(s, true);
    }


    private boolean canWin(String s, boolean isAlice) {
        String key = s + "_" + isAlice;


        if (memo.containsKey(key)) return memo.get(key);

        int n = s.length();

        // Try every possible substring
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                String sub = s.substring(i, j);
                int vowelCount = countVowels(sub);

                // Check if this move is valid for the current player
                if ((isAlice && vowelCount % 2 == 1) || (!isAlice && vowelCount % 2 == 0)) {
                    // Remove substring and form new string
                    String next = s.substring(0, i) + s.substring(j);

                    // If the opponent loses after this move, current player wins
                    if (!canWin(next, !isAlice)) {
                        memo.put(key, true);
                        return true;
                    }
                }
            }
        }

        // No winning move found → current player loses
        memo.put(key, false);
        return false;
    }

    // Helper to count vowels in a substring
    private int countVowels(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        VowelsGame sol = new VowelsGame();
        System.out.println(sol.doesAliceWin("leetcoder")); // true
        System.out.println(sol.doesAliceWin("leetcode"));  // false
    }
}
