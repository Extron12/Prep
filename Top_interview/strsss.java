package Top_interview;

import java.util.ArrayList;

public class strsss {
    public static void main(String[] args) {
        
        char arg[] = {'a','b','a','b','c','d','d','e','a','d'};
        ArrayList<Character> arr = new ArrayList<>();

        for(int i=0;i<arg.length;i++){
            if(arr.contains(arg[i])){
                arr.remove(Character.valueOf(arg[i]));
                arr.add(arg[i]);
            }
            else arr.add(arg[i]);
        }

        System.out.println(arr);
    }

    
}
