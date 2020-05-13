package data_structure_algorithm.array;

public class UseArray {

    static String[] empName = {"Sarker Rashid", "Anisur Rahman", "Sajjad Dewan", "Sumon Miah"};

    static String[] empAddress = new String[6];

    public static void main(String[] args) {

        empAddress[0] = "Queens, NY";
        empAddress[1] = "Brooklyn, NY";
        empAddress[2] = "Bronx, NY";
        empAddress[3] = "Staten Island, NY";
        empAddress[4] = "Manhattan, NY";

        try {
            System.out.println(empAddress[2]);
            System.out.println(empAddress[4]);
            System.out.println(empAddress[0]);
            System.out.println(empAddress[1]);
            System.out.println(empAddress[3]);
            System.out.println(empAddress[6]);

        } catch (Exception e) {
            System.out.println("Index Out of Bound");
        }
        for (int i = 0; i < empAddress.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("=========================");
        for (int i = 0; i < empName.length; i++) {
            System.out.print(i + "\t");
        }
        for (String empA : empAddress) {
            System.out.println(empA);
        }
        for (String empN : empName) {
            System.out.println(empN);
        }


    }


}
