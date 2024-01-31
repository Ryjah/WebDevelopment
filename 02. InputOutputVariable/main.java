import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input angka = ");
        int angka = input1.nextInt();
        System.out.println("Output angka = " +angka);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Input decimal = ");
        float decimal = input2.nextFloat();
        System.out.println("Output decimal = " +decimal);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Input karakter = ");
        char karakter = input3.next().charAt(0);
        System.out.println("Output karakter = " +karakter);

        Scanner input4 = new Scanner(System.in);
        System.out.println("Input string = ");
        String string = input4.nextLine();
        System.out.println("Output string = " +string);

    }
}
