package Strings;
import java.util.*;


public class RLS {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        sc.close();
        // storing input as a queue
        Queue <Character> q = new LinkedList<>();
        for(int i=0;i<inp.length();i++){
            q.add(inp.charAt(i));
        }
         //variables
         char now = q.poll();
         int count = 1;
        //storing output
        StringBuilder s  = new StringBuilder();
        //performin logic
        while(!q.isEmpty()){
            if(q.peek() == now){
                count++;
                q.poll();  
            }else{
                System.out.println();
                s.append(now+""+count);
                count = 1;
                now = q.poll();
            }  
        }
        s.append(now+""+count);
        System.out.println(s);        
    }
}
