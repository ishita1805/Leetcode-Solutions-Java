import java.util.Scanner;

public class Patterns {
    // printing tables of 1 - 20 upto  10
    public static void table(int n) {
        for(int i=1; i<=n;i++){
            System.out.println("Table of: "+i);
            for(int j=1;j<=10;j++){
                System.out.print(j*i+" ");
            }
            System.out.println();
        }
    }

    //  print a box of n x n
    public static void box(int n) {
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
               String a = (j==n)?"*": "* ";
               System.out.print(a);
            }
            System.out.println();
        }
    }

    //  print a triangle of n x n
    //  * 
    //  * *
    //  * * *
    public static void triangle(int n) {
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                String a = (j==i)?"*": "* ";
                System.out.print(a);
            }
            System.out.println();
        }
    }

    //  print an inverted triangle of n x n
    // * * *
    //   * *
    //     *
    public static void inverted_triangle(int n) {
        for(int i=n; i>=1;i--){
            for(int j=1;j<=n;j++){
                String a = (j>n-i)?(j==n?"*":"* "):"  ";
                System.out.print(a);
            }
            System.out.println();
        }
    }

    //  print an inverted triangle of n x n
    // * * *
    // * *
    // *
    public static void inverted_triangle_1(int n) {
        for(int i=1; i<=n;i++){
            for(int j=n;j>=i;j--){
                String a = j==i?"*":"* ";
                System.out.print(a);
            }
            System.out.println();
        }
    }

    //  print an inverted triangle of n x n
    //     *
    //   * *
    // * * *
    public static void inverted_triangle_2(int n) {
        for(int i=n; i>=1;i--){
            for(int j=n;j>=1;j--){
                String a = (j>n-i+1)?"  ":" *";
                System.out.print(a);
            }
            System.out.println();
        }
    }

    // print a n x n triangle
    //   *
    //  * *
    // * * *
    public static void triangle_eqi_1(int n) {
        for(int i=1; i<=n;i++){
        //   for(int j=1;j<n-i+1;j++){
        //       System.out.print(" ");
        //   }
        //   for(int j=1;j<2*i;j++){
        //       String a = j%2==0?" ":"*";
        //       System.out.print(a);
        //   }
        //   for(int j=1;j<n-i+1;j++){
        //     System.out.print(" ");
        // }
        // or 
        for(int j=1;j<2*n+2;j++){
            if(j<n-i) System.out.print(" ");
            else if(j>n-i && j<=n+i) {
                String a;
                if(i%2==0){
                    a = j%2==0?"*":" ";
                    
                }else{
                    a = j%2!=0?"*":" "; 
                }
                System.out.print(a);  
            } else {
                System.out.print(" ");
            }
        }
          System.out.println();
        }
    }

    // print a n x n triangle
    //   1
    //  2 3
    // 4 5 6
    public static void triangle_eqi_2(int n) {
        for(int i=1; i<=n;i++){
          int k = i;
          for(int j=1;j<n-i+1;j++){
              System.out.print(" ");
          }
          for(int j=1;j<2*i;j++){
              String a = j%2==0?" ":""+(k++);
              System.out.print(a);
          }
          for(int j=1;j<n-i+1;j++){
            System.out.print(" ");
        }
          System.out.println();
        }
    }

    // print a n x n triangle
    // if n = 3, then:
    //  * 
    //  * *
    //  * * *
    //  * * 
    //  * 
    public static void triangle_eqi_3(int n) {
        for(int i=1; i<=2*n-1;i++){
        if(i<=n){
            for(int j=1;j<=i;j++){
                String a = (j==n)?"*":"* ";
                System.out.print(a);
            }
        } else {
            for(int j=2*n-i;j>=1;j--){
                String a = "* ";
                System.out.print(a);
            }
        }
          System.out.println();
        }
    }

    // print a n x n triangle
    // if n = 5, then:
    //  * 
    //  * *
    //  *   *
    //  *     * 
    //  *  *  *  *
    public static void triangle_eqi_4(int n) {
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                String a;
                if(i!=n){
                    a = (j==i || j==1)?(j==i)?"*":"* ":"  ";
                }
                else{
                    a = "* ";
                }
                System.out.print(a);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        table(n);
        System.out.println();
        box(n);
        System.out.println();
        triangle(n);
        System.out.println();
        inverted_triangle(n);
        System.out.println();
        inverted_triangle_1(n);
        System.out.println();
        inverted_triangle_2(n);
        System.out.println();
        triangle_eqi_1(n);
        System.out.println();
        triangle_eqi_2(n);
        System.out.println();
        triangle_eqi_3(n);
        System.out.println();
        triangle_eqi_4(n);
    }
}