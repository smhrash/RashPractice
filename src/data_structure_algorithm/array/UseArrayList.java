package data_structure_algorithm.array;

import java.util.ArrayList;

public class UseArrayList {

    static ArrayList<String> stName = new ArrayList<>();

    public static void main(String[] args) {

        stName.add("Sarker Rashid");
        stName.add("Nandipa Rashid");
        stName.add("Sumon Mia");
        stName.add("Mamun Mia");
        stName.add("Salim Bhuiyan");
        stName.add("Ripon Mia");

        System.out.println(stName.get(0));

        System.out.println("=======================================================");
        for (String stNm : stName) {
            System.out.println(stNm);
        }
    }

}
