package lab4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {
    public static void main(String[] agrs){

        HashSet<Integer> hsetdemo = new HashSet<Integer>();
        hsetdemo.add(10);
        hsetdemo.add(20);
        hsetdemo.add(30);
        hsetdemo.add(40);
        hsetdemo.add(40);
        System.out.println(hsetdemo);

        hsetdemo.remove(10);
        System.out.println(hsetdemo);

        Iterator itr = hsetdemo.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());

        }

    }
}
