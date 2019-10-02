
package tugas2;

/**
 *
 * @author azki0082
 */
public class BilanganKompleks {
    private int riil;
    private int imajiner;
    
    public BilanganKompleks(){
        this.riil = 0;
        this.imajiner = 0;
    }
    public BilanganKompleks(int r, int i){
        this.riil = r;
        this.imajiner = i;
    }
    public void setRiil(int r){
        this.riil = r;
    }
    public int getRiil(){
        return this.riil;
    }
    public void setImajiner(int i){
        this.imajiner = i;
    }
    public int getImajiner(){
        return this.imajiner;
    }
    public void info(){//menampilkan bilangan kompleks
        if (getRiil()==0)
            System.out.print("( "+getImajiner()+"i )");
        else if (getImajiner()==0)
            System.out.print("( "+getRiil()+" )");
        else if (getImajiner()<0)
            System.out.print("( "+getRiil() + "+(" + getImajiner()+")i )");
        else
            System.out.print("( "+getRiil() + "+" + getImajiner()+"i )");
    }
    public BilanganKompleks Kali1(BilanganKompleks b){
        BilanganKompleks hslk1 = new BilanganKompleks();
        hslk1.riil = (getRiil()*b.riil)+(getImajiner()*b.imajiner*(-1));
        hslk1.imajiner = (getRiil()*b.imajiner)+(getImajiner()*b.riil);
        return hslk1;
    }
    public BilanganKompleks Kali2(BilanganKompleks b1, BilanganKompleks b2){
        BilanganKompleks hslk1 = new BilanganKompleks();
        hslk1 = b2.Kali1(b1);
        BilanganKompleks hslk2 = new BilanganKompleks();
        hslk2.riil = (hslk1.riil*getRiil())+(hslk1.imajiner*getImajiner()*(-1));
        hslk2.imajiner = (hslk1.riil * getImajiner())+ (hslk1.imajiner * getRiil());
        return hslk2;
    }
}