public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

        String[] abc = {"first", "second", "third"};
        int source = 0;
        int destination = 2;
        String temp = abc[source];
        abc[source] = abc[destination];
        abc[destination] = temp;

        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");
        }
    }
}
