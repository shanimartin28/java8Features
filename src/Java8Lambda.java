
/**
 * Lambda expression facilitates functional programming, and simplifies the development a lot.
 * A lambda expression is characterized by the following syntax.
 * parameter -> expression body
 * Lambda expressions are used primarily to define inline implementation of a functional interface,
 * i.e., an interface with a single method only.
 * example, we've used various types of lambda expressions to define the operation method of MathOperation interface.
 * Then we have defined the implementation of sayMessage of GreetingService.
 */

public class Java8Lambda {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Java8Lambda tester = new Java8Lambda();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("BS Java Workshop");
        greetService2.sayMessage("BS Java Workshop 1");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
