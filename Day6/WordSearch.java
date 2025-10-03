class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i< board.length;i++){
            for(int j = 0 ; j <board[0].length ; j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans = Check(i , j , board , word , 0 );
                    if(ans ){
                       
                    return true   ; 
                    }
                }
            }
        }
        return  false ;
    }
    public static boolean Check (int i , int j , char [][] board , String word , int idx ){

        if(idx==word.length()){
            return true ;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(idx)){
            return false ;
        }
        board[i][j]= '*';
        boolean a1 = Check(i+1 , j , board , word , idx+1);
        boolean a2 = Check(i , j+1 , board , word , idx+1);
        boolean a3 = Check(i-1 , j , board , word , idx+1);
        boolean a4 = Check(i , j-1 , board , word , idx+1);

        boolean res = (a1||a2||a3||a4);
        if(res){
            return true ;
        }
        board [i][j]=word.charAt(idx);
        return false ;

    }
}