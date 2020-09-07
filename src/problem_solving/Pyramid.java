package problem_solving;

import java.util.Scanner;

public class Pyramid {


    public static void pyramidPattern() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the height of Pyramid");
        int numOfRow=scan.nextInt();

        for (int i = 0; i < numOfRow; i++) {

            for (int j = 0; j < numOfRow-i; j++) {
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


