
public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> solutions = new ArrayList<>();
//         boolean[][] board = new boolean[n][n];
//         solve(0, board, solutions);
//         return solutions;
//     }

//     private void solve(int row, boolean[][] board, List<List<String>> solutions) {
//         if (row == board.length) {
//             solutions.add(createBoard(board));
//             return;
//         }

//         for (int col = 0; col < board.length; col++) {
//             if (isSafe(board, row, col)) {
//                 board[row][col] = true;
//                 solve(row + 1, board, solutions);
//                 board[row][col] = false;
//             }
//         }
//     }

//     private boolean isSafe(boolean[][] board, int row, int col) {
//         // Check vertical column
//         for (int i = 0; i < row; i++) {
//             if (board[i][col]) {
//                 return false;
//             }
//         }

//         // Check diagonal left
//         for (int i = 1; i <= Math.min(row, col); i++) {
//             if (board[row - i][col - i]) {
//                 return false;
//             }
//         }

//         // Check diagonal right
//         for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
//             if (board[row - i][col + i]) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     private List<String> createBoard(boolean[][] board) {
//         List<String> boardConfig = new ArrayList<>();
//         for (boolean[] row : board) {
//             StringBuilder sb = new StringBuilder();
//             for (boolean cell : row) {
//                 sb.append(cell ? 'Q' : '.');
//             }
//             boardConfig.add(sb.toString());
//         }
//         return boardConfig;
//     }
// }
