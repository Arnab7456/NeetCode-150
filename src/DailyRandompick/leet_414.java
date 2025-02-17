package DailyRandompick;

import java.util.*;

public class leet_414 {
    public static int thirdmax(int [] nums){
        Set<Integer> Distinctnum = new HashSet<>();
        for (int num : nums){
            Distinctnum.add(num);
        }
        List<Integer> sortedList = new ArrayList<>(Distinctnum);
        Collections.sort(sortedList, Collections.reverseOrder());

        if (sortedList.size()<3){
            return sortedList.get(0);
        } else  {
            return sortedList.get(2);
        }
    }
}
