import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Angka pertama = ");
        int angka1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Angka kedua = ");
        int angka2 = input2.nextInt();
        
        int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        int pembagian = angka1 / angka2;
        int modulus = angka1 % angka2;

        System.out.println("Hasil penjumlahan = " +penjumlahan);
        System.out.println("Hasil pengurangan = " +pengurangan);
        System.out.println("Hasil perkalian = " +perkalian);
        System.out.println("Hasil pembagian = " +pembagian);
        System.out.println("Hasil modulus = " +modulus);
        
        



    }
}