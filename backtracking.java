import java.util.ArrayList;
import java.util.List;

public class backtracking {


    //1st : print all the possible ways to place the all the elements of the String : "ABC" 
    // TIME COMPLEXCITY : o(n * n!).  where n is the length of the string.
//    public static void printPermutation(String str,String perm,int idx) { 

//     if(str.length()==0) { 
//         System.out.println(perm);
//         return;
//     }

//     for(int i=0;i<str.length();i++) {
//     char currChar = str.charAt(i);
//     String newStr = str.substring(0,i) + str.substring(i+1);   
//     printPermutation(newStr, perm + currChar, idx+1);

//    }               
     
// }


//     public static void main (String args[]) { 
//         String str = "ABC";
//         printPermutation(str, "", 0);
//     }


    // **** IMP ****
    // PRINT ALL SOLUTIONS WHERE QUEENS ARE SAFE FOR N QUEENS (WAJIR) IN NxN CHESSBOARD  

    public boolean isSafe(int row, int col, char board[][]) {

        //horizontal check
        for(int j=0;j<board.length;j++)  {
            if(board[row][j]== 'Q') { 
                return false;
            }
        }

        //vertical check
        for(int i=0 ;i<board.length;i++) { 
            if(board[i][col]=='Q') { 
                return false;
            }
        }

        //upper left check
        int r=row;
        for(int c=col;c>=0 && r>=0 ; c--,r--) { 
            if(board[r][c]=='Q') { 
                return false;
            }
    }

    //upper right check 
    r=row;
    for(int c=col;c<board.length && r>=0; r-- ,c++) { 
        if(board[r][c]=='Q') { 
            return false;
    }
    }

    //lower left check
    r=row;
    for(int c=col ; c>=0 && r<board.length ; r++, c--) { 
        if(board[r][c]=='Q') { 
            return false;
    }
}

    //lower right check
    r=row;
    for(int c = col; c<board.length && r<board.length ; r++,c++) { 
        if(board[r][c]=='Q') { 
            return false;
    }
    }

    return true;

} 


public void saveBoard(char board[][],List<List<String>> allBoards)  {
     
    String row = "";
    List<String> newBoard = new ArrayList<>();


    for(int i=0 ; i<board.length; i++ ) { 
        row = "";
        for(int j=0;j<board[0].length; j++) { 
            if(board[i][j] == 'Q')
               row += 'Q';
             else
                row += '.';  
        }
        newBoard.add(row);
    }

    allBoards.add(newBoard);
}

    public void helper (char board[][],List<List<String>> allBoards, int col) { 
        

        for(int row =0;row<board.length;row++) {
            
            if(isSafe(row,col,board)) { 
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col]= '.';
            }

        }
    }

    public  List<List<String>> solveNQueens (int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];
         
        helper(board, allBoards, 0);
        
        return allBoards;

    }




}
