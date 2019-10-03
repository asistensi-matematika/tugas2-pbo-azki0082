package LupakanSebelumnya;

import java.util.Scanner;

public class BilKompTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. soal utama \n2. soal optional\n pilih : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
            {
                System.out.print("soal :");
                String sb1 = input.next();
                String sb2 = input.next();
                bilKomp bil1 = new bilKomp(sb1);
                bilKomp bil2 = new bilKomp(sb2);
                bilKomp hasil;
                hasil = bil1.Kali(bil2);
                System.out.print("hasil :");
                hasil.info();
                break;
            }
            case 2:
            {
                System.out.print("soal :");
                String sb1  = input.next();
                String sb2 = input.next();
                String sb3 = input.next();
                bilKomp bil1 = new bilKomp(sb1);
                bilKomp bil2 = new bilKomp(sb2);
                bilKomp bil3 = new bilKomp(sb3);
                bilKomp hasil;
                hasil = bil1.Kali(bil2,bil3);
                System.out.print("hasil :");
                hasil.info();
                break;
            }
        }
        
    }
}