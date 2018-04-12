public class DrawChessTable {
    public static void main(String[] args){
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if ( i % 2 == j % 2) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
