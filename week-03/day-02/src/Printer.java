public class Printer {
    public static void main(String[] args) {
        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourh")
        // ...
    String a = "a";
    String b = "b";
    String c = "c";

    printer(a, b, c);
    }

    public static void printer(String... input) {
        for (String output : input) {
            System.out.println(output);
        }
    }
}
