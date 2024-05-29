package iryna.week1;

public class DivideWithoutOperator {
    /*
Write a method that can divide two numbers without using division operator

*/
    public static void main(String[] args) {

        divisionWithoutOperator(10,2);
    }
    public static void divisionWithoutOperator (int num1, int num2) {

        int count = 0;
        while (num1 >= num2){
         num1 -= num2;
            count++;
        }
        System.out.println(count);
    }
}
