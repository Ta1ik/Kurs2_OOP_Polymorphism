package Mathematics;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RunMath {
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



    }
}

