package Array;

import  java.util.*;
public class NC4_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0){
            return new ArrayList<>();
        }
        Map<String , List<String>> hashmap = new HashMap<>();
        for(String str : strs){
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String Storedval = String.valueOf(ch);

            if(!hashmap.containsKey(Storedval)){
                hashmap.put(Storedval, new ArrayList<>());
            }
            hashmap.get(Storedval).add(str);
        }
        return new ArrayList<>(hashmap.values());
    }
}
