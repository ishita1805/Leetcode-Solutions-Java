package Strings;
import java.util.*;

class ReverseK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //var1
        int k = sc.nextInt(); // var2
        sc.close();
        Stack<Integer> rev = new Stack<Integer>(); // input
        while(n>=0){
            rev.push(sc.nextInt()); 
            n--;
        }
        
        List<Integer> list = new ArrayList<Integer>(); // output
        while(!rev.isEmpty()){
          int x=k-1; //var 3
          List<Integer> sub = new ArrayList<Integer>(); // sub output
          while(x >=0 && !rev.isEmpty()){
              sub.add(0,rev.pop());
              x--;
          }
          list.addAll(sub);
        }
        for(int j:list) System.out.print(j+" "); //var4
    }
}
