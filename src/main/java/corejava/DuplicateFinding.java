package corejava;

import java.util.HashMap;
import java.util.Map;

public class DuplicateFinding {

    public void duplicateFindingEle(String c){
        String s=c;
        char[] t=s.toCharArray();
        Map<Character,Integer> ch= new HashMap<>();
        for(char ff: t){
            if(ch.containsKey(ff)){
                ch.put(ff,ch.get(ff)+1);
            }
            else{
                ch.put(ff,1);
            }

        }
        System.out.println(ch);



    }

    public static void main(String[] args) {
        DuplicateFinding dp = new DuplicateFinding();
        dp.duplicateFindingEle("geeksforgeek");

    }

}
