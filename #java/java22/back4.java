public class back4 {
    public static void Nqueens(char board[][],int row){


        //base case

        if(row==board.length){
            printboard(board);
            return;
        }

        //recursion
        //column loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            Nqueens(board, row+1);//function call

            //jar queens delte sathi // queems move zali x print kara
            board[row][j]='x';//bacltracking
        }
    }


    public static void printboard(char board[][]){
        System.out.println("-----------chessboard-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n=2;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }


        Nqueens(board,0);
    }
}
