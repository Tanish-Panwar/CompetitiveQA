import java.util.Scanner;

// Q1. 
class Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<T; i++){
            int P=sc.nextInt(), D=sc.nextInt(), A=sc.nextInt(), B=sc.nextInt(), K=sc.nextInt();

            for (int j = 0; j < K; j++) {
                P += A;
                D += B;
            }
            if (P > D) System.out.println("DIESEL");
            else if(P<D) System.out.println("PETROL");
            else System.out.println("SAME PRICE");
            
        }
        sc.close();
    }

}



// Q2.
class Omega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int x =sc.nextInt(), y = sc.nextInt();
            if (x%2==0) {
                if(x%2==0 && y%2==0) System.out.println("YES");
                else if(x==0 && y%2!=0) System.out.println("NO");
                else System.out.println("YES");
            }else System.out.println("NO");

        }
        sc.close();

    }
}