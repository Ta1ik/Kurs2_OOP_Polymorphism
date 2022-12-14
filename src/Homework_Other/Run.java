package Homework_Other;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        //hw2
        Set <Integer> diapason = new HashSet<>();
        while (diapason.size() <20) {
            int rand = (int) (Math.random()*1000);
            diapason.add(rand);
            if(rand%2==1){
                diapason.remove(rand);
            }
        }
        System.out.println(diapason);

        //hw3
        Set <Exercise> exercises = new HashSet<>();
        while(exercises.size()<15){
            Exercise exercise = new Exercise((int) (1+ Math.random()*9), (int) (1+ Math.random()*9));
            if(exercises.contains(exercise)){
                exercises.remove(exercise);
                exercises.add(exercise);
            }
            exercises.add(exercise);
            System.out.println(exercise);
        }

        //Hw collection HashMap
        HwMap map = new HwMap();
        map.addMap("one",1);
        map.addMap("two",2);
        map.addMap("three",3);
        map.addMap("two",22);
        System.out.println(map);

        //Hw map 2-1
        Map<String, List<Integer>> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add((int) (Math.random()*1000));
            list2.add((int) (Math.random()*1000));
            list3.add((int) (Math.random()*1000));
            list4.add((int) (Math.random()*1000));
            list5.add((int) (Math.random()*1000));
        }
        map1.put("keyOne", list);
        map1.put("keyTwo", list2);
        map1.put("keyThree", list3);
        map1.put("keyFour", list4);
        map1.put("keyFive", list5);
        System.out.println(map1);

        Map <String, Integer> map2 = new HashMap<>();
        for(Map.Entry<String, List<Integer>> value : map1.entrySet()){
            map2.put(value.getKey(), sumVal(value.getValue()));
        }
        System.out.println(map2);

        //Hw map 2-2
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 11; i++) {
            String s = "value";
            s += i;
            linkedHashMap.put(i,s);
        }
        System.out.println(linkedHashMap);


    }
    public static int sumVal(List<Integer>list){
        int sum=0;
        for(Integer value : list){
            sum+=value;
        }
        return sum;
    }


}

