package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class twentyFourthApril {
    public int lastStoneWeight(int[] stones) {
        int c =0; int indexC=0;
        int sc =0; int indexSC =0;
        for (int i : stones) {
            if(stones[i]>c){
                c=stones[i];
                indexC = i;
                stones[i]=0;
            }
        }
        for (int i : stones) {
            if(stones[i]>sc && stones[i]<=c){
                sc = stones[i];
                indexSC =i;
            }
        }       
        if(sc == c){
            stones[indexSC] =0;
        }
        else {
            stones[indexSC]=0;
            stones[indexC] = c-sc;
        }

        return sc;
    }
    public static int stoneWeight(int[] stone){
        ArrayList<Integer> stoneVal = new ArrayList<Integer>();
        int c =0;
        int sc =0;
        for (int i=0;i<stone.length;i++) {
            stoneVal.add(stone[i]);
        }int count=0;
        // for(int i=0;i<stoneVal.size();i++){
        //     System.out.println(stoneVal.get(i)+" Pre Exec");
        // }
        while(stoneVal.size()>=1){
            //System.out.println("Size"+stoneVal.size());
            c=0;sc=0;
            for (int i=0;i<stoneVal.size();i++) {
                //System.out.println("Testing2");
                if(stoneVal.get(i)>c){
                    //System.out.println("Testing");
                    c=stoneVal.get(i);
                    count=i;
                }
            }
            stoneVal.set(count, 0);
            for(int i=0;i<stoneVal.size();i++){
                System.out.println(stoneVal.get(i)+" Exec");
            }
            System.out.println(count);
            for (int i=0;i<stoneVal.size();i++) {
                if(stoneVal.get(i)>sc && stoneVal.get(i)<=c){
                    sc = stoneVal.get(i);
                    //System.out.println("Value of SC: "+sc);
                }
            }
            stoneVal.set(count,c);
            //System.out.println("Value of C: "+c);
            //System.out.println("Value of SC: "+sc);
            
            if(sc ==c){
                //System.out.println("Testing");
                stoneVal.remove(stoneVal.indexOf(sc));
                stoneVal.remove(stoneVal.indexOf(c));
            }       
            
            else{
                System.out.println("here "+sc+" c "+c);
                stoneVal.remove(stoneVal.indexOf(sc));
                System.out.println("here "+ count +" c-sc "+ (c-sc));
                if(count-1==-1){
                    stoneVal.set(count, c-sc);
                }
                else stoneVal.set(count-1, c-sc);   
            }
            //System.out.println(stoneVal.size()+" Size");
            if(stoneVal.size()==1){
                //System.out.println("Exec "+stoneVal.get(0));
                return stoneVal.get(0);
                
            }
            else if(stoneVal.size()==0)
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,4,1,8,1};
        int val = solution(arr);
        System.out.println(val+" Final");
    }
    
    public static int solution(int[] stones){
        PriorityQueue<Integer> solQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            solQueue.add(stones[i]);
        } 
        while (solQueue.size() != 1) {
            int stone1 = solQueue.poll();
            int stone2 = solQueue.poll();
            solQueue.offer(Math.abs(stone1 - stone2));
        }
        return solQueue.poll();
    }
}
