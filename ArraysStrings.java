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
    public char[] URLify(char[] s, int x){
        int count = 0, index = 0;
        for(int i=0; i<x; i++){
            if(s[i] == ' '){
                count++;
            }
        }
        index = x + (count*3);
        char[] ans = new char[index];
        if(s.length > x) s[x] = '\0';
        for(int i = x-1; i>=0; i--){
            if(s[i] == ' '){
                ans[index - 1] = '0';
                ans[index - 2] = '2';
                ans[index - 3] = '%';
                index = index - 3;
            }else{
                ans[index - 1] = s[i];
                index--;
            }
        }

        return ans;
    }

    public boolean permutationofpalindrome(String x){
        char[] s = x.toCharArray();
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (char c : s) {
            if(c != ' '){
                hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
            }
        }
        int evencount=0, oddcount=0;
        for (int c : hashmap.values()) {
            if(c % 2 == 0){
                evencount++;
            }else
                oddcount++;
        }

        return (oddcount <= 1)?  true : false;
    }
    public boolean oneWay(String s1, String s2){
        int x = s1.length();
        int y = s2.length();
        if(Math.abs((x - y)) >= 2){
            return false;
        }
        if(s1.length() == s2.length()){
            int flag = 0;
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    flag++;
                }
            }
            if(flag>1)
                return false;
        }
        else{
            if(s1.length()+1 == s2.length()){
                return helperforOneway(s2, s1);
            }
            if(s1.length()-1 == s2.length()){
                return helperforOneway(s1, s2);
            }
        }

        return true;
    }
    public boolean helperforOneway(String s1, String s2){
        int i1 = 0;
        int flag = 0;
        int i =0;
        while(i<s1.length() && i1<s2.length()){
            if(s1.charAt(i) != s2.charAt(i1)){
                flag++;
                i++;
                continue;
            }
            i1++;
            i++;
        }

        return flag > 1? false: true;
    }
}
