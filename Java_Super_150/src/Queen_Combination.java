public class Queen_Combination
{
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        printAnswer(board, tq, 0, "", 0);
    }
    public  static void printAnswer(boolean[] board, int tq, int qpsf, String ans, int index)
    {
        if(qpsf == tq)
        {
            System.out.println(ans);
            return;
        }
        if(index == board.length)
        {
            return;
        }
//        for (int i=index; i< board.length; i++)
//        {
//            if (board[i] == false)
//            {
                board[index] = true;
                printAnswer(board, tq, qpsf+1, ans+"b"+index+"q"+qpsf, index+1);
                board[index] = false;
                printAnswer(board, tq, qpsf, ans, index+1);
//            }
//        }
    }
}
