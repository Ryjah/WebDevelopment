import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Input Nilai = ");
        int angka1 = input1.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Batas Bawah = ");
        int angka2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Batas Atas = ");
        int angka3 = input3.nextInt();

        if (angka1>=angka2 && angka1<=angka3) {
            System.out.println(angka1+ " diantara " +angka2+ " dan " +angka3);
        }
        else {
            System.out.println(angka1+ " tidak diantara " +angka2+ " dan " +angka3);
        }
    }
}