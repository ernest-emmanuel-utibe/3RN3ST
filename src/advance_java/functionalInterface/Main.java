package advance_java.functionalInterface;

public class Main {
    public static void main(String[] args) {
        GreetingMessage message = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello" + name);
            }
        };

        message.greet("Github, LinkedIn");
    }
}
