package Asdini;

import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan No Peserta       :");
        String no_peserta = input.nextLine();
        
        
        System.out.print("Masukkan Nama             :");
        String nama = input.nextLine();
        
       
        System.out.print("Masukkan Jenis Kelamin    :");
        String jk = input.nextLine();
        
        System.out.print("Masukkan Umur             :");
        int umur = input.nextInt();
        
        System.out.print("Masukkan Berat Badan      :");
        double bb = input.nextDouble();
        
        System.out.print("Masukkan Status Keaktifan :");
        boolean status_keaktifan = input.nextBoolean();
       
        System.out.println("");
        
        System.out.println("No Peserta    :"+no_peserta);
        System.out.println("Nama          :"+nama);
        System.out.println("Jenis Kelamin :"+jk);
        System.out.println("Umur          :"+umur);
        System.out.println("Berat Badan   :"+bb);
        System.out.println("Aktif         :"+status_keaktifan);
        
    }
    
}
