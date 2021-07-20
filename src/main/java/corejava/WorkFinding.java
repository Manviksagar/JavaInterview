package corejava;

import java.util.HashMap;
import java.util.Map;

public class WorkFinding {

    public void wordFinding(String s){

        String[] word=s.split(" ");
        Map<String,Integer> wordCount= new HashMap<>();
        for(String ss : word){
            if(wordCount.containsKey(ss)){
                wordCount.put(ss,wordCount.get(ss)+1);
            }
            else{
                wordCount.put(ss,1);
            }


        }
        System.out.println(wordCount);




    }

    public static void main(String[] args) {
        WorkFinding wf = new WorkFinding();
                wf.wordFinding("Sagar is working as Sagar dev ");

    }
}
