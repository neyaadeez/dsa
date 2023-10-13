import java.util.Arrays;
import java.util.HashMap;

public class ArraysStrings {
    public boolean isUniqueHashMap(String s){
        HashMap<Character, Integer> HashMap = new HashMap<>();
        for (Character i : s.toCharArray()) {
            HashMap.put(i, HashMap.getOrDefault(i, 0)+1);
        }
        for (int i : HashMap.values()) {
            if(i!=1){
                return false;
            }
        }
        return true;
    }
    public boolean isUnique(String s){
        if(s.length() > 128){
            return false;
        }
        boolean arr[] = new boolean[128];
        for (Character i : s.toCharArray()) {
            if(arr[(int)i]){
                return false;
            }
            arr[(int)i] = true;
        }
        return true;
    } 
    public boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] x = s.toCharArray();
        Arrays.sort(x);
        char[] y = t.toCharArray();
        Arrays.sort(y);
        return new String(x).equals(new String(y));
    }
    public boolean permutation1(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int x[] = new int[128];
        for (int i : s.toCharArray()) {
            x[i]++;
        }
        for (int i : t.toCharArray()) {
            x[i]--;
            if(x[i] < 0){
                return false;
            }
        }
        return true;
    }
    
}
