package tahmina.week2;

public class Number_ConsecutiveNumbers {

    public static void main(String[] args) {
        int N = 20; // Change N to any positive integer

        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0) {
                result=("Codility");
            }

            if (i % 3 == 0) {
                result=("Test");
            }

            if (i % 5 == 0) {
                result=("Coders");
            }

            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}




