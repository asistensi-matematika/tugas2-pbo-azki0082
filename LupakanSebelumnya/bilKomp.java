/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LupakanSebelumnya;

/**
 *
 * @author lenovo
 */
public class bilKomp {
    private int riil;
        private int imajiner;
        public bilKomp(){
            this.riil=0;
            this.imajiner =0;
        }
        public bilKomp(String sb1){
            if (sb1.length()==4){
                String br1 = sb1.substring(0,1);
                String bi1 = sb1.substring(1,3);
                int r1 =Integer.parseInt(br1);
                int i1 = Integer.parseInt(bi1);
                this.riil =r1;
                this.imajiner = i1;
            }
            else if(sb1.length()==2){
                String br1 = sb1.substring(0,1);
                int i1 =Integer.parseInt(br1);
                this.imajiner = i1;
            }
            else if(sb1.length()==6){
                String br1 = sb1.substring(0,2);
                String bi1 = sb1.substring(2,5);
                int r1 =Integer.parseInt(br1);
                int i1 = Integer.parseInt(bi1);
                this.riil =r1;
                this.imajiner = i1;
            }
        }
        public bilKomp Kali1(bilKomp b){
            bilKomp hasil = new bilKomp();
            hasil.riil = (this.riil*b.riil)+(this.imajiner*b.imajiner*(-1));
            hasil.imajiner = (this.riil*b.imajiner)+(this.imajiner*b.riil);
            return hasil;
        }
        public bilKomp Kali2(bilKomp b1, bilKomp b2){
            bilKomp h0;
            h0 = b1.Kali1(b2);
            bilKomp hasil=new bilKomp();
            hasil.riil= (this.riil*h0.riil)+(this.imajiner*h0.imajiner*(-1));
            hasil.imajiner = (this.riil*h0.imajiner)+(this.imajiner*h0.riil);
            return hasil;
        }
        public void info(){
            if (this.riil==0)
            System.out.println(this.imajiner+"i");
        else if (this.imajiner==0)
            System.out.println(this.riil);
        else if (this.riil<0)
            System.out.println(this.riil + this.imajiner+"i");
        else
            System.out.println(this.riil + "+" + this.imajiner+"i");
        }
}
