package algorithm.use_has_set;

import java.util.HashSet;
import java.util.Iterator;

public class HashAdvance {

    public static void main(String[] args) {

        HashSet<Integer> num = new HashSet<Integer>();
        num.add(45);
        num.add(55);
        num.add(65);
        num.add(75);
        System.out.println(num);
        // num.clear();
        System.out.println(num.size());

        System.out.println(num.toArray());

        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}

