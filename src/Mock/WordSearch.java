package Mock;
/*Problem:
Given a 2D board and a list of words, return all words present in the board.

*Words can be formed by adjacent letters (horizontal/vertical)
*Same cell cannot be reused

Board:
[
 ["o","a","a","n"],
 ["e","t","a","e"],
 ["i","h","k","r"],
 ["i","f","l","v"]
]

Words = ["oath","pea","eat","rain"]

Output: ["oath","eat"]
 */

/*Assumptions:
 We will return empty list if words cannot be matched.
 same cell cannot be reused for the same word, but for other word, we can reuse the cell
 That would mea, interlinked words are accepted in the board
 The input board is a char board
 Input consists of alphanumeric only



 */

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class WordSearch {
    public List<String> wordsInTheBoard(char[][] board, List<String> words){
        List<String> ans = new ArrayList<>();
        int m = board.length;
        int n = board[0].length;
        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                freq.put(board[i][j], freq.getOrDefault(board[i][j],0)+1);
            }
        }
        Map<Character, List<int[]>> charMap = new HashMap<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                char c = board[i][j];
                if(charMap.containsKey(c)){
                    charMap.get(c).add(new int[]{i, j});
                } else {
                    List<int[]> list = new ArrayList<>();
                    list.add(new int[]{i, j});
                    charMap.put(c, list);
                }
            }
        }
        for(String word:words){
            if(!checkFreqMatch(freq, word)) continue;
            char c = word.charAt(0);
            List<int[]> rc = charMap.get(c);
            for(int[] start:rc) {
                if (wordPresent(board, word, 0, start[0], start[1])) {
                    ans.add(word);
                    break;
                }
            }
        }
        return ans;
    }

    public boolean checkFreqMatch(Map<Character, Integer> freq, String word){
        Map<Character, Integer> wordFreq = new HashMap<>();
        for(char c:word.toCharArray()){
            wordFreq.put(c, wordFreq.getOrDefault(c,0)+1);
            if(wordFreq.get(c)>freq.getOrDefault(c, 0)) return false;
        }
        return true;
    }
    public boolean wordPresent(char[][] board, String word, int idx, int row, int column){
        if(idx==word.length()) return true;
        if(board[row][column]!=word.charAt(idx)) return false;
        if(idx == word.length() - 1) return true;

        char temp = board[row][column];
        board[row][column] = '#';
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int m = board.length;
        int n = board[0].length;
        for(int[] dir: dirs){
            int nr = row+dir[0];
            int nc = column+dir[1];
            if(nr>=0 && nc>=0 && nr<m && nc<n &&
                wordPresent(board, word, idx+1, nr, nc)){
                board[row][column] = temp;
                return true;
            }
        }

        board[row][column] = temp;
        return false;
    }

    public static void main(String[] args) {
        WordSearch obj = new WordSearch();
        char[][] board = {{'o', 'a', 'a', 'n'},
                          {'e', 't', 'a', 'e'},
                          {'i', 'h', 'k', 'r'},
                          {'i', 'f', 'l', 'v'}};
        List<String> words = new ArrayList<>();
        words.add("oath");
        words.add("pea");
        words.add("eat");
        words.add("rain");


        char[][] board1 = {{'a'}};
        List<String> words1 = new ArrayList<>();
        words1.add("a");
        System.out.println(obj.wordsInTheBoard(board, words));
        System.out.println(obj.wordsInTheBoard(board1, words1));
    }
}

/*Sample Output:
[oath, eat]
[a]
 */
