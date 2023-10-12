package Asdini;

import java.util.Scanner;

public class Days4_inputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama   :");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Kelas  :");
        String kelas = input.nextLine();
        
        System.out.print("Masukkan Nim    :");
        String nim = input.nextLine();
        
        System.out.println("Nama   :"+nama);
        System.out.println("Kelas  :"+kelas);
        System.out.println("Nim    :"+nim);
    }
    
}
