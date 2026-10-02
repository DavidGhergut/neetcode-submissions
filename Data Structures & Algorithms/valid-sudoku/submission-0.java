class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board == null) return false;

        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet();

            for (int j = 0; j < 9; j++) {
                if (set.contains(board[i][j])) return false;
                if (board[i][j] == '.') continue;
                set.add(board[i][j]);
            }
        }

        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet();

            for (int i = 0; i < 9; i++) {
                if (set.contains(board[i][j])) return false;
                if (board[i][j] == '.') continue;
                set.add(board[i][j]);
            }
        }

        for (int k = 0; k < 9; k++) {
            Set<Character> set = new HashSet();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int x = k / 3 * 3 + i;
                    int y = k % 3 * 3 + j;

                    if (set.contains(board[x][y])) return false;
                    if (board[x][y] == '.') continue;
                    set.add(board[x][y]);
                }
            }
        }

        return true;
    }
}
