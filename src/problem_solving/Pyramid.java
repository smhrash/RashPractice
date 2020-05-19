package problem_solving;

public class Pyramid {

    public static void pyramidPattern() {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }

    public static void main(String[] args) { //driver function


        pyramidPattern();
    }

}


