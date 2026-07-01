package LLUsingCollections;

import java.util.LinkedList;

public class LinkedlistUsingCollections {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        //Adding Elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        //Adding at specific Position
        list.add(1,15);

        //Add at first
        list.addFirst(5);

        //Add at Last
        list.addLast(50);

        System.out.println(list);

        //Accessing Elements

        //1. Access through index
        System.out.println(list.get(2));

        //2.Accessing First Element
        System.out.println(list.getFirst());

        //3.Accessing Last Elemet
        System.out.println(list.getLast());

        //Update Elements
        list.set(5,60);
        System.out.println(list);

        //Removing Elements

        //1. Remove through index
        list.remove(5);

        //2.Remove the first
        list.removeFirst();

        //3.Remove the last
        list.removeLast();

        //4.Remove by Value
        list.remove(Integer.valueOf(15));

        System.out.println(list);

        //Search
        System.out.println(list.contains(30));

        //Size
        System.out.println(list.size());

        //Traversing
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
