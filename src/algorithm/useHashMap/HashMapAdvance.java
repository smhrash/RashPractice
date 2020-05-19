package algorithm.useHashMap;

import java.util.HashMap;

public class HashMapAdvance {

    public static void main(String[] args) {

        HashMap<String,String> data= new HashMap<String, String>();
        data.put("smhrash","n1224533m");
        data.put("aripon","pw122453gsj3e");
        data.put("smkashem","nbbb12247665533dd");
        data.put("smhgssyfrash","n122dgdj4533m");

        System.out.println(data);
        System.out.println(data.get( "smhgssyfrash"));
        System.out.println(data.size());
        System.out.println(data.get("smhrash"));

    }
}
