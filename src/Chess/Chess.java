package Chess;

import java.util.ArrayList;
import java.util.List;

public class Chess {
    public static void main(String[] args) {
        List<ArrayList<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 4; j++) {
                biDemArrList.get(i).add(j, "o");
            }
        }
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(biDemArrList.get(i).get(j) + "•");
                }
                System.out.println();
            } else {
                for (int j = 0; j < 4; j++) {
                    if (j == 0) System.out.print("•" + biDemArrList.get(i).get(j));
                    else System.out.print("•" + biDemArrList.get(i).get(j));
                }
                System.out.println();
            }
        }
    }
}
