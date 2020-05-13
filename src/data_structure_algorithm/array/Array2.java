package data_structure_algorithm.array;

public class Array2 {


    static String [][] empInformation= {
            {"slNumber", "empName", "empAddress", "Phone"},
            {"1", "Sumon Mia", "Queens, NY", "3473208854"},
            {"2", "Razon Miazee", "Brooklyn, NY", "37565875547"},
            {"3", "Alam Chowduri", "Bronx, NY", "767368888"},
            {"4", "Sarker Rashid", "Long Island, NY", "767368888"}


    };

    public static void main(String[] args) {

        for (String[] empI : empInformation) {
            for (String em : empI) {

                System.out.println(em);
            }
        }

    }
}