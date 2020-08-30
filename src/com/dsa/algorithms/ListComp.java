package com.dsa.algorithms;

import java.util.*;

public class ListComp {

  public static boolean isSame(){
        List<Integer> list1 = Arrays.asList(1,2,1);
        List<Integer> list2 = Arrays.asList(1,2,3);
        List<Integer> list3 = Arrays.asList(1,3,1);
        List<Integer> list4 = Arrays.asList(1,2,1);
        List<Integer> list5 = Arrays.asList(1,1,2);

        List<List<Integer>> listOfList = new ArrayList<>();

        listOfList.add(list2);
        listOfList.add(list3);
        listOfList.add(list4);
        listOfList.add(list5);


        for (List<Integer> l:listOfList
             ) {
            Set<Integer> s = new HashSet<>();
//                s.add()
            if (l.equals(list1)) {
                return true;
            }
        }
        return false;
    }



}
