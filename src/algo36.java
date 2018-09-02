public class algo36 {
    public boolean isValidSudoku(char[][] board) {
        int row[][]=new int[9][9];
        int lig[][]=new int[9][9];
        int cas[][]=new int[9][9];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.') {
                    int num=board[i][j]-'0'-1;
                    int k=(j/3)+3*(i/3);
                    if(row[j][num]==1 || lig[i][num]==1 || cas[k][num]==1)
                        return false;
                    row[j][num]=1;
                    lig[i][num]=1;
                    cas[k][num]=1;
                }

            }
        }
        return true;
    }
}
