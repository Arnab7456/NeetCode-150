package randomPick;

import java.util.ArrayList;
import java.util.List;

public class leet_2558 {
    public long pickGifts(int[] gifts, int k) {
        List<Integer> giftList = new ArrayList<>();
        for (int gift : gifts){
            giftList.add(gift);
        }
        int i =0;
        while (i<k){
            int maxx = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < giftList.size(); j++) {
                if (giftList.get(j) > maxx ){
                    maxx = giftList.get(j);
                    maxIndex = j;
                }
            }
            giftList.remove(maxIndex);
            giftList.add((int) Math.sqrt(maxx));
            i++;
        }
        int sum =0;
        for (int gift : giftList){
            sum +=gift;
        }
        return sum;
    }

}
