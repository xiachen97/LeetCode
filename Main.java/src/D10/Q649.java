package D10;

import java.util.ArrayDeque;
import java.util.Queue;

public class Q649 {
    public static void main(String[] args) {
        String senate = "RD";//R
        String senate1 = "RDDRDD";//D
        String senate2 = "RDRDRD";//R
        String senate3 = "DR";//D
        String senate4 = "DDRRR";//D
        String s = "DRDRDR";//D
        System.out.println(predictPartyVictory(senate));
        System.out.println(predictPartyVictory(senate1));
        System.out.println(predictPartyVictory(senate2));
        System.out.println(predictPartyVictory(senate3));
        System.out.println(predictPartyVictory(senate4));
        System.out.println(predictPartyVictory(s));
    }
    public static String predictPartyVictory(String senate) {
        Queue<Integer> D_queue=new ArrayDeque<>();
        Queue<Integer> R_queue=new ArrayDeque<>();
        int n=senate.length();
         for(int i=0;i<n;i++){
             char party = senate.charAt(i);
            if(party =='R'){
                R_queue.add(i);
            }else if(party =='D'){
                D_queue.add(i);
            }
         }

         while(!D_queue.isEmpty()&&!R_queue.isEmpty()){
            int r=R_queue.poll();
            int d=D_queue.poll();

            //IMPORTANT
            if(r<d){
                R_queue.add(r+n);//R join line again
            }else{
                D_queue.add(d+n);//D join line again
            }
         }
            
        return R_queue.isEmpty()? "Dire":"Radiant";


    }
}
