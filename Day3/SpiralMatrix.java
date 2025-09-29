class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll = new ArrayList<>();
        int sr = 0 ;
        int sc = 0 ;
        int m = matrix.length ;
        int n = matrix[0].length ;
        int er = m-1 ;
        int ec = n-1 ;
        while(sr<=er && sc<= ec){
            //top
            //constant row var column 
            for(int i = sc; i<=ec; i++){
                ll.add(matrix[sr][i]);
            } 

            //right 
            // constant col var row 
            for(int i = sr+1; i<=er; i++){
                ll.add(matrix[i][ec]);
            } 

            //bottom 
            // constant row var col 
            for(int i = ec-1; i>=sc; i--){
                if(sr==er){
                    break;
                }
                ll.add(matrix[er][i]);
            } 

            //left  
            // constant col var row 
            for(int i = er-1; i>=sr+1; i--){
                if(sc==ec){
                    break;
                }            
                   ll.add(matrix[i][sc]);
            } 

            sr++;
            er--;
            sc++;
            ec--;

        }
        return ll ;
    }
}