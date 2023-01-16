package com.capgemini.collection_framwork;

import java.util.*;

class CollectionLL {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");

        System.out.println(list);
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+"-> ");
        }
        System.out.println("NULL");

        list.remove(3);
        System.out.println(list);
    }
}