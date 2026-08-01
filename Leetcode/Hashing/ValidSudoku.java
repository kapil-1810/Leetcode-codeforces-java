import java.util.*;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                char num = board[i][j];

                if (num == '.') {
                    continue;
                }

                int box = (i / 3) * 3 + (j / 3);

                if (rows[i].contains(num) ||
                    cols[j].contains(num) ||
                    boxes[box].contains(num)) {
                    return false;
                }

                rows[i].add(num);
                cols[j].add(num);
                boxes[box].add(num);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));
    }
}