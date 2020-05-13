package problem_solving;

import java.util.HashSet;

import java.util.Set;


public class RemoveDuplicate {


    public static void main(String[] args) {


        Object[] number1 = {"b", "b", 1, 2, 4, 5, 7, 7, "k", "k", 9, 10, 0, 0, 7, 2, 4,11,12,11,12};


        Set<Object> newList = new HashSet<>();


//TreeSet<String> newList=new TreeSet<>();

        for (Object element : number1) {

            if (element instanceof String) {

                newList.add((String) element);

            } else if (element instanceof Integer) {

                newList.add((Integer) element);

            }


        }

        System.out.println(newList);

    }


}

