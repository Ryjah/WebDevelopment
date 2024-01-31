import java.util.Scanner;

public class main {
    public static void main(String[] args){
         
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input Angka = ");
        int n = input1.nextInt();
        
        int i,j;

        for(i = 0 ; i < n; i++){
            for( j = 0; j < n; j++){
                if (i == 0 || j == 0 || i == n -1 || j == n-1) {
                    System.out.print("*");
                    }
                System.out.print(" ");
                }
            System.out.println();
            }
        
    }
}
