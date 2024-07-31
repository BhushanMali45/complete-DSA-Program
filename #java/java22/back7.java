public class back7{

    public static boolean isSafe(char board[][], int row, int col) {
      //vetically up
      for (int i = row - 1; i >= 0; i--) {
        if (board[i][col] == 'Q') {
          return false;
        }
      }
  
      //diagnolly left up
  
      for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') {
          return false;
        }
      }
  
      //diagonally right uo
  
      for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j] == 'Q') {
          return false;
        }
      }
  
      return true;
    }
  
    public static boolean Nqueens(char board[][], int row) {
      //base case
  
      if (row == board.length) {
        // printboard(board);
        count++;
        return true;
      }
  
      //recursion
      //column loop
      for (int j = 0; j < board.length; j++) {
        if (isSafe(board, row, j)) {
          board[row][j] = 'Q';
          Nqueens(board, row + 1); //function call
          return true;
  
          //jar queens delte sathi // queems move zali x print kara
          
        }
        board[row][j] = 'x'; //bacltracking
      }
      return false;
    }
  
    public static void printboard(char board[][]) {
      System.out.println("-----------chessboard-----");
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++) {
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }
    }
  

    static int count=0;
    public static void main(String args[]) {
      int n = 4;
      char board[][] = new char[n][n];
      //initialize
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          board[i][j] = 'x';
        }
      }
  
      Nqueens(board, 0);

      if(Nqueens(board, n)){
        System.out.println("soln is possible");
        printboard(board);
      }
      else{
        System.out.println("soln is not  possible");

      }
    //   System.out.println("total ways to solve n queens  is   "+count);
    }
  }
  
