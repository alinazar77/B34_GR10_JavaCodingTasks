package tahmina.week2;

public class Number_SwapTwoNumbers {

    public static void main(String[] args) {

        //Swap two variables' values without using a third variable

        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using arithmetic operations
        a = a + b;
        b = a - b;
        a = a - b;

        // Alternatively, you can use bitwise XOR operation
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }


}
