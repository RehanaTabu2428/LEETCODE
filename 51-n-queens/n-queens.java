class Solution {

    List<List<String>> answer = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        // Fill the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0, n);

        return answer;
    }

    public void solve(char[][] board, int row, int n) {

        // All queens are placed
        if (row == n) {
            addBoard(board, n);
            return;
        }

        // Try every column in this row
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                // PLACE
                board[row][col] = 'Q';

                // Go to next row
                solve(board, row + 1, n);

                // REMOVE - BACKTRACK
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }

            i--;
            j--;
        }

        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }

            i--;
            j++;
        }

        return true;
    }

    public void addBoard(char[][] board, int n) {

        List<String> current = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            current.add(new String(board[i]));
        }

        answer.add(current);
    }
}