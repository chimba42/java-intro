package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ProgramFourthPartSecond {
    public static void main(String[] args) {
        ArrayList <Integer> colList = new ArrayList<>();
        colList.add(1);
        colList.add(2);
        colList.add(3);
        colList.add(4);

       colList.remove(new Integer(2));
        PrintEach(colList);

        colList.remove(2);
        PrintEachIterator(colList);

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        map.put("First".intern(), colList);

        System.out.println(map.get("First"));

        HashSet<String> set = new HashSet<>();
        set.add("adb");
        set.add("db");
        set.add("adb");
        System.out.println("");
        System.out.println(set);
    }



    private static void PrintEachIterator(ArrayList<Integer> arr){
        Iterator<Integer> iterator= arr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }

    public static void PrintEach(ArrayList<Integer> arr) {
        for (Integer integer : arr){{
            System.out.println(integer);
        }


        }

    }
}
