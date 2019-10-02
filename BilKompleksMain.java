package tugas2;

/**
 *
 * @author azki0082
 */
public class BilKompleksMain {
    public static void main(String[] args) {
        BilanganKompleks b1 = new BilanganKompleks(0,4);
        BilanganKompleks b2 = new BilanganKompleks(3, -7);
        BilanganKompleks b3 = new BilanganKompleks(7,6);
        BilanganKompleks b4 = new BilanganKompleks(7, 6);
        BilanganKompleks b5 = new BilanganKompleks(0,3);
        BilanganKompleks b6 = new BilanganKompleks(0,3);
        BilanganKompleks b7 = new BilanganKompleks(0,3);
        System.out.print("soal 1    : ");
        b1.info(); b2.info();
        System.out.print("\nhasil     : ");
        BilanganKompleks hasil;
        hasil = b1.Kali1(b2);
        hasil.info();
        System.out.println("\n");
        System.out.print("soal 2    : ");
        b3.info(); b4.info();
        System.out.print("\nhasil     : ");
        BilanganKompleks hasil2;
        hasil2 = b3.Kali1(b4);
        hasil2.info();
        System.out.println("\n");
        System.out.print("soal opsional : ");
        b5.info(); b6.info(); b7.info();
        System.out.print("\nhasil         : ");
        BilanganKompleks hasil3;
        hasil3 = b5.Kali2(b6,b7);
        hasil3.info();
    }
}
