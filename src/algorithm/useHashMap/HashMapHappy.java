package algorithm.useHashMap;

import java.util.HashMap;

public class HashMapHappy {

    public static void main(String[] args) {


        HashMap<Integer,String> happy=new HashMap<Integer, String>();
        happy.put(1,"Rahman");
        happy.put(2,"Salam");
        happy.put(3,"Rafique");
        happy.put(4,"Jabbar");

        System.out.println(happy);
        System.out.println(happy.get(2));
    }
}
