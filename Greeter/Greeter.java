public class Greeter {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.printf("Greetings, %s/n!");
        } else {
            System.out.println("Greetings, earthlings!");
        }
    }
}