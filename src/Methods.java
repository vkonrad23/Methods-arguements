public class Methods {

    // A method with no arguments and no return value
    public static void printHelloWorld() {
        System.out.println("Hello, world!");
    }

    // A method with two integer arguments and an integer return value
    public static int add(int a, int b) {
        return a + b;
    }

    // A method with a string argument and no return value
    public static void printString(String str) {
        System.out.println(str);
    }

    // A method that calls other methods
    public static void doSomething() {
        printHelloWorld();
        int sum = add(10, 20);
        printString("The sum of 10 and 20 is " + sum);
    }

    public static void main(String[] args) {
        doSomething();
    }
}

