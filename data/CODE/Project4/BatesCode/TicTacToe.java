/**
 * @author Evan
 * @version 2014-3-2 v1
 * ASSIGNMENT: Lab 6
 * PURPOSE: tic tic toe
 */
public class TicTacToe {

    private Cell board[][];
    private boolean turn;
    
    public enum Cell {
        EMPTY(0), X(1), O(2);
        private int value;
        private Cell(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    
    public TicTacToe(){
        board = new Cell[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = Cell.EMPTY;
            }
        }
        turn = true;
        printBoard();
    }
    
    public void move(int x, int y){
        if (board[x][y] == Cell.EMPTY){
            if (turn == true){
                board[x][y] = Cell.X;
            }else{
                board[x][y] = Cell.O;
            }
            printBoard();
        }else{
            System.out.println("Taken.");
        }
        checkState();
        switchTurn();
    }
    
    public void move(int spot){
        int columns = board[0].length;
        int rows = board.length;
        int total = rows * columns;
        spot -= 1;
        if(spot < total && spot >= 0){
            int x = spot / rows;
            int y = spot % columns;
            if (turn == true){
                board[x][y] = Cell.X;
            }else{
                board[x][y] = Cell.O;
            }
            printBoard();
        }else{
            System.out.println("Invalid move.");
        }
        checkState();
        switchTurn();
    }
    
    public void printBoard(){
        for(int x=0; x < 3; x++){
            for(int y=0; y < 3; y++){
                System.out.print("" + board[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    private void checkState(){
        if(winner()){
            if(turn == true){
                System.out.println("Player 1 Win");
            }else{
                System.out.println("Player 2 Win");
            }
        }else if(!winner() && tie()){
            System.out.println("DRAW");
        }
    }
    
    private boolean winner(){
        Cell line[] = new Cell[3];
        
        int rows = board.length;
        int columns = board[0].length;
        
        for (int x=0; x < rows; x++){
            for (int y=0; y < columns; y++){
                line[y] = board[x][y];
            }
            if(line[0] == line[1] && line[0]== line[2] && line[0] != Cell.EMPTY){
                return true;
            }
        }
        for (int y=0; y < columns; y++){
            for (int x=0; x < rows; x++){
                line[x] = board[x][y];
            }
            if(line[0] == line[1] && line[0]== line[2] && line[0] != Cell.EMPTY){
                return true;
            }
        }
        if(board[0][0] == board[1][1] && board[0][0]== board[2][2] && board[0][0] != Cell.EMPTY){
            return true;
        }
        if(board[0][2] == board[1][1] && board[0][2]== board[2][0] && board[0][2] != Cell.EMPTY){
            return true;
        }
        return false;
    }
    
    private boolean tie(){
        int rows = board.length;
        int columns = board[0].length;
        
        for(int x = 0; x < rows; x++){
            for(int y = 0; y < columns; y++){
                if(board[x][y] == Cell.EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
    
    private void switchTurn(){
        if(turn == true){
            turn = false;
        }else{
            turn = true;
        }
    }
}
