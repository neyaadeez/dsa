public class Ctf {
    public String block4reverse(String s){
        int j =0;
        String ans = "";
        String temp = "";
        for(int i=0; i<s.length(); i++){
            if(j<4){
                temp = s.charAt(i) + temp;
            }
            if(j==3){
                ans += temp;
                j=0;
                temp = "";
                continue;
            }
            j++;
        }
        return ans;
    }
}
