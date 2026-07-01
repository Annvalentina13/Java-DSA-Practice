package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        // Adding at specific position
        list.add(1,15);
        System.out.println(list);

        // Access Elements
        System.out.println(list.get(2));

        //Update Elements
        list.set(4,45);
        System.out.println(list);

        //Removing Element

        //1.Remove by Index
        list.remove(2);
        System.out.println(list);

        //2.Remove by value
        list.remove(Integer.valueOf(20));
        System.out.println(list);

        //Size
        System.out.println(list.size());

        //Check if Empty
        list.isEmpty();

        //Search
        System.out.println(list.contains(10));

        //Traversal

        //1.For loop
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2.For each loop
        for(int x : list) {
            System.out.println(x);
        }

        //Sorting
        Collections.sort(list);

    }
}
