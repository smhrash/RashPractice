package algorithm.use_has_set;

import java.util.HashSet;

public class Data {

    public static void main(String[] args) {

        HashSet<String> data=new HashSet<>();
        data.add("NY,USA");
        data.add("NJ,USA");
        data.add("NV,USA");
        data.add("FL,USA");
        data.add("LA,USA");
        data.add("CA,USA");

        System.out.println(data);

        System.out.println(data.size());
        System.out.println(data.isEmpty());
        System.out.println(data.contains("CA,USA"));
        data.remove("LA,USA");
        System.out.println(data);
        System.out.println(data.size());
    }
}
