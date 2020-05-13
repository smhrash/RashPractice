package data_structure_algorithm.likedlist;

import java.util.LinkedList;

public class StateList {

    static LinkedList<String> stateList= new LinkedList<>();

    public static void main(String[] args) {
        stateList.add(0,"NY");
        stateList.add(1,"NJ");
        stateList.add(2,"FL");
        stateList.add(3,"CA");
        stateList.add(4,"LA");
        stateList.addLast("NV");

        for(String st:stateList){
            System.out.println(st);
            System.out.println();
        }
    }
}
